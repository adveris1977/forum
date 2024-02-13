package telran.java51.forum.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ForumNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7145519422896759308L;

}
