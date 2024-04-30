package ir.montazer.manager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ir.montazer.manager.entities.Channel;


@Repository
public interface ChannelRepository  extends CrudRepository<Channel, Long> {
	
	

}
