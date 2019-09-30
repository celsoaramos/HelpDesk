package br.com.br.help.desk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.br.help.desk.api.entity.User;


public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
	
	void deleteById(String id);
}
