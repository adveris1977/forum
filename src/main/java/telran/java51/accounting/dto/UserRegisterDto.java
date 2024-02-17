package telran.java51.accounting.dto;

import java.util.Set;

import lombok.Getter;

@Getter
public class UserRegisterDto {
	
	String login;
    String firstName;
    String lastName;
    Set<String> roles;

}
