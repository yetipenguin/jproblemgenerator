package jproblemgenerator.generators;

import java.util.ArrayList;
import java.util.List;

public class ListProblemGenerator {
	private static List<String> list = new ArrayList<>();
	
	public static void createBigList() {
		System.out.println("createBigList()");
		for (int i = 0; i < 100000; i++) {
			list.add(String.valueOf(i));
		}
	}
}
