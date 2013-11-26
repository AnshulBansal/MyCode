import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Recently Chef become very much interested in perfect squares. We all know Chef and his weird interests. Anyways Chef will be soon writing his masters thesis on perfect squares revealing what-not-known properties of perfect squares.
 While doing his research, he happened to be confronted with some interesting perfect squares. These prefect squares consists only of digits which are themselves perfect squares. 0, 1, 4 and 9 are such digits. These are called perfect digits.
 As we all know Chef also has habit of asking too many questions, he is asking- given two numbers a and b, how many perfect squares exists between these two numbers inclusive, that contains only perfect digits. 
 Input:
 First line of input will contains T, number of test cases. Then T lines follows, each containing two positive integers a and b.
 Constraints:
 T <= 500
 1<= a <= b <= 10000000000 
 Output:
 For each input, output number of perfect digit squares between given numbers. 
 Sample
 Input:
 2
 1 10
 100 10000
 Output:
 3
 9
 */
class SquareDigitSquares {

	static boolean[] array = new boolean[100001];
	static int perfectarray[] = { 0, 1, 2, 3, 7, 10, 12, 20, 21, 30, 38, 70,
			97, 100, 102, 107, 120, 138, 200, 201, 210, 212, 300, 380, 648,
			700, 701, 951, 970, 997, 1000, 1002, 1007, 1020, 1049, 1070, 1200,
			1380, 1393, 2000, 2001, 2010, 2100, 2120, 3000, 3148, 3153, 3451,
			3743, 3747, 3800, 4462, 6357, 6480, 7000, 7001, 7010, 7071, 9510,
			9700, 9701, 9970, 9997, 10000, 10002, 10007, 10020, 10070, 10097,
			10200, 10243, 10490, 10538, 10679, 10700, 12000, 13800, 13930,
			20000, 20001, 20010, 20100, 20102, 20247, 20347, 20348, 21000,
			21200, 22138, 30000, 31480, 31488, 31530, 34510, 37430, 37470,
			37538, 38000, 38071, 38602, 44620, 63357, 63403, 63570, 64800,
			70000, 70001, 70010, 70100, 70107, 70299, 70710, 95100, 97000,
			97001, 97010, 99501, 99700, 99970, 99997, 100000 };
	static ArrayList<Integer> ans = new ArrayList<Integer>();

	public static void main(String Args[]) {
		int i = 0;
		long l = 0;

		for (i = 0; i < perfectarray.length; i++) {

			// l = i * i;
			// if (issquaredigitsquare(l)) {

			array[perfectarray[i]] = true;
			// System.out.println(perfectarray[i]);
			// System.out.print(",");
			// }
		}
		Scanner sr = new Scanner(System.in);
		int t = sr.nextInt();
		int answer = 0;
		long a = 0;
		long b = 0;
		long k = 0;
		while (t > 0) {

			a = (int) Math.sqrt(sr.nextLong());

			b = (int) Math.sqrt(sr.nextLong());

			for (k = a; k < (b + 1); k++) {

				if (array[(int) k] == true) {
					answer++;
				}
			}

			//answer++;
			System.out.println(answer);
			answer = 0;
			t--;
		}
		return;
	}

	private static boolean issquaredigitsquare(long l) {
		// TODO Auto-generated method stub
		long m = 0;
		while (l > 0) {
			m = l % 10;
			l = l / 10;
			if (m == 0 || m == 1 || m == 4 || m == 9) {

			} else {
				return false;
			}
		}
		return true;
	}
}
