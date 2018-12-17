package edu.mum.m2.dao;


import edu.mum.m2.model.UserCredentials;

public interface CredentialsDAO extends GenericDAO<UserCredentials> {

	public UserCredentials getByUsername(String name);
}
