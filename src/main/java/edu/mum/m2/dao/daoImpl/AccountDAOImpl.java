package edu.mum.m2.dao.daoImpl;



import edu.mum.m2.dao.AccountDAO;
import edu.mum.m2.model.Account;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class AccountDAOImpl extends GenericDAOImpl<Account> implements AccountDAO {

	public AccountDAOImpl() {
		
		super.setDaoType(Account.class);
		
	}


	@Override
	public Account findByClient(String clientNo) {
		Query query = entityManager
				.createQuery("select act from Account act where act.client.clientNo = :clientNo" );
		return  (Account) query.setParameter("clientNo", clientNo).getSingleResult();
		
	}

	
}
