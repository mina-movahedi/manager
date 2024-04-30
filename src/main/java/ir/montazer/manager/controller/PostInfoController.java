package ir.montazer.manager.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ir.montazer.manager.service.PostInfoService;
import ir.montazer.manager.entities.PostInfo;
import ir.montazer.manager.entities.PostInfoDTO;
import ir.montazer.manager.repository.PostInfoRepository;

@RestController
public class PostInfoController {
	
	private final PostInfoService postInfoService;
	private final PostInfoRepository postInfoRepository;
	
	@Autowired
	public PostInfoController(PostInfoService postInfoService, PostInfoRepository postInfoRepository) {
		this.postInfoService = postInfoService;
		this.postInfoRepository = postInfoRepository;
	}

	@PostMapping(value = "/savePostInfo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Long savePostInfo(PostInfo postInfo) {
		return postInfoService.savePostInfo(postInfo);
	}
	
	@PostMapping(value = "/filterPosts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void filterPosts() {
//		List<String> senderFullName = Arrays.asList("Mina", "Mimi");
//		List<Integer> channel_type = Arrays.asList(1,2);
//		List<Integer> tariff_type = Arrays.asList(1,2);
//		List<Integer> channel_tariff = Arrays.asList(1,2);
//		List<Integer> channel_group = Arrays.asList(1,2);
//		List<Integer> channel_theme = Arrays.asList(1,2);
//		List<PostInfoDTO> result = postInfoRepository.filterPosts(senderFullName,channel_type, tariff_type, channel_tariff, channel_group, channel_theme);
//		System.out.println("====>>>  result:  ");
//		System.out.println(result);
	}
	
}
