import java.util.*;
import java.io.*;
import java.math.*;

/*
 * Casablanca’s hippodrome is organizing a new type of horse racing: duals. 
 * During a dual, only two horses will participate in the race. 
 * In order for the race to be interesting, it is necessary to try to select 
 * two horses with similar strength.
 * Write a program which, using a given number of strengths, 
 * identifies the two closest strengths and shows their difference with an integer ≥ 0).
   Input
   Line 1: Number N of horses
   The N following lines: the strength Pi of each horse. Pi is an integer.

Output
The difference D between the two closest strengths. D is an integer greater than or equal to 0.
Constraints
1 < N  < 100000
0 < Pi ≤ 10000000

For Example:
Input: 3 5 8 9
Output: 1
*/

public class FindDiffBetTwoClosestElement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int pi[] = new int[N];
		for (int i = 0; i < N; i++) {
			pi [i] = in.nextInt();
		}

		Arrays.sort(pi);

		int min = Integer.MAX_VALUE ;
		for(int k=0;k<N-1;k++){
			int diff = pi[k+1] - pi[k];
			if(min >= diff){
				min = diff;
			}
		}

		System.out.println(min);
	}
}
