
public class FindLargestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[]= {8,2,6,5,4,3};
	
		int largest = number[0];
		int smallest = number[0];
		
		for(int i=1;i<number.length;i++){
			if(number[i]>largest){
				largest = number[i];
			}else if(number[i]<smallest){
				smallest = number[i];
			}
		}
		
		System.out.println("Largest Number in Array: "+ largest);
		System.out.println("Smallest Number in Array: "+ smallest);
	}
}
