package edu.mum.m2.business.service.impl;


import edu.mum.m2.dao.GroupDAO;
import edu.mum.m2.model.Groups;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.m2.service.GroupService;

import java.util.List;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupDAO groupDAO;

	public void save(Groups group) {
		groupDAO.save(group);
	}

	public Groups update(Groups group) {
		return groupDAO.update(group);
	}

	public List<Groups> findAll() {
		return (List<Groups>) groupDAO.findAll();
	}

}
