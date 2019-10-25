import { SharedService } from './../../services/shared.service';
import { HttpInterceptor } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

    shared: SharedService;

    constructor() {
        this.shared = SharedService.getInstance();
    }

    intercept(req: import("@angular/common/http").HttpRequest<any>, next: import("@angular/common/http").HttpHandler): import("rxjs").Observable<import("@angular/common/http").HttpEvent<any>> {
       let authRequest: any;

       if (this.shared.isLoggedIn()) {
           authRequest = req.clone({
               setHeaders: {
                   'Authorization': this.shared.token
               }
           });

           return next.handle(authRequest);
       } else {
           return next.handle(req);
       }
    }

}