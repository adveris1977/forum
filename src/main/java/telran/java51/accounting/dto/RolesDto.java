package telran.java51.accounting.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import telran.java51.accounting.enumType.RolesType;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RolesDto {
	String login;
	@Singular
	Set<RolesType> roles;
}
