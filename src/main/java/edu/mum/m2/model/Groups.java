package edu.mum.m2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity()
@Table(name="Groups")
public class Groups {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	String group_name;
	
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    List<Authority> authority = new ArrayList<Authority>();

    @ManyToMany(fetch = FetchType.EAGER)
    List<UserCredentials> userCredentials = new ArrayList<UserCredentials>();


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public List<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(List<Authority> authority) {
		this.authority = authority;
	}

	public List<UserCredentials> getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(List<UserCredentials> userCredentials) {
		this.userCredentials = userCredentials;
	}
	

}
