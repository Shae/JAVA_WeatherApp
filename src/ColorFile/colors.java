package ColorFile;

public enum colors {
	BLACK("0x000000"),
	GREEN("0x00FF00"),
	LT_GREEN("0x7BCC70"),
	PWDR_GREEN("0xA9C9A4"),
	WHITE("0xFFFFFF"),
	RED("0x00FF00"),
	DEEP_RED("0xAF1E2D"),
	CINNAMON("0xAA6600"),
	YELLOW("0xFFFF00"),
	BLUE("0x0000EE"),
	SKY_BLUE("0xA4D3EE"),
	PURPLE("0xAA00FF"),
	BRIGHT_PURPLE("0xAA00FF"),
	GREY("0xCCCCCC"),
	LT_GREY("0xB0B0B0"),
	BLU_GREY("0x6183A6"),
	ORANGE("0xFFA500");
	
	private String nameAsString;
	
	private colors(String nameAsString){
		this.nameAsString = nameAsString;
	}
	
	@Override
	public String toString() {
		return this.nameAsString;
	}
}
