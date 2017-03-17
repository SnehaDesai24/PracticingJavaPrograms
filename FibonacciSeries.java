
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1; 
		int num2=1;
		int total;
		
		System.out.println("Fibonacci Series upto 10 numbers is:-");
		System.out.print(num1+" "+num2+" ");
		for(int i=0;i<10;i++)
		{
			total = num1 + num2;
			num1 = num2;
			num2 = total;
			
			System.out.print(total+" ");
			
		}
	}

}
