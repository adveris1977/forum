package telran.java51.forum.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ForumCreateDto {
	String title;
	String content;
	List<String> tags;

}
