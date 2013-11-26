package Completed;

import java.util.Random;

public class RandomNumber {
	
	
	// Multi SET
	public static void main (String args[]){
		
		int rand =0;
		int i=0;
		Random r = new Random(10) ;
		for( i=0;i<10;i++){
		rand = r.nextInt(10);
		System.out.println(rand);
		}
	}

}
