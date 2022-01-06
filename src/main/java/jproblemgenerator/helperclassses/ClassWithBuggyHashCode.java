package jproblemgenerator.helperclassses;

public class ClassWithBuggyHashCode {
	public int hashCode() {
		return 42;
	};
}
