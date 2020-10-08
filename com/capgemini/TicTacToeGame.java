package com.capgemini;


public class TicTacToeGame {

	/*usecase1*/
	public static char[] boardCreate() {
		char[] board=new char[10];
		for(int i=0;i<10;i++) {
			board[i]=' ';
			}
		return board;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");
		 boardCreate();
		
	}
}