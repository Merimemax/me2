package edu.mum.m2.service;

import edu.mum.m2.model.Groups;

import java.util.List;

public interface GroupService {

	public void save(Groups group);
	public Groups update(Groups group);
	public List<Groups> findAll();
 }
