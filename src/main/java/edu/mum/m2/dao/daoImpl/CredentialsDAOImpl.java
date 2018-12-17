package edu.mum.m2.dao.daoImpl;


import edu.mum.m2.dao.CredentialsDAO;
import edu.mum.m2.model.UserCredentials;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class CredentialsDAOImpl extends GenericDAOImpl<UserCredentials> implements CredentialsDAO {

	public CredentialsDAOImpl() {
		super.setDaoType(UserCredentials.class);
	}

	@Override
	public UserCredentials getByUsername(String name) {
		Query query = entityManager.createQuery("select u from  CREDENTIALS u where u.username = :name");

		return (UserCredentials) query.setParameter("name", name).getSingleResult();

	}
}