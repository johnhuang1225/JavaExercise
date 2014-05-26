package holding;

import static net.mindview.util.Print.print;

import java.util.*;

public class PrintContainers {

	protected static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	
	static Map fill(Map<String,String> map){
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}

	public static void main(String[] args) {
		print("#####以下為 Collection");
		print(fill(new ArrayList<String>()));
		print(fill(new LinkedList<String>()));
		print(fill(new HashSet<String>()));
		print(fill(new TreeSet<String>()));
		print(fill(new LinkedHashSet<String>()));
		print("#####以下為 Map");
		print(fill(new HashMap<String,String>()));
		print(fill(new TreeMap<String,String>()));
		print(fill(new LinkedHashMap<String,String>()));
		
	}

}
