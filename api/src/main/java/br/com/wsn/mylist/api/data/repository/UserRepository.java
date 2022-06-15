package br.com.wsn.mylist.api.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.wsn.mylist.api.data.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	List<User> findAll();

}
