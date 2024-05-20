package model.entities;

import model.entities.enums.Color;

public class Board {
	ChessPiece[][] piece = new ChessPiece[8][8];
	
	public Board() {
		
	}
	
	public Board(ChessPiece[][] piece) {
		this.piece = piece;
	}

	public ChessPiece[][] getPiece() {
		return piece;
	}

	public void setPiece(ChessPiece[][] piece) {
		this.piece = piece;
	}
	
	public void resetBoard() {
		for (int i = 0; i < 8; i++) {
			piece[0][i] = new Pawn(Color.WHITE, 0, i);
			piece[1][i] = new Pawn(Color.WHITE, 1, i);
			piece[6][i] = new Pawn(Color.WHITE, 6, i);
			piece[7][i] = new Pawn(Color.WHITE, 7, i);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (piece[i][j] != null) {
					sb.append(piece[i][j] + "  ");
				}
				else {
					sb.append("-  ");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
