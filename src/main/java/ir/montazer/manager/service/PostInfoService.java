package ir.montazer.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ir.montazer.manager.entities.PostInfo;
import ir.montazer.manager.entities.PostInfoDTO;
import ir.montazer.manager.entities.RequestForFilter;
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
	
	public List<PostInfoDTO> filterPosts(RequestForFilter reqFilter) {
		return postInfoRepository.filterPosts(
				reqFilter.getSenderFullName(),
				reqFilter.getChannelType(), 
				reqFilter.getTariffType(), 
				reqFilter.getChannelTariff(), 
				reqFilter.getChannelGroup(), 
				reqFilter.getChannelTheme());
	}
	
}
