package aplication;

import model.entities.*;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		board.resetBoard();
		System.out.println(board);
		
		sc.close();
	}
}

