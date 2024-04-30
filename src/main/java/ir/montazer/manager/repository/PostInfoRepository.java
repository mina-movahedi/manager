package ir.montazer.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ir.montazer.manager.entities.PostInfo;
import ir.montazer.manager.entities.PostInfoDTO;


@Repository
public interface PostInfoRepository extends CrudRepository<PostInfo, Long> {
	
	@Query("SELECT p.senderFullName FROM PostInfo p")
	List<String> findAllSenders();
		
	@Query(value = "SELECT pi.sender_full_name, pi.post_name, pi.channel_id, pi.creation_time "
			  + " from Channel ch join post_info pi on pi.channel_id = ch.id"
			  + " join channel_channel_group ccg on ch.id = ccg.channel_id"
			  + " where pi.sender_full_name IN :sender_full_name "
			  + " and ch.channel_type IN :channel_type"
			  + " and ch.tariff_type IN :tariff_type "
			  + " and ch.channel_tariff IN :channel_tariff "
			  + " and ccg.channel_group IN :channel_group "
			  + " and ch.channel_theme IN :channel_theme "
			  , nativeQuery = true)
	List<PostInfoDTO> filterPosts(
			@Param("sender_full_name") List<String> sender_full_name, 
			@Param("channel_type") List<Integer> channel_type,
			@Param("tariff_type") List<Integer> tariff_type,
			@Param("channel_tariff") List<Integer> channel_tariff,
			@Param("channel_group") List<Integer> channel_group,
			@Param("channel_theme") List<Integer> channel_theme);
}
