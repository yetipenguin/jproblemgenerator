package jproblemgenerator.generators;

public class JVMProblemGenerator {
	public static void crashJVM() {
		System.out.println("crashJVM()");
		Object[] o = null;

		while (true) {
			o = new Object[] { o };
		}
	}
}
