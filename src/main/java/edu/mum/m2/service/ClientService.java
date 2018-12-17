package edu.mum.m2.service;

import edu.mum.m2.model.Client;
import java.util.List;

public interface ClientService {
	
	public Client findByID(Long id);
	
	public List<Client> findAll();
	
	public void save(Client client);
	
	
	

}
