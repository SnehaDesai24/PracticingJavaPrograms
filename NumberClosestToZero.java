import java.util.ArrayList;
import java.util.Scanner;

public class NumberClosestToZero {
public static void main(String args[]){

	Scanner in = new Scanner(System.in); 
	
	while(true){
	int numOfTemps = in.nextInt();
	in.nextLine();
	String str = in.nextLine();
	
	String[] tempArr = str.split("\\s");
	ArrayList<Integer> positiveTemp = new ArrayList<Integer>(); 
	ArrayList<Integer> negativeTemp = new ArrayList<Integer>(); 
	
	if(!tempArr[0].isEmpty()){
	for(int i=0;i<tempArr.length;i++){
		if(tempArr[i].contains("-")){
			negativeTemp.add(Integer.valueOf(tempArr[i]));
		}else{
			positiveTemp.add(Integer.valueOf(tempArr[i]));
		}
	}
	}
	
	System.out.println("\nNegative Array: " + negativeTemp); 
	System.out.println("Positive Array: " + positiveTemp);
	
	int closestPosTemp = 0 ,closestNegTemp=0;
	if(positiveTemp.size() >= 1){
	closestPosTemp = positiveTemp.get(0);
	for(int j=0;j<positiveTemp.size();j++){
		if(closestPosTemp > positiveTemp.get(j)){
			closestPosTemp = positiveTemp.get(j);
		}
	}
	}
	
	if(negativeTemp.size() >= 1){
	closestNegTemp = negativeTemp.get(0);
	for(int j=0;j<negativeTemp.size();j++){
		if(closestNegTemp < negativeTemp.get(j)){
			closestNegTemp = negativeTemp.get(j);
		}
	}
	}
	System.out.println("\nClosest Negative : " + closestNegTemp); 
	System.out.println("Closest Positive : " + closestPosTemp);
	
	int closestTemp = 0;
	
	if(((closestNegTemp != 0) && ((0 - (closestNegTemp)) < closestPosTemp)) || 
			closestPosTemp == 0)
	{
		closestTemp = closestNegTemp; 
	}
	else if((0 - (closestNegTemp)) == closestPosTemp)
	{
		closestTemp = closestPosTemp;
	}
	else{
		closestTemp = closestPosTemp;
	}
	
	System.out.println("\nclosestTemp : "+closestTemp);
	}
	}
}
