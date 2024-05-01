package ir.montazer.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ir.montazer.manager.service.PostInfoService;
import ir.montazer.manager.entities.PostInfo;
import ir.montazer.manager.entities.PostInfoDTO;
import ir.montazer.manager.entities.RequestForFilter;

@RestController
public class PostInfoController {
	
	private final PostInfoService postInfoService;
	
	@Autowired
	public PostInfoController(PostInfoService postInfoService) {
		this.postInfoService = postInfoService;
	}

	@PostMapping(value = "/savePostInfo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Long savePostInfo(PostInfo postInfo) {
		return postInfoService.savePostInfo(postInfo);
	}
	
	@PostMapping(value = "/filterPosts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PostInfoDTO>> filterPosts(@RequestBody RequestForFilter requestForFilter) {
		List<PostInfoDTO> result = postInfoService.filterPosts(requestForFilter);

		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
}
