import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
public class Collection27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a = new ArrayList();
//		a.add("KFC");
//		a.add("VAT");
//		a.add("MAT");
//		a.add("CAT");
//		a.add("ATM");
//		a.remove(1);
//		a.remove("MAT");
//		System.out.println(a);
		
		LinkedList Countries = new LinkedList();
		Countries.add("USA");
		Countries.add("UK");
		Countries.add("China");
		Countries.addLast("Spain");//Last no use ??
		Countries.addLast("Switzerland");
		Countries.add("Germany");
		Countries.addFirst("India");
		Countries.add(1,"Japan");
		
		System.out.println(Countries);	
		
		//Map
		
		Map country = new HashMap();
		country.put("India","Delhi");
		country.put("Japan","Tokyo");
		country.put("USA","NewYork");
		country.put("UK","London");
		country.put("Germany", "Berlin");
		
		country.remove("Germany");
		String key = "Germany";
		if (country.get(key)!= null) {
			System.out.println(country.get(key));
		}else {
			System.out.println("Not found");
		}
	}

}
