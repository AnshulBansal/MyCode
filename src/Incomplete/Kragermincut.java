import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.text.html.MinimalHTMLWriter;

// This is the implementation of Krager mincut algorithm
public class Kragermincut {
	public static long total = 0;
	public static java.util.ArrayList<ArrayList<Integer>> GraphList = new ArrayList<ArrayList<Integer>>();
	public static java.util.ArrayList<ArrayList<Integer>> Graph = new ArrayList<ArrayList<Integer>>();
	public static int array[][] = new int[300][300];
	public static int currentmin = 100;
	static int counter = 0;

	public static void main(String[] args) throws IOException {

		GetGraphlist();
		for (int f = 2; f < 200; f++) {
			for (int m = 0; m <300; m++) {
				getedgesbetween(1, f);
			}
			System.out.print("currentmin is" + currentmin + "\n");
		}
	}

	private static void GetGraphlist() throws FileNotFoundException {
		// TODO Auto-generated method stub
		GraphList.clear();
		File f = new File("src/kargerMinCut.txt");
		Scanner s = new Scanner(f);
		int i = 0;
		int j = 0;

		while (s.hasNext()) {
			Scanner sl = new Scanner(s.nextLine());
			sl.nextInt();
			java.util.ArrayList<Integer> tempList = new ArrayList<Integer>();
			while (sl.hasNext()) {
				tempList.add(sl.nextInt());
			}
			GraphList.add(tempList);
			i++;
		}
	}

	private static void getedgesbetween(int i, int j) {
		// TODO Auto-generated method stub
		counter = 0;
		Random rand = new Random();
		for (int j1 = 0; j1 < 200; j1++) {
			int value = rand.nextInt(198) + 1;
			if (!(GraphList.get(value).isEmpty()) && value != i && value != j
					&& GraphList.get(value).get(0) != 0) {
				combine(value, GraphList.get(value).get(0));
			} else {
			}
		}
		i--;
		java.util.ArrayList<Integer> tempList = new ArrayList<Integer>();
		tempList = GraphList.get(i);
		i++;
		for (int l = 0; l < tempList.size(); l++) {
			int value = tempList.get(l);
			if (value != j && value != 0) {
				combine(i, value);
			} else {
				if (value != 0) {
					counter++;
				}
			}
		}
		//System.out.print(counter + "\n");
		if (currentmin > counter && counter != 0) {
			// tempList.clear();
			System.out.print("Current min" + counter);
			currentmin = counter;
			counter = 0;
		}
		try {
			GetGraphlist();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void combine(int i, int j) {
		// TODO Auto-generated method stub
		i--;
		j--;
		java.util.ArrayList<Integer> temp = new ArrayList<Integer>();
		GraphList.get(i).addAll(GraphList.get(j));
		GraphList.get(j).clear();
		i++;
		j++;
		for (int i2 = 0; i2 < GraphList.size(); i2++) {

			temp = GraphList.get(i2);
			for (int j2 = 0; j2 < temp.size(); j2++) {
				if (GraphList.get(i2).get(j2).equals(j)) {
					// System.out.print("Loop Entered");
					GraphList.get(i2).set(j2, i);
				}
			}

		}
		int value = i;
		i--;
		j--;
		for (int j3 = 0; j3 < GraphList.get(i).size(); j3++) {
			if (GraphList.get(i).get(j3).equals(value)) {
				// System.out.print("Entered 2nd loop");
				int index = GraphList.get(i).indexOf(value);
				GraphList.get(i).set(index, 0);
			}
		}

	}

	private static void Printgraph() {
		// TODO Auto-generated method stub
		System.out.print("\n");
		for (int i = 0; i < GraphList.size(); i++) {

			System.out.print(GraphList.get(i));

			System.out.print("\n");
		}
	}
}