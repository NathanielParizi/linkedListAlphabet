package practice;
import java.util.*;

public class Main {
	
	public static void main(String[] args){
		
		ArrayList<String> poker = new ArrayList<String>();
		ArrayList<Integer> chess = new ArrayList<Integer>();
		int[] k = new int[10];
		
		System.out.println("k is " + k.length);
		
		poker.add("red");
		poker.add("blue");
		poker.add("yellow");
		
		System.out.println( "HELLO" + poker.get(0).compareTo("zapple"));
		
		chess.add(1);
		chess.add(2);
		chess.add(3);
		chess.add(5);
		
		
		for(int i=0; i<chess.size(); i++){
			
			System.out.println("chess: " + chess.get(i));
			
		}
		
		chess.add(3,200);
		
	for(int i=0; i<chess.size(); i++){
			
			System.out.println("chess: " + chess.get(i));
			
		}
		
		
		for(int i=0; i<poker.size(); i++){
			
			System.out.println("poker: " + poker.get(i) + " \tHello world is Joel");
			
			
		}
		
		
		
		
	}

}
