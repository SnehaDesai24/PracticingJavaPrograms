import java.io.*;
import java.util.*;
import java.security.*;
import javax.xml.bind.DatatypeConverter;

/* MD5,SHA are cryptography hash algorithms. It is a hash function used to generate 
 * encrypted hash value for password, file. encrypted password will be stored in database.
 * Each time user enters it converts its password in hash value which will always be 
 * same as the one stored in database. We can also check whether downloaded file is 
 * modified by comparing its hash value after downloading with the hash value before downloading.
 * */

public class CreateEncryptedValue {
public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        String input = in.nextLine();
		        try{
		        	
		        MessageDigest md = MessageDigest.getInstance("MD5");
		        md.update(input.getBytes());
		        byte[] digestBytes = md.digest();
		        String hashValue = DatatypeConverter.printHexBinary(digestBytes).toLowerCase();
		        System.out.println(hashValue);
		        }catch(Exception e){
		            e.printStackTrace();
		        }
		    }
}
