package jproblemgenerator.generators;

import java.util.ArrayList;
import java.util.List;

public class ThreadProblemGenerator {
	private static List<Thread> threads = new ArrayList<>();
	
	public static void createManyThreads() {
		System.out.println("createManyThreads()");
		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread();
			threads.add(thread);
			thread.start();
		}
	}
}
