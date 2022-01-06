package jproblemgenerator.generators;

public class ArrayProblemGenerator {
	private static int arrayInt[] = new int[100000];
	private static Integer arrayInteger[] = new Integer[100000];
	

	public static void createBigArrayInt() {
		System.out.println("createBigArrayInt()");
		for (int i = 0; i < 100000; i++) {
			arrayInt[i] = i;
		}
	}

	public static void createBigArrayInteger() {
		System.out.println("createBigArrayInteger()");
		for (int i = 0; i < 100000; i++) {
			arrayInteger[i] = i;
		}
	}

}
