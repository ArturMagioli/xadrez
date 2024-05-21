package aplication;

import model.entities.*;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		board.resetBoard();
		System.out.println(board);
		
		System.out.println();
		
		System.out.print("Source: ");
		String[] position = sc.next().split("");	
		int positionX = Math.abs(Integer.parseInt(position[0]) - 8);
		int positionY = Math.abs(position[1].charAt(0) - 97); 
		
		System.out.print("Target: ");
		position = sc.next().split("");
		int newPositionX = Math.abs(Integer.parseInt(position[0]) - 8);
		int newPositionY = Math.abs(position[1].charAt(0) - 97); 
		
		board.refreshBoard(positionX, positionY, newPositionX, newPositionY);
		
		System.out.println();
		System.out.println(board);
		
		sc.close(); 
	} 
}

