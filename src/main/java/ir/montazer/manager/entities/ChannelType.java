package ir.montazer.manager.entities;

import lombok.Getter;

@Getter
public enum ChannelType {
	
	SINGLE(0),
	MULTI(1);
	
	private int value;
	private ChannelType(int value) {
        this.value = value;
    }
	
}
