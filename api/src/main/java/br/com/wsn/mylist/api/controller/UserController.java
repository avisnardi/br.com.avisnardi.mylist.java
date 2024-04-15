package br.com.wsn.mylist.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wsn.mylist.api.data.model.User;
import br.com.wsn.mylist.api.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<User> list() {
		List<User> userList = userService.list();
		return userList;
	}
	
	@PostMapping
	public User insert(@RequestBody @Valid UserForm user) {
		User userRet = userService.insert(user.toUser());
		return userRet;
	}
	
	@PutMapping("/{id}")
	public User update(@PathVariable Long id, @RequestBody @Valid UserForm user) {
		User userRet = userService.update(id, user.toUser());
		return userRet;
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userService.delete(id);
	}
}
