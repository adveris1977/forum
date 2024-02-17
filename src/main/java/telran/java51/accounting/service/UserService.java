package telran.java51.accounting.service;

import telran.java51.accounting.dto.NewRolesDto;
import telran.java51.accounting.dto.RegisterCreateDto;
import telran.java51.accounting.dto.UserRegisterDto;
import telran.java51.accounting.dto.UserUpdateDto;

public interface UserService {
	
UserRegisterDto addNewUser(RegisterCreateDto registerCreateDto);
	
	UserRegisterDto removeUser(String user);
	
	UserRegisterDto updateUser(String user, UserUpdateDto userUpdateDto);
	
	NewRolesDto addRole(String user, String role);
	
	NewRolesDto removeRole(String user, String role);
	
	UserRegisterDto getUser(String user);

}
