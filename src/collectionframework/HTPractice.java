package collectionframework;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HTPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creation of MAP[Hashtable]
		Map<Integer,String> mp = new Hashtable<>();
		
		//addition of elements into the map
		mp.put(500502, "Hyderabad");
		mp.put(620067, "Chennai");
		mp.put(234567, "Bangalore");
		
		//retrieval of keys from map (keySet())
		
		Set<Integer> keys = mp.keySet();
		for(Integer key:keys)
		{
			System.out.println(key);
		}
		
		//retrieval of values from map we use values()
		Collection<String> values = mp.values();
		for(String value:values)
		{
			System.out.println(value);
		}
		System.out.println();
		//retrieval of values from map based on key
		System.out.println(mp.get(234567));
		
		//retrieval of key and value
		for(Integer key:keys) {
			System.out.println(key+"----"+mp.get(key));
			
		}
		System.out.println();
		System.out.println(mp);
		//Deletion of element from map
		mp.remove(234567);
//		mp.remove(234567,"Bangalore");
		
		//verify key and value is present or not using contain method
		System.out.println(mp.containsKey(500502));
		System.out.println(mp.containsValue("Chennai"));
		
		//to update value
		mp.put(234567, "Delhi");
		mp.replace(500502, "Ooty");
		System.out.println(mp);
		//putifAbsent is used for if there is no value present in the particular key then add the value, if it is present then it will not add the value.
		mp.putIfAbsent(234567, "Goa");
		System.out.println(mp);
		System.out.println(mp.size());
		//to delete entire map
//		mp.clear();
		
		//to get key and value we can also use Entry class
		Set<Entry<Integer, String>> entries = mp.entrySet();
		   for (Entry<Integer, String> entry : entries) {
				Integer key = entry.getKey();
				String value = entry.getValue();
				System.out.println(key+"--"+value);
			}
		

	}

}
