package edu.mum.m2.dao.daoImpl;


import edu.mum.m2.dao.MonthlyStatmentDAO;
import edu.mum.m2.model.MonthlyStatment;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class MonthlyStatmentDAOImpl extends GenericDAOImpl<MonthlyStatment> implements MonthlyStatmentDAO {

	public MonthlyStatmentDAOImpl() {
		super.setDaoType(MonthlyStatment.class);
	}

	@Override
	public MonthlyStatment findByAccount(String accountNum) {
		Query query = entityManager
			.createQuery("select ms from  MonthlyStatment ms where ms.accountNo = :accountNum" );
		
		return (MonthlyStatment)query.setParameter("accountNum", accountNum).getSingleResult();
	}

	@Override
	public MonthlyStatment findByMonth(String month) {
		Query query = entityManager
				.createQuery("select ms from  MonthlyStatment ms where ms.forMonth= :forMonth" );
		return (MonthlyStatment)query.setParameter("month", month).getSingleResult();
	}
}
