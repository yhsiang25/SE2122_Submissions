package de.uni.koeln.se;

import java.util.Random;
import java.util.Scanner;



public class Bet_More {
	static Scanner sc = new Scanner(System.in); //Scanner definieren
	static String yes = new String("yes"); //Eingabe nach dem Spiel
	static String no = new String("no"); //Eingabe nach dem Spiel
	
	/**
	 * this method generate a random number and 
	 * @return the generated number back
	 */
	public static int randomNumber () {
		Random random = new Random(); //Random erstellen
		int n = random.nextInt(100) + 1;
		return n;
	}
	
	/**
	 * the method let the user enter whether they want to continue the game or not
	 * @return the boolean depands on the input to continue the game or end the game
	 */
	public static boolean playAgain () {
		String yes = new String("yes"); //Eingabe nach dem Spiel
		String no = new String("no"); //Eingabe nach dem Spiel
		Scanner sc = new Scanner(System.in); //Scanner definieren
		boolean n = true;
		System.out.println("continue the game?");
		
		while (true) {	
			String keepplay = sc.next();
			System.out.println();
			if(keepplay.equals(yes)) {//判断输入的字符是否是"是" 
				n = true;
				break;
			}
			else if(keepplay.equals(no)) {//判断输入的字符是否是"否"
				System.out.println("exit the game");
				n = false;
				break;
			}
			else {
				System.out.println("error input");
				continue;
			}
		}  
		return n;
	}	

	public static void main(String[] args){
		
		System.out.println("Bet More: \n");
				
		int player1;
		int player2;
		int count = 1;
		boolean flag = true;
		
		while (flag) {
			player1 = randomNumber() ;
			System.out.println("the Computer already picked a number \n");
			
			do  {
				player2 = randomNumber();
				count ++;
				System.out.println("your randomly-generated number: " + player2);
				System.out.println("confirm your number and play (yes/no) : ");
				String diceagain = sc.next();
				if (diceagain.equals(yes)) {
					break;
				} 
				if (count == 5) {
					System.out.println("you have already generated 5 time, the game will start with the last generated number");
					System.out.println("your randomly-generated number: " + player2);
					break;
					
				} else {
					continue;
				}
			} while (count <= 5);
			
			if(player2 > player1) {
				System.out.println("the number Computer picked: " + player1);
				System.out.println("you win :) ");
				flag = playAgain();
			}
			else if(player2 < player1) {
				System.out.println("randomly-generated to compete: " + player1);
				System.out.println("you lose :( ");
				flag = playAgain();
			}
			else {
				System.out.println("randomly-generated to compete: "  + player1);
				System.out.println("draw game!!");
				flag = playAgain();
			}
			
			}
		}		
}
		