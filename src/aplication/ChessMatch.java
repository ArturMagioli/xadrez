package aplication;

import entities.Board;

public class ChessMatch {

	public static void main(String[] args) {
		
		Board board = new Board();
		board.placePiece();
		System.out.println(board);
		
	}

}
