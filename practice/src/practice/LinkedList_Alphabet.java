package practice;
import java.util.*;

public class LinkedList_Alphabet {
	
	public static void main(String[] args) {
		
		LinkedList<String> placesToVisit = new LinkedList<String>();
		
		addInOrder(placesToVisit, "Columbia");
		addInOrder(placesToVisit, "Miami");
		addInOrder(placesToVisit, "NewYork");
		addInOrder(placesToVisit, "Charleston");
		addInOrder(placesToVisit, "Charleston");
		addInOrder(placesToVisit, "Atlanta");
		addInOrder(placesToVisit, "Los Angeles");
		addInOrder(placesToVisit, "Atlanta");
		
		
		
		printList(placesToVisit);
	
		visit(placesToVisit);
		
	}

	private static void printList(LinkedList<String> linkedlist) {
		
		Iterator<String> i = linkedlist.iterator();
		
		while(i.hasNext()){
			System.out.println("Next stop!: " + i.next());
		}
		
		System.out.println("=============================");
		
	}

	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
		
		ListIterator<String> s = linkedList.listIterator();
		
		while(s.hasNext()){		
			int comparison = s.next().compareTo(newCity);
			if(comparison == 0){  //dont add  
				System.out.println(newCity + " is already included");
				return false;
				}else if(comparison > 0){
					s.previous();
					s.add(newCity);
					return true;
				}else if(comparison < 0){
		
				}

		}
		
		s.add(newCity);
		return true;
		
	}
	
	
	
	public static void visit(LinkedList cities){
		Scanner scan = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		Iterator<String> listIterator = cities.iterator();
		if(cities.getFirst()==null){
			System.out.println("No cities in here buddy!");
		}else{
			System.out.println("Visiting:  " + listIterator.next());
			printMenu();
			
		}
		while(!quit){
			int action = scan.nextInt();
			scan.nextLine();
			
			switch(action){
			
			case 0: 
				
				System.out.println("vacation over");
				break;
			
			case 1: 
				if(!goingForward){
					if(listIterator.hasNext()){listIterator.next();}
					goingForward = true;
				}
				if(listIterator.hasNext()){
					System.out.println("Now visiting " + listIterator.next());	
				}else{ System.out.println("There is nothing infront of it");}
				break;
			
			case 2: 
				if(goingForward){
					if(((ListIterator<String>) listIterator).hasPrevious()){
						((ListIterator<String>) listIterator).previous();
						goingForward = false;
					}
					
				}
				if(((ListIterator<String>) listIterator).hasPrevious()){
					
					System.out.println(((ListIterator<String>) listIterator).previous());
					
				}else{System.out.println("we are at the end of the list");}
				break;
			
			case 3: printMenu();
			break;
				
			
			}
		}
		
	}

	private static void printMenu() {
	
		System.out.println("0 quit\n 1 go next \n 2 go back \n 3 check menu");
		
	}
	
}
