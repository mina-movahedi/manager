package ir.montazer.manager.entities;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class PostInfo {

	@Id
	@Column(name = "ID")
	private Long id;

	@Column(name = "SENDER_FULL_NAME")
	private String senderFullName;

    // I guess the following field must be added to what you had been sent for me.
	@Column(name = "POST_NAME")
	private String postName;
	
	@ManyToOne
    @JoinColumn(name="CHANNEL_ID", nullable=false)
	private Channel channel;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_TIME")
	private Date endTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_TIME")
	private Date startTime;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ADVERTISEMENT_LAST_DATE")
	private Date advertisementLastDate;
	
	@Column(name = "LAST_POST_NAME")
	private String LastPostName;
	
	@CreationTimestamp
	@Column(name = "CREATION_TIME")
	private Date creationTime;
	
}
