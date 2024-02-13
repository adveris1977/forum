package telran.java51.forum.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@EqualsAndHashCode(of = "id")
@Document(collection = "forum")
@NoArgsConstructor
public class Post {
	@Id
	String id;
	@Setter
	String title;
	@Setter
	String content;
	@Setter
	String author;
	@Setter
	LocalDateTime dateCreated;
	List<String> tags = new ArrayList<String>();
	@Setter
	Integer likes;
	List<String> comments = new ArrayList<String>();

	public Post(String id, String title, String content, String author, LocalDateTime dateCreated, List<String> tags,
			Integer likes, List< String> comments) {

		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
		dateCreated = LocalDateTime.now();
		this.likes = likes;
		
	}

	public boolean addTags(List<String> tags) {
		return tags.addAll(tags);
	}

	public boolean addComments(String user, String message, LocalDateTime dateCreated, String likes) {
		comments.add(user);
		comments.add(message);
		comments.add(dateCreated.toString());
		comments.add(likes.toString());
		return comments == null;
	}

}
