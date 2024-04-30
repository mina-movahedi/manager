package ir.montazer.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ir.montazer.manager.entities.Channel;
import ir.montazer.manager.service.ChannelService;


@RestController
public class ChannelController {
	
	private final ChannelService channelService;
	
	@Autowired
	public ChannelController(ChannelService channelService) {
		this.channelService = channelService;
	}

	 @PostMapping(value = "/saveChannel", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Long saveChannel(@RequestBody Channel channel) {
		 System.out.println("===>>> channel in controller:  ");
		 System.out.println(channel);
        return channelService.save(channel);
    }

}
