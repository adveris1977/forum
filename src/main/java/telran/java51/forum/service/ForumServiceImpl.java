package telran.java51.forum.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.java51.forum.dao.ForumRepository;
import telran.java51.forum.dto.ForumCommentDto;
import telran.java51.forum.dto.ForumCreateDto;
import telran.java51.forum.dto.ForumDto;
import telran.java51.forum.dto.PeriodDto;
import telran.java51.forum.dto.exceptions.ForumNotFoundException;
import telran.java51.forum.model.Post;

@Service
@RequiredArgsConstructor
public class ForumServiceImpl implements ForumService {

	final ForumRepository forumRepository;
	final ModelMapper modelMapper;

	@Override
	public ForumDto addPost(String author, ForumCreateDto forumCreateDto) {
		Post post = forumRepository.findByAuthor(author);
		post.setTitle(forumCreateDto.getTitle());
		post.setContent(forumCreateDto.getContent());
		post.addTags(forumCreateDto.getTags());
		forumRepository.save(post);
		return modelMapper.map(post, ForumDto.class);
		
				
	}

	@Override
	public ForumDto findPostById(String id) {
		Post post = forumRepository.findById(id).orElseThrow(ForumNotFoundException::new);
		return modelMapper.map(post, ForumDto.class);
	}

	@Override
	public void addLike(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ForumDto> findPostsByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ForumDto addComment(String author, String id, ForumCommentDto forumCommentDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ForumDto deletePost(String id) {
//		Post post = forumRepository.findById(id).orElseThrow(ForumNotFoundException::new);
		return null;
	}

	@Override
	public List<ForumDto> findPostsByTags(List<String> tags) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ForumDto> findPostsByPeriod(PeriodDto periodDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ForumDto updatePost(String id, ForumCreateDto forumCreateDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
