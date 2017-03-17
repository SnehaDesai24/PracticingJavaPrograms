import java.util.Scanner;

// Pelindrome String is String which will be same after reversing it.
// Like 'ABA' after reversing string would be same 'ABA'

public class PelindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Pelindrome String:-");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverseStr="";
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--){
			reverseStr = reverseStr + str.charAt(i);
			sb.append(str.charAt(i));
		}
		
		if(str.equals(reverseStr)){
			System.out.println("It is Pelindrome String");
		}else{
			System.out.println("It is not Pelindrome String");
		}
	}
}
