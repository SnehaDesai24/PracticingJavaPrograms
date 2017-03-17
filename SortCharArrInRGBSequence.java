import java.util.ArrayList;

public class SortCharArrInRGBSequence {
	public static void main(String args[]){
		
		char arr[] = {'G','R','B','G','G','B','R','R','B','R','G','B'};
		ArrayList<Character> rarr = new ArrayList<Character>();
		ArrayList<Character> garr = new ArrayList<Character>();
		ArrayList<Character> barr = new ArrayList<Character>();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 'R'){
				rarr.add(arr[i]);
			}else if(arr[i] == 'G'){
				garr.add(arr[i]);
			}else if(arr[i] == 'B'){
				barr.add(arr[i]);
			}
		}
		
		ArrayList<Character> rgbArr = new ArrayList<Character>();
		
		rgbArr.addAll(rarr);
		rgbArr.addAll(garr);
		rgbArr.addAll(barr);
		
		System.out.println("Sorted RGB Array:- "+ rgbArr);
	}
}
