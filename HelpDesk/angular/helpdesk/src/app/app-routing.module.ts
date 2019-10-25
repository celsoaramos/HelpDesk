import { UserListComponent } from './components/user-list/user-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AuthGuard } from './components/security/auth.guard';
import { LoginComponent } from './components/security/login/login.component';
import { UserNewComponent } from './components/user-new/user-new.component';

const routes: Routes = [  
  { path : '', component: HomeComponent, canActivate: [AuthGuard] },
  { path : 'login', component: LoginComponent },
  { path : 'user-new', component: UserNewComponent, canActivate: [AuthGuard] },
  { path : 'user-new/:id', component: UserNewComponent, canActivate: [AuthGuard] },
  { path : 'user-list', component: UserListComponent, canActivate: [AuthGuard] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
