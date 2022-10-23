import java.util.Scanner;
import java.util.Stack;

public class Backspace {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != '<') {
				stk.add(str.charAt(i));
			}else {
				stk.pop();
			}
		}
		
		for(int i = 0; i < stk.size(); i++) {
			System.out.print(stk.get(i));
		}
	}

}