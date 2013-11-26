import java.lang.Character.Subset;
import java.util.*;

public class MultiSet {
	// This Programs find the substraction and the addition of 2 sets

	// Enter the sets here
	public static int[] firstset ;
	public static int[] secondset;

	public static int[] subsset; 
	public static ArrayList<Integer> addset = new ArrayList<Integer>();

	public static void main(String args[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		System.out.print("Enter the no of elements of first set");
		Scanner sr = new Scanner(System.in);
		k = sr.nextInt();
		firstset = new int[k+1];
		while(k>0){
			firstset[k] = sr.nextInt();
			addset.add(firstset[k]);
					k--;
		}
		
		System.out.print("Enter the no of elements of 2nd set");
		
		k = sr.nextInt();
		secondset = new int[k+1];
		while(k>0){
			secondset[k] = sr.nextInt();
		addset.add(secondset[k]);
			k--;
			
		}
		subsset = new int[60];
		for(i=1;i<firstset.length;i++){
			subsset[i] = firstset[i];
		}
		Collections.sort(addset);
		//addset.add(firstset[1]);
		for (i = 1; i < firstset.length; i++) {
			for (j = 1; j < secondset.length; j++) {

				if (firstset[i] == secondset[j]) {
					subsset[i] = 0;
				}
			//	if (!addset.contains(secondset[j])) {
			//		addset.add(secondset[j]);
			//	}
			//	if (!addset.contains(firstset[i])) {
				//	addset.add(firstset[i]);
			//	}

			}


		}
		System.out.println("Substraction is");
		for (i = 0; i < subsset.length; i++) {
			if (subsset[i] != 0) {
				System.out.print(subsset[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Addition is");
		System.out.print(addset);

	}

}
