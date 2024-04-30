package ir.montazer.manager.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.ElementCollection;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Data
public class Channel {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "CHANNEL_TYPE")
	private ChannelType channelType;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "CHANNEL_TARIFF")  
	private ChannelTariff channelTariff;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "TARIFF_TYPE")  
	private TariffType tariffType;

	@ManyToMany
//	@JoinTable(
//	  name = "MEMBERS", 
//	  joinColumns = @JoinColumn(name = "CHANNELS"), 
//	  inverseJoinColumns = @JoinColumn(name = "MEMBERS"))
	private Set<Member> members = new HashSet<Member>();
	
	@Column(name = "CHANNEL_24_VIEW")
	private String channel24View;
	
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection(targetClass = ChannelGroup.class)
	@Column(name = "CHANNEL_GROUP")
	private List<ChannelGroup> channelGroup = new ArrayList<>();
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "CHANNEL_THEME")
	private ChannelTheme channelTheme;
	
	@Column(name = "CHANNEL_BILL") 
	private Long channelBill;
	
	@Column(name = "VIEW_BASE_BILL") 
	private Long viewBaseBill;
	
	@Column(name = "ADVERTISEMENT_LAST_DATE")
	private Date advertisementLastDate;
	
	@Column(name = "LAST_POST_NAME")
	private String LastPostName;
	
	@Column(name = "POST_INSERTION_TIME_INTERVAL")
	private String postInsertionTimeInterval;
	
}
