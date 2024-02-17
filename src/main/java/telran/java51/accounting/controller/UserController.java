package telran.java51.accounting.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java51.accounting.dto.NewRolesDto;
import telran.java51.accounting.dto.RegisterCreateDto;
import telran.java51.accounting.dto.UserRegisterDto;
import telran.java51.accounting.dto.UserUpdateDto;
import telran.java51.accounting.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/{baseUrl}")
public class UserController {

	final UserService userService;

	@PostMapping("/register")
	public UserRegisterDto addNewUser(@RequestBody RegisterCreateDto registerCreateDto) {
		return userService.addNewUser(registerCreateDto);
	}

	@DeleteMapping("/user/{login}")
	public UserRegisterDto removeUser(@PathVariable String login) {
		return userService.removeUser(login);
	}

	@PutMapping("/user/{login}")
	public UserRegisterDto updateUser(@PathVariable String login, @RequestBody UserUpdateDto userUpdateDto) {
		return userService.updateUser(login, userUpdateDto);
	}

	@PutMapping("/user/{login}/role/{role}")
	public NewRolesDto addRole(@PathVariable String login, @PathVariable String role) {
		return userService.addRole(login, role);
	}

	@DeleteMapping("/user/{login}/role/{role}")
	public NewRolesDto removeRole(@PathVariable String login, @PathVariable String role) {
		return userService.removeRole(login, role);
	}

	@GetMapping("/user/{login}")
	public UserRegisterDto getUser(@PathVariable String login) {
		return userService.getUser(login);
	}

}
