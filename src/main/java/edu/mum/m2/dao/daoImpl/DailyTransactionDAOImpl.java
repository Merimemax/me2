package edu.mum.m2.dao.daoImpl;


import edu.mum.m2.dao.DailyTransactionDAO;
import edu.mum.m2.model.DailyTransaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@SuppressWarnings("unchecked")
@Repository
public class DailyTransactionDAOImpl extends GenericDAOImpl<DailyTransaction> implements DailyTransactionDAO {

	public DailyTransactionDAOImpl() {
		super.setDaoType(DailyTransaction.class);
	}

	@Override
	public List<DailyTransaction> getDailyTransactionByAccount(String accountNum) {
		Query query = entityManager.createQuery("select dt from DailyTransaction dt where dt.Account.accountNo = :accountNum");
		return (List<DailyTransaction>)query.setParameter("accountNum", accountNum).getResultList();
	}
	
	@Override
	public List<DailyTransaction> getDailyTransactionByClient(String clientNum) {
		Query query = entityManager
				.createQuery("select c from Client c where c.clientNo = :clientNum" );
		return (List<DailyTransaction>)query.setParameter("clientNum", clientNum).getResultList() ;
	}

	@Override
	public List<DailyTransaction> getDailyTransactionByMonth(String accountNum) {
		
		Query query = entityManager
				.createQuery("select dt from DailyTransaction dt where dt.Account.accountNo = :accountNum ");
				
		return (List<DailyTransaction>)query.setParameter("accountNum", accountNum).getResultList();
	}
}
