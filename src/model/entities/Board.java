package model.entities;

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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				sb.append(piece[i][j] + "  ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
