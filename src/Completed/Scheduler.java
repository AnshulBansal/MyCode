package Completed;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Scheduler {

	// This Algorithm Schedules the jobs according to difference of wieght of
	// length or wieght/length

	static int[][] jobs = new int[10000][10];

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("src/jobs.txt");
		Scanner sr = new Scanner(f);
		sr.next();
		int i = 0;
		for (i = 0; i < 10000; i++) {
			jobs[i][0] = sr.nextInt();
			jobs[i][1] = sr.nextInt();
			jobs[i][2] = jobs[i][0] / jobs[i][1];
		}
		Sortingbydifference();
		// Sortingbywieghtdividedbylength();
		for (i = 0; i < 1000; i++) {
			System.out.print(jobs[i][0] + " ");
			System.out.print(jobs[i][1] + " ");
			System.out.print(jobs[i][2] + " ");
			System.out.print("\n");
		}
		int time = 0;
		long wieghtedtime = 0;
		for (i = 0; i < 10000; i++) {

			time = (int) ((int) time + jobs[i][1]);
			wieghtedtime = (long) ((long) wieghtedtime + time * jobs[i][0]);

		}
		System.out.print(wieghtedtime);

	}

	private static void Sortingbydifference() {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		for (i = 0; i < 10000; i++) {
			for (j = 0; j < 9999; j++) {

				if (jobs[j][2] < jobs[j + 1][2]) {
					int l, m, n;
					l = jobs[j][0];
					m = jobs[j][1];
					n = jobs[j][2];
					jobs[j][0] = jobs[j + 1][0];
					jobs[j][1] = jobs[j + 1][1];
					jobs[j][2] = jobs[j + 1][2];
					jobs[j + 1][0] = l;
					jobs[j + 1][1] = m;
					jobs[j + 1][2] = n;
				} else {
					if (jobs[j][2] == jobs[j + 1][2]) {

						if (jobs[j][0] < jobs[j + 1][0]) {
							float l, m, n;
							l = jobs[j][0];
							m = jobs[j][1];
							n = jobs[j][2];
							jobs[j][0] = jobs[j + 1][0];
							jobs[j][1] = jobs[j + 1][1];
							jobs[j][2] = jobs[j + 1][2];
							jobs[j + 1][0] = (int) l;
							jobs[j + 1][1] = (int) m;
							jobs[j + 1][2] = (int) n;

						}
					}
				}

			}

		}

	}

	private static void Sortingbywieghtdividedbylength() {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		for (i = 0; i < 10000; i++) {
			for (j = 0; j < 9999; j++) {

				if (jobs[j][0] * jobs[j + 1][1] < jobs[j + 1][0] * jobs[j][1]) {
					int l, m, n;
					l = jobs[j][0];
					m = jobs[j][1];
					n = jobs[j][2];
					jobs[j][0] = jobs[j + 1][0];
					jobs[j][1] = jobs[j + 1][1];
					jobs[j][2] = jobs[j + 1][2];
					jobs[j + 1][0] = l;
					jobs[j + 1][1] = m;
					jobs[j + 1][2] = n;
				} else {
					if (jobs[j][2] == jobs[j + 1][2]) {

						if (jobs[j][0] < jobs[j + 1][0]) {
							float l, m, n;
							l = jobs[j][0];
							m = jobs[j][1];
							n = jobs[j][2];
							jobs[j][0] = jobs[j + 1][0];
							jobs[j][1] = jobs[j + 1][1];
							jobs[j][2] = jobs[j + 1][2];
							jobs[j + 1][0] = (int) l;
							jobs[j + 1][1] = (int) m;
							jobs[j + 1][2] = (int) n;

						}
					}
				}

			}

		}

	}
}