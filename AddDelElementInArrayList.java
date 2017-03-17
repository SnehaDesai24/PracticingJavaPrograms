import java.io.*;
import java.util.*;

public class AddDelElementInArrayList {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<N ; i++){
			al.add(s.nextInt());
		}
		int Q = s.nextInt();
		for(int j=0; j<Q; j++){
			for(int k=0; k<2; k++){
				String op = s.nextLine();
				if(op.equals("Insert")){
					int a = s.nextInt();
					int b = s.nextInt();
					al.add(a,b);
				}else if(op.equals("Delete")){
					int delIndex = s.nextInt();
					al.remove(delIndex);
				}
			}
		}

		for(int itr : al){
			System.out.print(itr + " ");
		}
	}
}
