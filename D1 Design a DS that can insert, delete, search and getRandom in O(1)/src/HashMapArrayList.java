import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*The idea is to use a hashmap in combination with an array list.
 The hash map will store the item -> location of the item in the arraylist
 When you delete an item, find the last element in the arraylist and swap
 it with the deleted element, update its new location and reduce the size
 of the list. That size is used to get a random number for getRandom()*/
public class HashMapArrayList {
	ArrayList<String> list;
	Map<String, Integer> map;

	public HashMapArrayList(ArrayList<String> list, Map<String, Integer> map) {
		this.list = list;
		this.map = map;
	}

	public Integer search(String data) {
		return map.get(data);
	}

	public void insert(String data) {
		list.add(data);
		map.put(data, list.size() - 1);
	}

	public void delete(String data) {
		Integer loc = map.get(data);
		if (loc != null) {
			list.remove(loc.intValue());
			list.add(loc, list.get(list.size() - 1));
			list.remove(list.size() - 1);
			map.remove(data);
			map.put(list.get(loc), loc);
		} else {
			System.out.println("No such element in the data structure\n");
		}
	}

	public String getRandom() {
		Random rand = new Random(System.currentTimeMillis());
		int ran = rand.nextInt(list.size());
		return list.get(ran);
	}

	public static void main(String[] args) {
		HashMapArrayList dataStructure = new HashMapArrayList(new ArrayList<String>(), new HashMap<String, Integer>());
		dataStructure.insert("devan");
		dataStructure.insert("deepan");
		dataStructure.insert("hari");
		dataStructure.insert("lalitha");
		dataStructure.delete("devan");
		System.out.println(dataStructure.getRandom());
		dataStructure.delete("deepan");
		System.out.println(dataStructure.getRandom());

	}
}
