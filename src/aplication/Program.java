package aplication;

import java.io.IOException;
import java.util.Scanner;

import model.entities.Board;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		board.resetBoard();
		System.out.println(board);
		
		System.out.println();
		
		try {
			System.out.print("Source: ");
			String[] position = sc.next().split("");	
			int positionX = Math.abs(Integer.parseInt(position[0]) - 8);
			int positionY = Math.abs(position[1].charAt(0) - 97); 
			
			System.out.println(positionX + ", " + positionY);
			board.CheckSourceException(positionX, positionY);
			
			System.out.print("Target: ");
			position = sc.next().split("");
			int newPositionX = Math.abs(Integer.parseInt(position[0]) - 8);
			int newPositionY = Math.abs(position[1].charAt(0) - 97); 
			
			board.checkTargetPosition(newPositionX, newPositionY);
			
			board.refreshBoard(positionX, positionY, newPositionX, newPositionY);
			
			System.out.println();
			System.out.println(board);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid move: " + e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("Invalid move: " + e.getMessage());
		}
	
		sc.close(); 
	} 
}

