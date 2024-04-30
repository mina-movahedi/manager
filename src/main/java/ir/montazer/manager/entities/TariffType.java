package ir.montazer.manager.entities;

import lombok.Getter;

@Getter
public enum TariffType {
	
	NIGHTLY(0),
	DAILY(1),
	VISILY(2),
	PERMANENTLY(3),
	ALL(4);
	
	private int value;
	private TariffType(int value) {
        this.value = value;
    }

}
