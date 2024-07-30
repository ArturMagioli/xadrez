package aplication;

import entities.Board;

public class ChessMatch {

	public static void main(String[] args) {
				
		Board board = new Board();
		board.placePiece();
		System.out.println(board); 
		
		
		Integer[] oldPosition = new Integer[] {6, 0};
		Integer[] newPosition = new Integer[] {5, 0};
		
		board.getBoardPositions()[oldPosition[0]][oldPosition[1]].pieceMovement(newPosition);
		board.refreshBoard(oldPosition, newPosition);
		System.out.println();
		System.out.println(board);		
		
		
		
		//printa a posição do pbjeto:
		//System.out.println(board.getBoardPositions()[1][1].getPosition()[0] + ", " + board.getBoardPositions()[1][1].getPosition()[1]);
				
	}

}
