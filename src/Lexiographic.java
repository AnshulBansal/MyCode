import java.util.*;

public class Lexiographic {

	// This program generates the next Lexiographic order of the given set

	public static int currentmax = 0;
	public static int curentmaxindex = 0;
	public static int currentminindex = 0;
	public static int currentmin = 0;
	public static int i = 0;
	public static int[] set = { 1, 2, 3, 4, 5, 6,7 };

	public static void main(String args[]) {

		currentmin = set[0];
		currentmax = set[5];
		int i = 0;

		Getnextorder();
		Getnextorder();
		Getnextorder();

	}

	private static void Getnextorder() {
		// TODO Auto-generated method stub

		currentmax = set[set.length-1];
		curentmaxindex = set.length-1;
		currentminindex = 0;
		currentmin = 0;
		for (i = 5; i > 0; i--) {

			if (set[i] < currentmax) {
				currentmin = set[i];
				currentminindex = i;
				i = -1;
			}

		}
		System.out.println(currentminindex);
		for (i = currentminindex; i < set.length; i++) {
			if (set[i] <= currentmax && set[i] > currentmin) {
				currentmax = set[i];
				curentmaxindex = i;

			}

		}
		int temp;
		temp = set[curentmaxindex];
		set[curentmaxindex] = set[currentminindex];
		set[currentminindex] = temp;

		Arrays.sort(set, currentminindex + 1, set.length);
		for (i = 0; i < set.length; i++) {
			System.out.print(set[i] + "  ");
		}
		System.out.print("\n");
	}
}
