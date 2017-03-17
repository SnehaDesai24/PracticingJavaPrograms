import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GetPhoneNoFromPhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		int phone = in.nextInt();
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Sneha", 12345678);
		map.put("Krishna", 98765432);
		map.put("abcd", 47489404);
		map.put("lkm", 96648492);
		map.put("dfg", 54321897);
		
		Integer ph = map.get(name);
		System.out.println(name +" = "+ ph);
		
		/*Set<Map.Entry<String,Integer>> set = map.entrySet();
		
		Iterator<Map.Entry<String,Integer>> itr = set.iterator();
		
		while(itr.hasNext()){
			Map.Entry<String,Integer> o = (Map.Entry<String,Integer>)itr.next();
			
			String s = o.getKey();
			
			if(s.equals(name)){
				System.out.println(s+" = "+ o.getValue());
			}else{
				continue;
				//System.out.println("Not Found");
			}
		}*/
	}

}
