import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("initializing arrayListStyle");
		arrayListStyle();
		System.out.println("initializing linkedListStyle");
		linkedListStyle();
		System.out.println("initializing hashTableStyle");
		hashtableStyle();
	}

	private static void hashtableStyle() {
		Hashtable<Integer, Integer> hash = new Hashtable<>();
		Random random = new Random();

		System.out.println("adding random numbers");
		for (int i = 0; i < 2000000; i++) hash.put(i, random.nextInt(2000000));
		System.out.println("removing numbers");
		for (int i = 0; i < 2000000; i++) hash.remove(i);
	}

	private static void linkedListStyle() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		Random random = new Random();
		System.out.println("adding random numbers");
		for (int i = 0; i < 2000000; i++) linkedList.add(random.nextInt(2000000));
		System.out.println("removing numbers");
		for (int i = 0; i < 2000000; i++) linkedList.remove(0);
	}

	private static void arrayListStyle() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		Random random = new Random();
		System.out.println("adding random numbers");
		for (int i = 0; i < 2000000; i++) arrayList.add(random.nextInt(2000000));
		System.out.println("removing numbers");
		for (int i = 0; i < 2000000; i++) arrayList.remove(0);
	}
}
