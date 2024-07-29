package entities;

import entities.ChessPiece;
import entities.enums.Color;

public class Board {
	private ChessPiece[][] boardPositions = new ChessPiece[8][8];

	public ChessPiece[][] getBoardPositions() {
		return boardPositions;
	}

	
	public void placePiece() {
		for (int i = 0; i < 8; i++) {
			boardPositions[1][i] = new Pawn(Color.WHITE, new Integer[] {1, i});
			
			boardPositions[6][i] = new Pawn(Color.BLACK, new Integer[] {6, i});
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 8; i++) {
			sb.append(8 - i + " ");
			for (int j = 0; j < 8; j++) {
				if (boardPositions[i][j] == null) {
					sb.append("-  ");
				}
				else {
					sb.append(boardPositions[i][j] + " ");
				}
			}
			sb.append("\n");
		}
		
		sb.append("  ");
		for (int i = 65; i < 73; i++) {
			sb.append((char) i + "  ");
		}
		return sb.toString();
	}
}
