
import java.util.Scanner;

public class InsertSort1 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String arr = in.nextLine();
		String[] inputarr = arr.split(" ");
		int[] sortArr = new int[inputarr.length];
		boolean swap = false;

		for(int k=0;k<inputarr.length;k++){
			sortArr[k] = Integer.parseInt(inputarr[k]);
		}

		for(int j=0;j<sortArr.length-1;j++){
			if(sortArr[j] > sortArr[j+1]){
				int temp = sortArr[j+1];
				sortArr[j+1] = sortArr[j];
				sortArr[j] = temp;
				
				for(int i=j; i>0 ; i--){
					if(sortArr[i] < sortArr[i-1]){
						temp = sortArr[i-1];
						sortArr[i-1] = sortArr[i];
						sortArr[i] = temp;
					}else{
						break;
					}
				}
			}
		}

		System.out.println("Sorted Array:- ");

		for(int k=0;k<sortArr.length;k++){
			System.out.print(sortArr[k]+" ");
		}
	}
}
