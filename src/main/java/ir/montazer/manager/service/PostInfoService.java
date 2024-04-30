package ir.montazer.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ir.montazer.manager.entities.PostInfo;
import ir.montazer.manager.repository.PostInfoRepository;

@Service
public class PostInfoService {

	private final PostInfoRepository postInfoRepository;
	
	@Autowired
	public PostInfoService(PostInfoRepository postInfoRepository) {
		this.postInfoRepository = postInfoRepository;
	}
	public Long savePostInfo(PostInfo postInfo) {
		return postInfoRepository.save(postInfo).getId();
	}
	
}
