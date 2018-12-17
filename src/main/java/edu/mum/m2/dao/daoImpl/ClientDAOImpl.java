package edu.mum.m2.dao.daoImpl;


import edu.mum.m2.dao.ClientDAO;
import edu.mum.m2.model.Client;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDAOImpl extends GenericDAOImpl<Client> implements ClientDAO {

	public ClientDAOImpl() {
		super.setDaoType(Client.class);
	}
	
	

	
}
