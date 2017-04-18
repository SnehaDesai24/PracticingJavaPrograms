/*
 String s is composed of any of the following: English alphabetic letters, 
 blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), 
 underscores (_), apostrophes ('), and at symbols (@).
 
 Constraints:-
 is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and 
 at symbols (@).
 
 Output Format:-
 On the first line, print an integer, , denoting the number of tokens in string  
 (they do not need to be unique). Next, print each of the  tokens on a new line in 
 the same order as they appear in input string .

 Sample Input:-
 He is a very very good boy, isn't he?

 Sample Output:-
 10
 He
 is
 a
 very
 very
 good
 boy
 isn
 t
 he
*/
public class SplitStringInTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "He@is a very_very.good boy! isn't,he?";

        String[] tokens = s.trim().split("[_\\@ !,?.']+");
		int length = s.trim().length();
       
        if(length>0 && length<=400000){
            System.out.println(tokens.length);
		    for(String token:tokens){
			     System.out.println(token);
            }
        }else{
                System.out.println(length);
        }
	}

}
