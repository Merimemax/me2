package edu.mum.m2.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column()
	private String firstName;
	
	public String getClientNo() {
		return clientNo;
	}

	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}

	@Column()
	private String clientNo;

	@Column()
	private String lastName;
	
	@Column()
	private String email;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
	private Set<Account> accountList;

	public Client() {}

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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(Set<Account> accountList) {
		this.accountList = accountList;
	}

}
