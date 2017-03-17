import java.util.Scanner;

public class SortNumberAscendingOrder {
public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
	String inputArr = in.nextLine();
	String[] arr = inputArr.split(" ");
	int[] sortArr = new int[arr.length];
	boolean swapped = false;
	
	for(int k=0;k<arr.length;k++){
		sortArr[k] = Integer.parseInt(arr[k]);
	}
	
	for(int i=0;i<sortArr.length-1;i++){
		for(int j=0; j<sortArr.length-1; j++){
			if(sortArr[j] > sortArr[j+1]){
				int temp = sortArr[j+1];
				sortArr[j+1] = sortArr[j];
				sortArr[j] = temp;
				
				swapped = true;
			}
		}
		
		if(!swapped){
			break;
		}
	}
	
	/*for(int i=0;i<sortArr.length;i++){
		for(int j=i+1; j<sortArr.length; j++){
			if(sortArr[i] > sortArr[j]){
				int temp = sortArr[j];
				sortArr[j] = sortArr[i];
				sortArr[i] = temp;
			}
		}
	}*/

		System.out.println("Sorted Array:-");
		for(int l=0;l<sortArr.length;l++){
		System.out.println(sortArr[l]);
		}
	//}
}
}
