package ir.montazer.manager.entities;

import lombok.Getter;

@Getter
public enum ChannelGroup {
	ALL(0),
	RELIGION(1),
	REVOLUSIONARY(2),
	NEWS(3),
	LIFE_CYCLE(4),
	MOTIVATIONAL(5),
	WEMEN(6),
	FAMILY(7),
	SPOSE(8),
	CHILD(9),
	TEENAGER(10),
	INSTRUCTION(11),
	HEALTH(12),
	SPORT(13),
	UNIVERSITY(14),
	SHOP(15),
	BOOK(16),
	ENTERTAINMENT(17),
	ART(18),
	EDUCATION(19),
	OTHERS(20)
	
	;
	
	private int value;
	private ChannelGroup(int value) {
        this.value = value;
    }
	
}
