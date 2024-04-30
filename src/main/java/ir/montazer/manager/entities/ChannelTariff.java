package ir.montazer.manager.entities;

import lombok.Getter;

@Getter
public enum ChannelTariff {

	NIGHTLY_POST1(0),
	NIGHTLY_POST2(1),
	NIGHTLY_POST3(2),
	NIGHTLY_LAST_POST(3),
	FREE_POST_24_HOURS(4),
	FREE_POST_48_HOURS(5),
	ALL(6);
	
	private int value;
	private ChannelTariff(int value) {
        this.value = value;
    }
	
}
