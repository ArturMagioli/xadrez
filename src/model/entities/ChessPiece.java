package model.entities;

import model.entities.enums.Color;

public abstract class ChessPiece {
	
	private Color color;
	private Integer positionX;
	private Integer positionY;
	
	public ChessPiece() {

	}
	
	public ChessPiece(Color color, int positionX, int positionY) {
		this.color = color;
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public Color getColor() {
		return color;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	public Integer getPositionY() {
		return positionY;
	}

	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}

	public abstract void movement(int x, int y);
}
