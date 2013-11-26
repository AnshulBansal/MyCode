package Completed;

import java.util.*;
public class AdditionandSubstractofsets {
	// This Programs find the substraction and the addition of 2 sets
	
	
	//Enter the sets here
	public static int[] firstset = {1,2,3,4,5,10};
	public static 	int[] secondset = {8,5,3,2,7,8,9};
	
	
	
	public static int[] subsset = firstset.clone();
	public static ArrayList<Integer> addset =new ArrayList<Integer>() ;
	public static void main(String args[]){
		int i=0;
		int j=0;
		addset.add(firstset[0]);
		for(i =0 ;i< firstset.length;i++){
			for(j=0;j<secondset.length;j++){
				
				if (firstset[i] == secondset[j]){
					subsset[i] = 0;
				}
				if(!addset.contains(secondset[j])){
					addset.add(secondset[j]);
				}
				if(!addset.contains(firstset[i])){
					addset.add(firstset[i]);
				}
				
			}
			
			
		}
		System.out.println("Substraction is");
		for(i=0;i<subsset.length;i++){
			if(subsset[i] != 0){
		System.out.print(subsset[i]+ " ");
		}
			}
		System.out.println();
		System.out.println("Addition is");
		System.out.print(addset);
		
		
	}

}
