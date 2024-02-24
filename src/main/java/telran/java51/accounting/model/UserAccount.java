package telran.java51.accounting.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import telran.java51.accounting.enumType.RolesType;

@Getter
@Document(collection = "users")
public class UserAccount {
	@Id
	String login;
	@Setter
	String password;
	@Setter
	String firstName;
	@Setter
	String lastName;
	Set<RolesType> roles;
	
	public UserAccount() {
		roles = new HashSet<>();
		roles.add(RolesType.USER);
	}

	public UserAccount(String login, String password, String firstName, String lastName) {
		this();
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public boolean addRole(RolesType role) {
		return roles.add(role);
	}

	public boolean removeRole(RolesType role) {
		return roles.remove(role);
	}

}
