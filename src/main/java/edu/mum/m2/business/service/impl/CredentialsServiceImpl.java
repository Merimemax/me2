package edu.mum.m2.business.service.impl;

import edu.mum.m2.dao.CredentialsDAO;
import edu.mum.m2.model.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.mum.m2.service.CredentialsService;

import java.util.List;

@Service
@Transactional
public class CredentialsServiceImpl implements CredentialsService {

	@Autowired
	private CredentialsDAO credentialsDAO;

//  	@PreAuthorize("hasRole('ADMIN')")
	public void save(UserCredentials credentials) {

		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(credentials.getPassword());
		credentials.setPassword(encodedPassword);

		credentialsDAO.save(credentials);
	}

	public List<UserCredentials> findAll() {
		return (List<UserCredentials>) credentialsDAO.findAll();
	}

	public UserCredentials getByUsername(String name) {
		return credentialsDAO.getByUsername(name);
	}

}
