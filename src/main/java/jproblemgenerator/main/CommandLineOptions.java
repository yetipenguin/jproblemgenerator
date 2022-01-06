package jproblemgenerator.main;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.lang3.ArrayUtils;

public class CommandLineOptions {
	private static CommandLine commandLine;
	private static Option optionCreateBigHashMap = new Option("bigHashMap", "create-big-hashmap", false,
			"Creates a big HashMap");
	private static Option optionCreateBigList = new Option("bigList", "create-big-list", false, "Creates a big List");
	private static Option optionCreateBigArrayInt = new Option("bigArrayInt", "create-big-array-int", false,
			"Creates a big array of ints");
	private static Option optionCreateBigArrayInteger = new Option("bigArrayInteger", "create-big-array-integer", false,
			"Creates a big array of integers");
	private static Option optionCreateHashSetWithDuplicatEntries = new Option("hashSetWithDuplicateEntries",
			"create-hashSet-with-duplicate-entries", false, "Creates a HashSet with duplicate entries.");
	private static Option optionCreateInternStrings = new Option("internStrings", "create-intern-strings", false,
			"Creates interalized strings.");
	private static Option optionCreateManyThreads = new Option("manyThreads", "create-many-threads", false,
			"Creates many threads.");

	private static Option optionCrashJVM = new Option("crashJVM", "crash-jvm", false, "Crashes the JVM.");

	private static Option optionCreateLeakedSystemProperties = new Option("leakedSystemProperties",
			"create-leaked-system-propertes", false, "Creates a memory leak by creating system properties.");

	private static Option optionCreateStackoverflow = new Option("stackOverflow", "create-stackoverflow", false,
			"Creates a stackoverflow.");
	private static Option optionCreateHeapOverflow = new Option("heapOverflow", "create-heapoverflow", false,
			"Creates a heapoverflow.");

	public static void parseCommandLine(String[] args) {
		Options options = new Options();
		optionCreateBigHashMap.setRequired(false);
		options.addOption(optionCreateBigHashMap);
		options.addOption(optionCreateBigList);
		options.addOption(optionCreateBigArrayInt);
		options.addOption(optionCreateBigArrayInteger);
		options.addOption(optionCreateHashSetWithDuplicatEntries);
		options.addOption(optionCreateInternStrings);
		options.addOption(optionCreateManyThreads);
		options.addOption(optionCrashJVM);
		options.addOption(optionCreateLeakedSystemProperties);
		options.addOption(optionCreateStackoverflow);
		options.addOption(optionCreateHeapOverflow);

		CommandLineParser parser = new DefaultParser();
		HelpFormatter formatter = new HelpFormatter();
		formatter.setWidth(100);
		try {
			commandLine = parser.parse(options, args);
			if (ArrayUtils.isEmpty(commandLine.getOptions())) {
				formatter.printHelp("jproblemgenerator", options, true);
				System.exit(1);
			}
		} catch (ParseException e1) {
			formatter.printHelp("jproblemgenerator", options, true);
			e1.printStackTrace(System.err);
			System.exit(2);
		}
	}

	public static boolean hasOptionCreateBigHashMap() {
		return commandLine.hasOption(optionCreateBigHashMap);
	}

	public static boolean hasOptionCreateBigList() {
		return commandLine.hasOption(optionCreateBigList);
	}

	public static boolean hasOptionCreateBigArrayInt() {
		return commandLine.hasOption(optionCreateBigArrayInt);
	}

	public static boolean hasOptionCreateBigArrayInteger() {
		return commandLine.hasOption(optionCreateBigArrayInteger);
	}

	public static boolean hasOptionCreateHashSetWithDuplicatEntries() {
		return commandLine.hasOption(optionCreateHashSetWithDuplicatEntries);
	}

	public static boolean hasOptionCreateInternStrings() {
		return commandLine.hasOption(optionCreateInternStrings);
	}

	public static boolean hasOptionCreateManyThreads() {
		return commandLine.hasOption(optionCreateManyThreads);
	}

	public static boolean hasOptionCrashJVM() {
		return commandLine.hasOption(optionCrashJVM);
	}

	public static boolean hasOptionCreateLeakedSystemProperties() {
		return commandLine.hasOption(optionCreateLeakedSystemProperties);
	}

	public static boolean hasOptionCreateStackOverflow() {
		return commandLine.hasOption(optionCreateStackoverflow);
	}

	public static boolean hasOptionCreateHeapOverflow() {
		return commandLine.hasOption(optionCreateHeapOverflow);
	}
}
