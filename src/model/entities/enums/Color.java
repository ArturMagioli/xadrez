package model.entities.enums;

public enum Color {
	WHITE(1),
	BLACK(2);
	
	private Integer value;
	
	private Color(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
}
