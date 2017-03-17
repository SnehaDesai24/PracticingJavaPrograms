import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseString3 {
	//Reverse String by method3
	public static void main(String[] args) {
	
		String ostr="";
		System.out.print("Enter String to reverse: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			ostr=br.readLine();
			char chstr[] = ostr.toCharArray();
			List<Character> li = new LinkedList<Character>();
			for(char c:chstr)
			{
				li.add(c);
			}
			Collections.reverse(li);
			System.out.print("Reverse String: ");
			Iterator itr= li.iterator();
			while(itr.hasNext()){
				System.out.print(itr.next());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
