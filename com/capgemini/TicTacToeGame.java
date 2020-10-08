package com.capgemini;

import java.util.Scanner;
public class TicTacToeGame {

	/*usecase1*/
	public static char[] boardCreate() {
		char[] board=new char[10];
		for(int i=0;i<10;i++) {
			board[i]=' ';
			}
		return board;
	}
	/*usecase2*/
	public static void chooseXO(char choice) {
		char PLAYER;
		char COMPUTER;
		if(choice=='x') {
			System.out.println("Player has choosen x");
			PLAYER='x';
			System.out.println("Computer is asssigned o");
			COMPUTER='o';
		}
		else if(choice=='o') {
			System.out.println("Player has choosen o");
			PLAYER='o';
			System.out.println("Computer is asssigned x");
			COMPUTER='x';
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");
		 char board[]=boardCreate();
		 System.out.println("Choose between x and o");
		 Scanner sc=new Scanner(System.in);
		 char choice=sc.next().charAt(0);
		 chooseXO(choice);
		 
		 sc.close();
		
		
	}

}