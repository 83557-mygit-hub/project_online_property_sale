package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.app.entities.Login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Signup {
	@JsonProperty(access = Access.READ_ONLY) // this property only used during ser.
	private Long id;
	@NotBlank(message = "First Name required")

	@Email(message = "Invalid Email!!!")
	private String email;
	private String password;
	private Login role_id;
	boolean status;
	public Signup(Long id, @NotBlank(message = "First Name required") @Email(message = "Invalid Email!!!") String email,
			String password, Login role_id, boolean status) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.role_id = role_id;
		this.status = status;
	}
	
	
	
	
}

