/*
A new school in Byteland is now in the process of renewing some classrooms with new, stronger and better chairs, so that the students can stay still and pay attention to class :)
However, due to budget and logistic reasons, it's only possible to carry a chair at a time to the classroom, which means that for a long time, many students will be up, waiting for their chair to arrive.
The teacher, however, as she is very clever, decided to challenge her students with a problem: "Imagine that there are N students in the classroom and that there are only K chairs. In how many ways, can I choose K elements from the class to sit down, if I see them as being distinct?"
Lira replied immediately with the right answer, so, the teacher decided to make the game a little funnier: "Okay Lira, as you are so fast, now I want you to tell me exactly the same thing, but, with the addition that the value of K is changing, this is, I want you to tell me the sum of the number of ways I can sit down K of you, if the value of K goes from 1 (meaning that there are no chairs in the classroom but one) to N (meaning that all of your chairs arrived). Can you be as fast now? As the answer might get large I want you to tell me the result modulo 1000000007. (109 + 7)"
As you might have noticed, it's time for you to help Lira solving this variant of the problem. :D
Input

The first line of the input file contains an integer T, denoting the number of test cases on the input file.
Afterwards, T lines follow, each containing an integer N, the number of students that the teacher will try to sit down as the number of chairs goes from 1 to N.
Output

For each test case, you should output an integer, denoting the sum of the number of ways the teacher can make N students sit down on K chairs, as K goes from 1 to N, modulo 109 + 7.
Constraints

1 ≤ T ≤ 100
1 ≤ N ≤ 100000000
 */
import java.util.Scanner;

class MissingSomeChairs {
	static int testcases = 0;
	static int k = 0;
	static int mod = 1000000007;
	static long l = 1;

	public static void main (String Args[]){
		
		Scanner sr = new Scanner(System.in); 
		testcases = sr.nextInt();
		while(testcases>0){

			k = sr.nextInt();
			while(k>0){
				
				if(k>10000){
			
			l = l*905611805; 
			k=k-10000;
			}else{
					l = l*2;
					k--;
					
				}
				
			if(l>mod){
			l =  l% mod;
			}
			}
			l--;
			System.out.println(l);
			testcases--;
			l =1;
			
		}
	return;
	}
}
