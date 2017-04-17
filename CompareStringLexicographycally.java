/*
Given a string, find out the lexicographically smallest and largest substring of length .

[Note: Lexicographic order is also known as alphabetic order dictionary order. 
So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always 
comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller 
than "ball".]

Input Format:-
First line will consist a string containing english alphabets which has at most  
characters. 2nd line will consist an integer .

Output Format:-
In the first line print the lexicographically minimum substring. In the second 
line print the lexicographically maximum substring.

Sample Input:-
welcometojava
3

Sample Output:-
ava
wel

Explanation:-
Here is the list of all substrings of length
wel
elc
lco
com
ome
met
eto
toj
oja
jav
ava

Among them ava is the smallest and wel is the largest.
 */
import java.util.Scanner;
public class CompareStringLexicographycally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int charlength = sc.nextInt();
		
		String smallestStr , largestStr, substring;
		largestStr = str.substring(0,charlength);
	    smallestStr = str.substring(0,charlength);
	    
	    System.out.println(largestStr);
	    System.out.println(smallestStr);
	    
		for(int i = 2; i <= str.length() - charlength; i++){
		    substring = str.substring(i,i+charlength);
		    if(substring.compareTo(largestStr) > 0){
		    	largestStr = substring;
		    }else if(substring.compareTo(smallestStr) < 0){
		    	smallestStr = substring;
		    }
		    System.out.println(substring);
		}
		
		System.out.println("Output:-");
		System.out.println(largestStr);
		System.out.println(smallestStr);
	}

}
