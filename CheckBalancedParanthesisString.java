/* For Example:-
 * Input : ({}) , {{([])}}
 * Output: true (Balanced)
 * Input : {}( , {[(})}
 * Output : false (Unbalanced)
 * */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CheckBalancedParanthesisString {

	public static void main(String[] args) {
		CheckBalancedParanthesisString balance = new CheckBalancedParanthesisString();
		Scanner in = new Scanner(System.in);

		/*while(in.hasNext()){
			String str = in.nextLine();
			int startTime = (int)System.currentTimeMillis();
			System.out.println("startTime:"+startTime);
			boolean result = balance.checkBalanceString(str);
			int endTime = (int)System.currentTimeMillis();
			System.out.println("endTime:"+ ( endTime - startTime));
			
			int startTime1 = (int)System.currentTimeMillis();
			System.out.println("startTime1:"+startTime1);
			boolean result1 = balance.checkBalance(str);
			int endTime1 = (int)System.currentTimeMillis();
			System.out.println("endTime1:"+  (endTime1 - startTime1));
			System.out.println(result); 
			System.out.println(result1);
		}
		in.close();
	}*/
	while(in.hasNext()){
		String str = in.nextLine();
		boolean result = balance.checkBalanceString(str);
		System.out.println(result);
	}
	in.close();
}
	public boolean checkBalanceString(String str){
		char strArr[] = str.toCharArray();
		Deque<Character> stack = new ArrayDeque<Character>();
		for(char c : strArr){
			char temp = '.';
			switch(c){
			case '{':
			case '(':
			case '[': stack.push(c);
					  break;
			case ']': temp = '[';
			case ')': if(temp == '.')temp = '(';
			case '}': if(temp == '.')temp = '{';
					  if(stack.isEmpty() || stack.pop() != temp){
							return false;
					  }
					  break;
			}
		}
		return stack.isEmpty();
	}


public boolean checkBalance(String input){
    while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", ""))
    		.length());
    return input.isEmpty();
    }
} 