import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Reverse String by method 1
public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="";
		char ch[];
		System.out.print("Enter String to Reverse:");
		
		
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
			long startTime = System.currentTimeMillis();
			//ch=str.toCharArray();
			System.out.print("Reverse String:-");
			/*for(int i=ch.length-1;i>=0;i--)
			{
				System.out.print(ch[i]);
			}*/
			for(int i=str.length()-1;i>=0;i--)
			{
				System.out.print(str.charAt(i));
			}
			long endTime = System.currentTimeMillis();
			
			System.out.println("Total execution time:-"+(endTime - startTime));
		}
		catch(IOException io){
			io.printStackTrace();
		}




	}
}
