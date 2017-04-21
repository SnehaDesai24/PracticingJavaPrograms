/*
 * In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once, 
 * but retain the first occurrence of any case-insensitive repeated word. For example, the words love and to are repeated in the sentence 
 * I love Love to To tO code. Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?
 * 
 * Input Format:-
   The following input is handled for you the given stub code:
   The first line contains an integer, , denoting the number of sentences. 
   Each of the  subsequent lines contains a single sentence consisting of English alphabetic letters and whitespace characters.
   
   Sample Input:-
   5
   Goodbye bye bye world world world
   Sam went went to to to his business
   Reya is is the the best player in eye eye game
   in inthe
   Hello hello Ab aB
   
   Sample Output:-
   Goodbye bye world
   Sam went to his business
   Reya is the best player in eye game
   in inthe
   Hello Ab
   
   Explanation:-
   We remove the second occurrence of bye and the second and third occurrences of world from Goodbye bye bye world world world to 
   get Goodbye bye world.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateWords {
	 //private static final int CASE_INSENSITIVE = 2;

	public static void main(String[] args) {

	        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
	        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	        Scanner in = new Scanner(System.in);
	        int numSentences = Integer.parseInt(in.nextLine());
	        
	        while (numSentences-- > 0) {
	            String input = in.nextLine();
	            
	            Matcher m = p.matcher(input);
	            
	            // Check for subsequences of input that match the compiled pattern
	            while (m.find()) {
	                input = input.replaceAll(m.group(), m.group(1));
	            }
	            
	            // Prints the modified sentence.
	            System.out.println(input);
	        }
	        
	        in.close();
	    }
}
