import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// The Magic Sticks Problem
public class MagicStkProblem {

	public static void main(String[] a) throws NumberFormatException,
			IOException {

		int testcases;
		int numberofsticks;
		Integer[] arrayofsticks = new Integer[220];
		Integer[] arrayoffallensticks = new Integer[220];
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		java.io.BufferedReader in = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));

		testcases = Integer.parseInt(in.readLine());

		while (testcases != 0) {

			numberofsticks = Integer.parseInt(in.readLine());
			while (numberofsticks > 0) {

				Scanner sr = new Scanner(in.readLine());
				int temp = sr.nextInt() + 108;
				q.add(temp);
				q2.add(temp);
				arrayofsticks[temp] = sr.nextInt();
				numberofsticks--;

			}
			int i = 0;
			while (!(q2.isEmpty())) {

				int counteroffalllensticks = 1;
				int j = q2.poll();
				int f = j;
				if (arrayofsticks[j] != null) {
					int hieght = arrayofsticks[j];
					while (hieght > 1) {
						j++;
						hieght--;
						if (arrayofsticks[j] != null) {
							if (hieght < arrayofsticks[j]) {
								hieght = arrayofsticks[j];
								if (arrayoffallensticks[j] != null) {
									hieght = 0;
									counteroffalllensticks = counteroffalllensticks
											+ arrayoffallensticks[j];
									counteroffalllensticks--;
								}

							}

							counteroffalllensticks++;

						}

					}
					arrayoffallensticks[f] = counteroffalllensticks;
					counteroffalllensticks = 0;

				}
			}

			i = 0;
			while (!(q.isEmpty())) {
				i = q.poll();
				if (arrayoffallensticks[i] != null) {
					System.out.print(arrayoffallensticks[i]);
					System.out.print(" ");
				}

			}
			testcases--;

			arrayoffallensticks = new Integer[250];
			arrayofsticks = new Integer[250];

		}

	}
}