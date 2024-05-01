package ir.montazer.manager.entities;

import java.util.List;
import lombok.Data;

@Data
public class RequestForFilter {

	List<String> senderFullName;
	List<Short> channelType;
	List<Short> tariffType;
	List<Short> channelTariff; 
	List<Short> channelGroup;
	List<Short> channelTheme;
}

