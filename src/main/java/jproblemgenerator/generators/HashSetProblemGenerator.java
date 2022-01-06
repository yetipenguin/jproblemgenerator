package jproblemgenerator.generators;

import java.util.HashSet;
import java.util.Set;

import jproblemgenerator.helperclassses.ClassWithBuggyHashCode;

public class HashSetProblemGenerator {
	private static Set<ClassWithBuggyHashCode> hashSetWithDuplicateEntries = new HashSet<>();

	public static void createHashSetWithDuplicatEntries() {
		System.out.println("createHashSetWithDuplicatEntries()");
		for (int i = 0; i < 100000; i++) {
			hashSetWithDuplicateEntries.add(new ClassWithBuggyHashCode());
		}
	}
}
