package edu.mum.m2.dao.daoImpl;

import edu.mum.m2.dao.GroupDAO;
import edu.mum.m2.model.Groups;
import org.springframework.stereotype.Repository;


@Repository
public class GroupDAOImpl extends GenericDAOImpl<Groups> implements GroupDAO {

	public GroupDAOImpl() {
		super.setDaoType(Groups.class );
		}

 
 }