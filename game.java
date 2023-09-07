package project;

import java.util.*;
public class game {
public static boolean turn =true ;  //player x turn
public static int count =0;
public static boolean winner =false ;

//printing the board

	public static void print(char [][]arr) {
		System.out.println(" ---------");
		for (int i =0;i <arr.length;i++) {
			  System.out.print("| ");
		for (int j=0; j<arr[i].length;j++) {
			  System.out.print(arr[i][j] +" | ");	

		}
		  System.out.println();	
			System.out.println(" ----------");

		}

	}
	
public static void play(char [][] arr, int slot) {
	
	switch (slot) {
	
	case 1 : 
		if (arr[0][0] == '1') {
			if (turn) { // turn : player X turn
				arr[0][0] = 'X';
				}else { // not turn :player O turn
					arr[0][0] = 'O';
				}
			    count++;
			    turn = !turn;
             }else {
            	 System.out.println("Choose another slot!!");
             }
		     
		      break;
            	 
	case 2 : 
		if (arr[0][1] == '2') {
			if (turn) { // turn : player X turn
				arr[0][1] = 'X';
				}else { // not turn :player O turn
					arr[0][1] = 'O';
				}
			    count++;
			    turn = !turn;
             }else {
            	 System.out.println("Choose another slot!!");
             }
		     
		      break;
	case 3 : 
		if (arr[0][2] == '3') {
			if (turn) { // turn : player X turn
				arr[0][2] = 'X';
				}else { // not turn :player O turn
					arr[0][2] = 'O';
				}
			    count++;
			    turn = !turn;
             }else {
            	 System.out.println("Choose another slot!!");
             }
		     
		      break;
	case 4 : 
		if (arr[1][0] == '4') {
			if (turn) { // turn : player X turn
				arr[1][0] = 'X';
				}else { // not turn :player O turn
					arr[1][0] = 'O';
				}
			    count++;
			    turn = !turn;
             }else {
            	 System.out.println("Choose another slot!!");
             }
		     
		      break;
	case 5 : 
		if (arr[1][1] == '5') {
			if (turn) { // turn : player X turn
				arr[1][1] = 'X';
				}else { // not turn :player O turn
					arr[1][1] = 'O';
				}
			    count++;
			    turn = !turn;
             }else {
            	 System.out.println("Choose another slot!!");
             }
		     
		      break;
	case 6 : 
		if (arr[1][2] == '6') {
			if (turn) { // turn : player X turn
				arr[1][2] = 'X';
				}else { // not turn :player O turn
					arr[1][2] = 'O';
				}
			    count++;
			    turn = !turn;
             }else {
            	 System.out.println("Choose another slot!!");
             }
		     
		      break;
	case 7 : 
		if (arr[2][0] == '7') {
			if (turn) { // turn : player X turn
				arr[2][0] = 'X';
				}else { // not turn :player O turn
					arr[2][0] = 'O';
				}
			    count++;
			    turn = !turn;
             }else {
            	 System.out.println("Choose another slot!!");
             }
		     
		      break;
	case 8 : 
		if (arr[2][1] == '8') {
			if (turn) { // turn : player X turn
				arr[2][1] = 'X';
				}else { // not turn :player O turn
					arr[2][1] = 'O';
				}
			    count++;
			    turn = !turn;
             }else {
            	 System.out.println("Choose another slot!!");
             }
		     
		      break;
	case 9 : 
		if (arr[2][2] == '9') {
			if (turn) { // turn : player X turn
				arr[2][2] = 'X';
				}else { // not turn :player O turn
					arr[2][2] = 'O';
				}
			    count++;
			    turn = !turn;
             }else {
            	 System.out.println("Choose another slot!!");
             }
		     
		      break;
	default:System.out.println("please select a valid number!");

	}
}


public static void checkWinner(char [][]arr) {
	//checking the winner in the first line
	if (arr[0][0]==arr[0][1]&&arr[0][0]==arr[0][2]) {
		winner =true;
		count=10;
	}
	//checking the winner in the second line

	else if (arr[1][0]==arr[1][1]&&arr[1][0]==arr[1][2]) {
		winner =true;
		count= 10;
	}		
	//checking the winner in the third line
	else if (arr[2][0]==arr[2][1]&&arr[2][0]==arr[2][2]) {
		winner =true;
		count=10;
	}
	//checking the first column	
	else if(arr[0][0]==arr[1][0]&&arr[0][0]==arr[2][0]){
		winner=true;
		count=10;
	}
	//checking the second column
	else if (arr[0][1]==arr[1][1]&&arr[0][1]==arr[2][1]){
		
	}
	//checking the third column
	else if(arr[0][2]==arr[1][2]&&arr[0][2]==arr[2][2]){
		winner= true;
		count=10;
	}
	//checking the diagonal
		else if(arr[0][0]==arr[1][1]&&arr[0][0]==arr[2][2]){
			winner= true;
			count=10;
		}
		else if (arr[0][2]==arr[1][1]&&arr[0][2]==arr[2][0]){
			winner= true;
			count=10;
		}else if(count==9 && winner==false){
			count=11;
			System.out.println("the game end with a tie");
		}else 
			winner=false;
	
}

	public static void main(String[] args) {
		//taking the players' names
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter the first player's name:");
		String player1=s.next();
		System.out.println("Please Enter the second player's name:");
		String player2=s.next();

  System.out.println("Welcome to my game!");	
  char [][] grid = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	print (grid);	
do{
	if(turn){
		System.out.println(player1+", please choose a slot ");
	}else{
		System.out.println(player2+", please choose a slot ");
	}
	int choice = s.nextInt();
	play(grid,choice);
	print(grid);	

checkWinner(grid);
}while(count<9);



if(winner){
	if(turn){
		System.out.println(player2+" won the game");
	}else
		System.out.println(player1+" won the game");
}
	

	}
}