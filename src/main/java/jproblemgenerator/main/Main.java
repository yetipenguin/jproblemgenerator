package jproblemgenerator.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import jproblemgenerator.generators.ArrayProblemGenerator;
import jproblemgenerator.generators.HashMapProblemGenerator;
import jproblemgenerator.generators.HashSetProblemGenerator;
import jproblemgenerator.generators.JVMProblemGenerator;
import jproblemgenerator.generators.ListProblemGenerator;
import jproblemgenerator.generators.StringProblemGenerator;
import jproblemgenerator.generators.ThreadProblemGenerator;

public class Main {

	// FIXME Readme: set maximum RAM used	

	public static void main(String[] args) throws InterruptedException {
		CommandLineOptions.parseCommandLine(args);
		createProblems();

		System.out.println("Press enter to exit!");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createProblems() {
		if (CommandLineOptions.hasOptionCreateBigHashMap()) {
			HashMapProblemGenerator.createBigHashMap();
		}

		if (CommandLineOptions.hasOptionCreateBigList()) {
			ListProblemGenerator.createBigList();
		}

		if (CommandLineOptions.hasOptionCreateBigArrayInt()) {
			ArrayProblemGenerator.createBigArrayInt();
		}

		if (CommandLineOptions.hasOptionCreateBigArrayInteger()) {
			ArrayProblemGenerator.createBigArrayInteger();
		}

		if (CommandLineOptions.hasOptionCreateHashSetWithDuplicatEntries()) {
			HashSetProblemGenerator.createHashSetWithDuplicatEntries();
		}

		if (CommandLineOptions.hasOptionCreateInternStrings()) {
			StringProblemGenerator.createInternStrings();
		}

		if (CommandLineOptions.hasOptionCreateManyThreads()) {
			ThreadProblemGenerator.createManyThreads();
		}

		if (CommandLineOptions.hasOptionCrashJVM()) {
			JVMProblemGenerator.crashJVM();
		}

		if (CommandLineOptions.hasOptionCreateLeakedSystemProperties()) {
			createLeakedSystemProperty();
		}

		if (CommandLineOptions.hasOptionCreateStackOverflow()) {
			createStackoverflowException(null);
		}

		if (CommandLineOptions.hasOptionCreateHeapOverflow()) {
			createHeapOverflow();
		}
	}

	

	private static void createLeakedSystemProperty() {
		// Create a system property which will not be removed after the program terminates.
		Properties systemProperties = System.getProperties();
		systemProperties.setProperty("leak1", "leak1");
	}

	private static void createStackoverflowException(String string) {
		// Call the method recursive until the stack is full.
		createStackoverflowException(null);
	}

	private static void createHeapOverflow() {
		// Make the list bigger until the heap is full.
		List<String> list = new ArrayList<String>();
		while (true) {
			list.add(new String("createHeapOverflow"));
		}
	}

}
