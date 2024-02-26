package telran.java51.post.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PostNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7145519422896759308L;
	
	public PostNotFoundException() {
		super("Post not found");
	}

	public PostNotFoundException(String postId) {
		super("Post " + postId + " not found");
	}
}
