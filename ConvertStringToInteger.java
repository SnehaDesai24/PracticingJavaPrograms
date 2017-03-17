
public class ConvertStringToInteger {
//Convert a number from string to integer without using parseInt() method
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        String  convertingString="123456";
		        System.out.println("String Before Conversion :  "+ convertingString);
		        int output=    stringToint( convertingString );
		        System.out.println("");
		        System.out.println("int value as output "+ output);
		        System.out.println("");
		    }
		    
		    
		    public static int stringToint( String str ){
		        int i = 0, number = 0;
		        boolean isNegative = false;
		        int len = str.length();
		        if( str.charAt(0) == '-' ){
		            isNegative = true;
		            i = 1;
		        }
		        while( i < len ){
		            number *= 10;
		            System.out.println(number);
		            number += ( str.charAt(i++) - '0' );
		            System.out.println(number);
		        }
		        if( isNegative )
		        number = -number;
		        return number;
		    }   
	}
