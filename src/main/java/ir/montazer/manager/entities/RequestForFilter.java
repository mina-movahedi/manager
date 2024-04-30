package ir.montazer.manager.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class RequestForFilter {

	private Long id;
	
	private String name;
	
	private short channelType;
	 
	private short channelTariff;
 
	private short tariffType;

	private String channel24View;
	
	private List<Short> channelGroup = new ArrayList<>();
	
	private short channelTheme;

	private Long channelBill;

	private Long viewBaseBill;

	private Date advertisementLastDate;

	private String LastPostName;

	private String postInsertionTimeInterval;
	
}
