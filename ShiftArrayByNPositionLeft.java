import java.util.Scanner;

public class ShiftArrayByNPositionLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		while(true){
		System.out.print("Enter Array Length: ");
		
		int n = in.nextInt();
		
		System.out.print("Enter number of positions to sift left: ");
		
		int shift = in.nextInt();
		int[] arr = new int[n];
		
		for(int l=0; l<n; l++){
			arr[l] = in.nextInt();
		}
		
		for(int i=0; i<shift; i++){
			int temp = arr[0];
			for(int j=0; j<n-1; j++){
				arr[j] = arr[j+1];
			}
			arr[n-1] = temp;
		}
		
		int k=0; 
		while(k<arr.length-1) 
		{
			System.out.print(arr[k] + ", ");
			k++;
		}
		System.out.println(arr[k]);
		}
		}

}
