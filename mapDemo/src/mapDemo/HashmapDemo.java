package mapDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Map m = new HashMap<>();
		m.put("venktesh", "800");
		m.put("chiranjeevi", "500");
		m.put("nagarjun", "200");
		m.put("dhamalay", "800");
		System.out.println(m);// {k=v,k=v} hashcode based

		Collection c = m.values();
		System.out.println("values"+c);// [v,v,...] tostring based

		Set v = m.keySet();
		System.out.println("keys"+v);//[k,k,....]

		Set entry = m.entrySet();
		System.out.println("key+value"+entry);// [k=v,k=v]

		Iterator itr = entry.iterator();
		while (itr.hasNext()) {
			Map.Entry entry1 = (Map.Entry) itr.next();
			System.out.println(entry1.getKey() + "......" + entry1.getValue());
			if (entry1.getKey().equals("nagarjun")) {
				entry1.setValue(4400);
			}
		}

		System.out.println(entry);
		
		Map sm=Collections.synchronizedMap(m);
		System.out.println("synchronized version of map"+sm);
	}

}
