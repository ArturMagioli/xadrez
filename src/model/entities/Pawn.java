package model.entities;

import model.entities.enums.Color;

public class Pawn extends ChessPiece {

	public Pawn() {
		super();
	}

	public Pawn(Color color, int positionX, int positionY) {
		super(color, positionX, positionY);
	}

	@Override
	public void movement(int x, int y) {
		setPositionX(x);
		setPositionY(y);
	}
	
	@Override
	public String toString() {
		return "P";
	}
}