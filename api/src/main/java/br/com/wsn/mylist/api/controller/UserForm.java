package br.com.wsn.mylist.api.controller;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.wsn.mylist.api.data.model.User;


public class UserForm {

	@NotNull @NotEmpty @Length(min = 2)
	private String name;
	
	@NotNull @NotEmpty
	private String email;
	
	public UserForm(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	protected User toUser() {
		return new User(name, email);
	}
	
}
