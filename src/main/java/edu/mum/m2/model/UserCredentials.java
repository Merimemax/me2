package edu.mum.m2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

@Entity(name = "CREDENTIALS")
public class UserCredentials {

	@Size(min = 5, max = 50, message = "{username}")
	@Id
	@Column(nullable = false, unique = true)
    String username;
	String password;

	@Transient
    String verifyPassword;

	Boolean enabled;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public boolean equals(Object obj) {
		if (obj instanceof UserCredentials) {
			UserCredentials userCredentials = (UserCredentials) obj;
			if (this.username.equals(userCredentials.getUsername()))
				return true;
		}
		return false;
	}

	public int hashCode() {
		return this.username.hashCode();
	}
}
