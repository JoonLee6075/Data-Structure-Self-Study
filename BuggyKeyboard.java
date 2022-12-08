
import java.util.ArrayDeque;
import java.util.Scanner;
public class BuggyKeyboard {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ArrayDeque<Character> q = new ArrayDeque<>();
	
		
		if(input.charAt(0) != '<') {
			q.push(input.charAt(0));
		}
		for(int i = 1; i < input.length(); i++) {
			
			
		    if(input.charAt(i) == '<') {
		    	if(q.size() != 0) {
				q.removeLast();
		    	}
		    	else {
		    		continue;
		    	}
		    	
			}
			else {
				q.addLast(input.charAt(i));
			
			}
		}
		int temp = q.size();
		for(int i = 0; i < temp; i++) {
			System.out.print(q.pop());
		}
	
		
		

	}

}