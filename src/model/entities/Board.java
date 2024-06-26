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
			piece[6][i] = new Pawn(Color.BLACK, 6, i);
			piece[7][i] = new Pawn(Color.BLACK, 7, i);
		}
	}
	
	public void refreshBoard(int oldPositionX, int oldPositionY, int newPositionX, int newPositionY) {
		piece[oldPositionX][oldPositionY].movement(newPositionX, newPositionY);
		piece[newPositionX][newPositionY] = piece[oldPositionX][oldPositionY];
		piece[oldPositionX][oldPositionY] = null;
	}
	
 	public void CheckSourceException(int x, int y) {
 		if ( (x < 0 || x > 7) || (y < 0 || y > 7) ) {
 			throw new IndexOutOfBoundsException("The position on the source is out of the board.");
 		}
 		if (piece[x][y] == null) {
 			throw new NullPointerException("There is no piece on source position.");
 		}
 	}
 	
 	public void checkTargetPosition(int x, int y) {
 		if ( (x < 0 || x > 7) && (y < 0 || y > 7) ) {
 			throw new IndexOutOfBoundsException("The position on the target is out of the board.");
 		}
 		if (piece[x][y] == null) {
 			throw new NullPointerException("There is no piece on target position.");
 		}
 	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 8; i++) {
			sb.append(8 - i + " ");
			for (int j = 0; j < 8; j++) {
				if (piece[i][j] != null) {
					sb.append(piece[i][j] + "  ");
				}
				else {
					sb.append("-   ");
				}
			}
			sb.append("\n");
		}
		
		char letra = 97;
		for (int i = 0; i < 8; i++) {
			sb.append("   " + letra);
			letra++;
		}
		return sb.toString();
	}
}
