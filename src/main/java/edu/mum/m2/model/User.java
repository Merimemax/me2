package edu.mum.m2.model;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@OneToOne(fetch=FetchType.EAGER,  cascade = CascadeType.ALL) 
 	@JoinColumn(name="credentialId") 
 	UserCredentials userCredentials;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}
	
	

}
