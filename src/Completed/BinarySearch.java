package Completed;


import java.util.*;

// This Program Searches any element using Binary Search
public class BinarySearch {
	
	public static int[] array = {1,6,3,24,12,3,1,23,1,2,31,23,12,3,1};
	// Declare the set here
	
	public static int key;
	public static boolean exists = false;	
	public static void main (String Args[]){
		
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value to be found");
	key =	Integer.parseInt(in.next());
		
	Arrays.sort(array);
	
	Search(array);
	
	
	
	
	
	
	System.out.print(exists);
		
		
		
		
		
		
	}

	private static void Search(int[] array2) {
		// TODO Auto-generated method stub
		if(array2.length == 1){
			return;
		}
		
		if(key == array2[(array2.length)/2]){
			
			exists = true;
			
		}else{
			if(key < array2[(array2.length)/2] ){
				array2 = Arrays.copyOfRange(array2,0, array2.length/2);
				Search(array2);
			}else{
				array2 = Arrays.copyOfRange(array2, array2.length/2, array2.length);
				Search(array2);
				
			}
			
			
		}
		
		
	}

}
