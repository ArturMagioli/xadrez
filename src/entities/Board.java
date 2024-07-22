package entities;

import entities.ChessPiece;

public class Board {
	private ChessPiece[][] boardPositions = new ChessPiece[8][8];

	public ChessPiece[][] getBoardPositions() {
		return boardPositions;
	}

	public String printBoard() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 8; i++) {
			sb.append(8 - i + " ");
			for (int j = 0; j < 8; j++) {
				if (boardPositions[i][j] == null) {
					sb.append("-  ");
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
