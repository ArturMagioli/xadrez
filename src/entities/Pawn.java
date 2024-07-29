package entities;

import entities.enums.Color;

public class Pawn extends ChessPiece {

	public Pawn(Color color, Integer[] position) {
		super(color, position);
	}
	
	
	
	
	@Override
	public String toString() {
		if (getColor() == Color.BLACK) {
			return "Pb";
		}
		else {
			return "Pw";
		}
	}
}
