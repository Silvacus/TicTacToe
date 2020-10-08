package com.capgemini;

import java.util.Scanner;
public class TicTacToeGame {
	static Scanner sc=new Scanner(System.in);
    static char PLAYER;
    static char COMPUTER;
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
	
	/*usecase3*/
	public static void printBoard(char[] boardPrint) {
		System.out.println(" "+boardPrint[1]+" | "+boardPrint[2]+" | "+boardPrint[3]);
		System.out.println("-----------");
		System.out.println(" "+boardPrint[4]+" | "+boardPrint[5]+" | "+boardPrint[6]);
		System.out.println("-----------");
		System.out.println(" "+boardPrint[7]+" | "+boardPrint[8]+" | "+boardPrint[9]);
		
	}
	/*usecase4*/
	public static boolean checkIfFree(char board[]) {
		    boolean check=true;
		    boolean condition=true;
			while(condition)
			{
				 int index=UserDesiredLocation();
				 if(board[index]==' ')
				 {
					 condition=false;
					 check=true;
				 }
				 else
				 {
					 System.out.println("Enter Desired Location in the board"); 
					 int ind=UserDesiredLocation();
					 check=false;
				 }
				 
		}
		return check;
	}
	public static int UserDesiredLocation()
	{
		System.out.println("Enter Desired Location in the board");
		 int pos=sc.nextInt();
		 return pos;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");
		 char board[]=boardCreate();
		 System.out.println("Choose between x and o");
		 Scanner sc=new Scanner(System.in);
		 char choice=sc.next().charAt(0);
		 chooseXO(choice);
		 printBoard(board);
		 boolean v=checkIfFree(board);
		 System.out.println(v);
		 sc.close();
		
	}
	}

