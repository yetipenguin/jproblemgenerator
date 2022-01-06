package jproblemgenerator.generators;

import java.util.HashMap;

public class HashMapProblemGenerator {
	private static HashMap<String, String> hashMap = new HashMap<>();

	public static void createBigHashMap() {
		System.out.println("createBigHashMap()");
		hashMap.put("first", "Hello");
		hashMap.put("second", "StackOverflow");

		for (int i = 0; i < 100000; i++) {
			hashMap.put(String.valueOf(i), "value" + String.valueOf(i));
		}
	}
}
