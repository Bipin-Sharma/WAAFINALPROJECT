package com.packt.project.service;

import java.util.List;

import com.packt.project.domain.Credentials;

public interface CredentialsService {
	
	public void save(Credentials credentials);
	public List<Credentials> findAll();
}
