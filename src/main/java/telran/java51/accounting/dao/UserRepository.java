package telran.java51.accounting.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import telran.java51.accounting.model.User;


public interface UserRepository extends CrudRepository<User, String>{
	
	@Query("{'login' : ?0}")
	User findUserByLogin(String login);

}
