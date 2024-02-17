package telran.java51.accounting.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.java51.accounting.dao.UserRepository;
import telran.java51.accounting.dto.NewRolesDto;
import telran.java51.accounting.dto.RegisterCreateDto;
import telran.java51.accounting.dto.UserRegisterDto;
import telran.java51.accounting.dto.UserUpdateDto;
import telran.java51.accounting.model.User;
import telran.java51.post.dto.exceptions.PostNotFoundException;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	final UserRepository userRepository;
	final ModelMapper modelMapper;

	@Override
	public UserRegisterDto addNewUser(RegisterCreateDto registerCreateDto) {
		User user = modelMapper.map(registerCreateDto, User.class);
		user.addRole("USER");
		user = userRepository.save(user);
		return modelMapper.map(user, UserRegisterDto.class);
	}

	@Override
	public UserRegisterDto removeUser(String login) {

		User user = userRepository.findUserByLogin(login);
		userRepository.delete(user);
		return modelMapper.map(user, UserRegisterDto.class);
	}

	@Override
	public UserRegisterDto updateUser(String login, UserUpdateDto userUpdateDto) {
		User user = userRepository.findUserByLogin(login);
		String firstName = userUpdateDto.getFirstName();
		if (firstName != null) {
			user.setFirstName(firstName);
		}
		String lastName = userUpdateDto.getLastName();
		if (lastName != null) {
			user.setLastName(lastName);
		}
		userRepository.save(user);
		return modelMapper.map(user, UserRegisterDto.class);

	}

	@Override
	public NewRolesDto addRole(String login, String role) {
		User user = userRepository.findUserByLogin(login);
		user.addRole(role);
		userRepository.save(user);
		return modelMapper.map(user, NewRolesDto.class);
	}

	@Override
	public NewRolesDto removeRole(String login, String role) {
		User user = userRepository.findUserByLogin(login);
		user.removeRole(role);
		userRepository.save(user);
		return modelMapper.map(user, NewRolesDto.class);
	}

	@Override
	public UserRegisterDto getUser(String login) {
		User user = userRepository.findUserByLogin(login);
		return modelMapper.map(user, UserRegisterDto.class);
	}

}
