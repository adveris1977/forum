package telran.java51.forum.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ForumDto {
	
	String id;
	String title;
	String content;
	String author;
	LocalDateTime dateCreated;
	List<String> tags;
	Integer likes;
	List<String> comments;

}
