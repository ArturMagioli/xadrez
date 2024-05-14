package model.entities;

import model.entities.enums.Color;

public abstract class ChessPiece {
	
	private Color color;
	private Integer[] position = new Integer[2];
	
	public ChessPiece() {

	}
	
	public ChessPiece(Color color, Integer[] position) {
		this.color = color;
		this.position = position;
	}

	public Color getColor() {
		return color;
	}

	public Integer[] getPosition() {
		return position;
	}

	public void setPosition(Integer[] position) {
		this.position = position;
	}
	
	public abstract void movement(int x, int y);
}
