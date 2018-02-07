package advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

// There's a HashMap<Integer,User>, Please sort it by age in User
// HashMap is a non-order Map, But LinkedHashMap has a insertion order
// we can make up use of Collections.sort() to sort it.
public class HashMapSort {
	public static HashMap<Integer, User> sortHashMap(HashMap<Integer, User> map) {
		Set<Entry<Integer, User>> entrySet = map.entrySet();
		List<Entry<Integer, User>> list = new ArrayList(entrySet);  //transfer set to list to get the compare method
		Collections.sort(list, new Comparator<Entry<Integer, User>>() {
			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().getAge() - o1.getValue().getAge();
			}
		});
		LinkedHashMap<Integer, User> linked = new LinkedHashMap<Integer, User>();
		for (Entry<Integer, User> e : list) {
			linked.put(e.getKey(), e.getValue());
		}
		return linked;
	}

	public static void main(String[] args) {
		HashMap<Integer, User> users = new HashMap<>();
		users.put(5, new User("Tom", 29));
		users.put(1, new User("Jasper", 5));
		users.put(3, new User("Nina", 22));
		users.put(2, new User("John", 28));
		System.out.println(users);
		HashMap<Integer, User> sortHashMap = sortHashMap(users);
		System.out.println(sortHashMap);
	}
}

class User {
	int age;
	String name;

	public User(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}

}