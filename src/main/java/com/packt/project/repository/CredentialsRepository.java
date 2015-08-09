package com.packt.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.packt.project.domain.Credentials;

@Repository
public interface CredentialsRepository extends CrudRepository<Credentials, String> {

}
