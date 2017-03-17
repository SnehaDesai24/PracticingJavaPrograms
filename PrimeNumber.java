import java.util.Scanner;

//Prime numbers are only divisible by 1 or itself.

public class PrimeNumber {

	public boolean checkIsPrime(int num)
	{
		if(num==2 || num==3 || num== 5){
			return true;
		}else if(num%2==0){
			return false;
		}else{
			int snum = (int)Math.sqrt(num);
			for(int j=3;j<=snum;j=j+2)
			{
				if(num%j==0)
					return false;
			}
		}
		return true;
	}

	public void printPrimeNum(int num1,int num2)
	{


		for(int i=num1;i<=num2;i++){

			boolean primenum=true;

			if(i==2 || i==3 || i==5){
				primenum=true;
			}else if(i%2==0){
				primenum=false;
			}else{
				int sqnum=i/2;
				for(int j=3;j<=sqnum;j=j+2){
					if(i%j==0){
						primenum=false;
					}
				}
			}

			if(primenum==true)
				System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {

		System.out.print("Enter the Number:");

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); 
		PrimeNumber pn = new PrimeNumber();

		boolean isPrime= pn.checkIsPrime(num);

		if(isPrime == true){
			System.out.println("It is a prime number");
		}else{
			System.out.println("It is not a prime number");
		}

		System.out.println("Print prime numbers between following numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt(); 
		System.out.println("Prime Numbers are:-");

		pn.printPrimeNum(num1, num2);

		
	}

}

