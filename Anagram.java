/*
Two strings  and  are called anagrams if they consist same characters, 
but may be in different orders. So the list of anagrams of  is .

Given two strings, print Anagrams if they are anagrams, print Not Anagrams 
if they are not. The strings may consist at most  English characters; 
the comparison should NOT be case sensitive.

This exercise will verify that you can sort the characters of a string, 
or compare frequencies of characters.

Sample Input 0:-
anagram
margana

Sample Output 0:-
Anagrams

Sample Input 1:-
anagramm
marganaa

Sample Output 1:-
Not Anagrams
 */
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        
        if(a.length() == b.length()){
            char[] str1Arr = a.toLowerCase().toCharArray();
            char[] str2Arr = b.toLowerCase().toCharArray();
            
            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);
            
            System.out.println(str1Arr);
            System.out.println(str2Arr);
            
            return Arrays.equals(str1Arr,str2Arr);
        }else{
        	return false;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
