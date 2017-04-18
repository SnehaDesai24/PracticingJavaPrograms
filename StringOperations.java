/*
Input Format:-
The first line contains a string . The second line contains another string. 
The strings are comprised of only lowercase english letters.

Output Format:-
There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input:-
hello
java
Sample Output

Sample Output:-
9
No
Hello Java
*/
import java.util.Scanner;
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        System.out.println(A.length() + B.length());
        
        String compare = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(compare);
        
        String capitalize = A.substring(0,1).toUpperCase() + A.substring(1) +" "+
                            B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(capitalize);
	}

}
