import java.util.*;
		import java.io.*;
		import java.math.*;
public class OldEmulatorDisplayMySol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Auto-generated code below aims at helping you parse
		 * the standard input according to the problem statement.
		 **/
		        Scanner in = new Scanner(System.in);
		        int L = in.nextInt();
		        int H = in.nextInt();
		        in.nextLine();
		        String T = in.nextLine();
		        T=T.toUpperCase();
		        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		        
		        for (int i = 0; i < H; i++) {
		            String ROW = in.nextLine();
		            String pattern = "";
		            int tLength = T.length();
		            
		            for(int j=0;j<tLength;j++)
		            {
		              int startIndex = str.indexOf(T.charAt(j));
		              if(startIndex == 0){
		                  pattern +=  ROW.substring(startIndex,startIndex+L);
		              }
		              else if(startIndex != -1)
		              {
		                startIndex = startIndex*L;
		                pattern +=  ROW.substring(startIndex,startIndex+L);
		              }
		              else
		              {
		                pattern +=  ROW.substring(ROW.length()-L,ROW.length()); 
		              }
		            }
		            System.out.println(pattern);
		        }

		        // Write an action using System.out.println()
		        // To debug: System.err.println("Debug messages...");

		       // System.out.println("answer");
	}
}
