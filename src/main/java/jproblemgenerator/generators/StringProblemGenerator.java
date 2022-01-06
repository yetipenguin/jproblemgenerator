package jproblemgenerator.generators;

public class StringProblemGenerator {
	public static void createInternStrings() {
		System.out.println("createInternStrings()");
		for (int i = 0; i < 100000; i++) {
			String string = "xy" + String.valueOf(i);
			string.intern();
		}
	}
}
