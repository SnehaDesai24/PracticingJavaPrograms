/* Given 2 array. Array1 is Integer type and Array2 is String type.
 * Print content of both the array using single method, using generic method.
 * For Example:-
 * Array1 :- 1 2 3
 * Arra2 :- "Hello" "Welcome"
 * Output:- 1 2 3 Hello Welcome
 * */


import java.lang.reflect.Method;

class Printer
{
    public <T> void printArray(T[] arr){
        
        for(T t : arr){
            System.out.println(t);
        }
    } 
}

public class PrintIntStrngArrUsingSingleMethod {
	    public static void main( String args[] ) {
	        Printer myPrinter = new Printer();
	        Integer[] intArray = { 1, 2, 3 };
	        String[] stringArray = {"Hello", "World"};
	        myPrinter.printArray(intArray);
	        myPrinter.printArray(stringArray);
	        int count = 0;

	        for (Method method : Printer.class.getDeclaredMethods()) {
	            String name = method.getName();

	            if(name.equals("printArray"))
	                count++;
	        }

	        if(count > 1)System.out.println("Method overloading is not allowed!");
	      
	    }

}
