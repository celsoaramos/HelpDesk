package br.com.br.help.desk.api.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.br.help.desk.api.enums.ProfileEnum;

@Document
public class User {

	@Id
	private String id;
	
	@Indexed (unique = true)
	@NotBlank(message = "Por favor, digite seu email")
	@Email(message = "Por favor, digite um email válido" )
	private String email;
	
	@NotBlank(message = "Por favor, digite sua senha" )
	@Size (min = 6)
	private String password;
	
	private ProfileEnum profile;
	
	
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ProfileEnum getProfile() {
		return profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}
	
	
	
}
