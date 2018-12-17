package edu.mum.m2.business.service.impl;

import edu.mum.m2.dao.ClientDAO;
import edu.mum.m2.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.m2.service.ClientService;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO clientDAO;

	@Override
	public Client findByID(Long id) {
		
		return clientDAO.findOne(id);
	}

	@Override
	public List<Client> findAll() {
		
		return (List<Client>) clientDAO.findAll();
	}

	@Override
	public void save(Client client) {
		
		clientDAO.save(client);
		
	}

	

}
