package ir.montazer.manager.entities;

import lombok.Getter;

@Getter
public enum ChannelTheme {
	
	RELIGION(0),
	GRAY(1),
	SEMI_GRAY(2);
	
	private int value;
	private ChannelTheme(int value) {
        this.value = value;
    }
}
