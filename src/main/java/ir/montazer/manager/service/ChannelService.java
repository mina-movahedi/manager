package ir.montazer.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ir.montazer.manager.entities.Channel;
import ir.montazer.manager.repository.ChannelRepository;

@Service
public class ChannelService {
	
	private final ChannelRepository channelRepository;
	
	@Autowired
	public ChannelService(ChannelRepository channelRepository) {
		this.channelRepository = channelRepository;
	}
	
	public Long save(Channel channel) {
		 System.out.println("===>>> channel In service:  ");
		 System.out.println(channel);
		return channelRepository.save(channel).getId();
	}

}
