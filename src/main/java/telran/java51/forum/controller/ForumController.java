package telran.java51.forum.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java51.forum.dto.ForumCommentDto;
import telran.java51.forum.dto.ForumCreateDto;
import telran.java51.forum.dto.ForumDto;
import telran.java51.forum.dto.PeriodDto;
import telran.java51.forum.service.ForumService;

@RestController
@RequiredArgsConstructor
public class ForumController {
	
	final ForumService forumService;

	@PostMapping("/forum/post/{user}")
	public ForumDto addPost(@PathVariable("user") String author, @RequestBody ForumCreateDto forumCreateDto) {
		return forumService.addPost(author, forumCreateDto);
	}

	@GetMapping("/forum/post/{postId}")
	public ForumDto findPostById(@PathVariable("postId") String id) {
		return forumService.findPostById(id);
	}

	@PutMapping("/forum/post/{postId}/like")
	public void addLike(@PathVariable("postId") String id) {
		forumService.addLike(id);
		
	}

	@GetMapping("/forum/posts/author/{user}")
	public List<ForumDto> findPostsByAuthor(@PathVariable("user") String author) {
		return forumService.findPostsByAuthor(author);
	}

	@PutMapping("/forum/post/{postId}/comment/{user}")
	public ForumDto addComment(@PathVariable("user") String author, @PathVariable("postId") String id, @RequestBody ForumCommentDto forumCommentDto) {
		return forumService.addComment(author, id, forumCommentDto);
	}

	@DeleteMapping("/forum/post/{postId}")
	public ForumDto deletePost(@PathVariable("postId") String id) {
		return forumService.deletePost(id);
	}

	@PostMapping("/forum/posts/tags")
	public List<ForumDto> findPostsByTags(List<String> tags) {
		return forumService.findPostsByTags(tags);
	}

	@PostMapping("/forum/posts/period")
	public List<ForumDto> findPostsByPeriod(@RequestBody PeriodDto periodDto) {
		return forumService.findPostsByPeriod(periodDto);
	}

	@PutMapping("/forum/post/{postId}")
	public ForumDto updatePost(@PathVariable("postId") String id,@RequestBody ForumCreateDto forumCreateDto) {
		return forumService.updatePost(id, forumCreateDto);
	}

}
