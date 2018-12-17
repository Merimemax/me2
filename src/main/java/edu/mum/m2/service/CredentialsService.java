package edu.mum.m2.service;


import edu.mum.m2.model.UserCredentials;

import java.util.List;

public interface CredentialsService {

	public void save(UserCredentials credentials);
	public List<UserCredentials> findAll();
	public UserCredentials getByUsername(String name);

 }
