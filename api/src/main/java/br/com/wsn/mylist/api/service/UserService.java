package br.com.wsn.mylist.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.wsn.mylist.api.data.model.User;
import br.com.wsn.mylist.api.data.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> list() {
		List<User> userList = userRepository.findAll();
		
		return userList;
	}
	
	public User insert(User user) {
		User user1 =  userRepository.save(user);
		return user1;
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}

	public User update(Long id, User user) {
		Optional<User> userOptional =  userRepository.findById(id);
		if (userOptional.isPresent()) {
			User userLocal = userOptional.get();
			userLocal.setName(user.getName());
			userLocal.setEmail(user.getEmail());
			User user1 =  userRepository.save(userLocal);
			return user1;
		}
		return null;
	}
}
