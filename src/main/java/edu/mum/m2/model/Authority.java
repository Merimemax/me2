package edu.mum.m2.model;

import javax.persistence.*;

@Entity
public class Authority {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

   	@Column(nullable = false)
 	private String authority;
 	
	 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

 	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
 
 	
}
