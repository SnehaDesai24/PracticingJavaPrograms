
public class ReverseString2 {

	//Reverse String by method2
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome";
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		System.out.println("String to be Reverse: "+sb);
		sb.reverse();
		System.out.println("ReverseString: "+sb);
	}
}
