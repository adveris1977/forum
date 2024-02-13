package telran.java51.forum.service;

import java.util.List;

import telran.java51.forum.dto.ForumCommentDto;
import telran.java51.forum.dto.ForumCreateDto;
import telran.java51.forum.dto.ForumDto;
import telran.java51.forum.dto.PeriodDto;

public interface ForumService {
	ForumDto addPost(String author, ForumCreateDto forumCreateDto);

	ForumDto findPostById(String id);

	void addLike(String id);

	List<ForumDto> findPostsByAuthor(String author);

	ForumDto addComment(String author, String id, ForumCommentDto forumCommentDto);
	
	ForumDto deletePost(String id);
	
	List<ForumDto> findPostsByTags(List<String> tags);
	
	List<ForumDto> findPostsByPeriod(PeriodDto periodDto);
	
	ForumDto updatePost(String id, ForumCreateDto forumCreateDto);

}
