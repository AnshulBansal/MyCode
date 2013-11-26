package Completed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	/*
	 * This is the implementation of MergeSort Algorithm
	 */
	public static long total =0;
	public static int array[] = new int[100000];
	public static void main(String[] args) throws IOException {

		File f = new File("src/IntegerArray.txt");
		Scanner s = new Scanner(f);
int i = 0;
		
		while(s.hasNext()){
			
			array[i] = s.nextInt();
			
		
			i++;
		}
		
	//	BruteForceMethod();
	int	n = array.length; 
	Mergeforcemethod(0 , n);
		
	}

	private static void Mergeforcemethod(int i, int n) {
		// TODO Auto-generated method stub
		if((n-i)<100000){
			int il=0;
			int j=0;
			for(il=i;il<n;il++){
				
				for(j=il;j<n;j++){
					if (array[il]>array[j]){
						total++;
					}
				
					
				}	
		
		}
			Arrays.sort(array, i, n);
		}else{

		Mergeforcemethod(i, n/2);

		Mergeforcemethod((n/2)+1, n);

		Countsplit(i,n);
		System.out.print(total);
		System.out.print("\n Final total");
		}
	}

	

	private static void Countsplit(int i, int n) {
		// TODO Auto-generated method stub
		
		int[] arraya = Arrays.copyOfRange(array, i, n/2);
		int[] arrayb = Arrays.copyOfRange(array, (n/2) +1, n);
		int ll = 0;
		int j=0;
		int k=0;
		for(ll=i;ll<n;ll++){
			
			if(arraya[j]<arrayb[k]){
				
				array[ll] = arraya[j];
				j++;
	if(!(j<arraya.length)){
		j--;
	}			
				
			}else{
				
				array[ll] = arrayb[k];
				k++;
				if(!(k<arrayb.length)){
					k--;
				}
				total = total + n/2 - j+1;
			}
			
		}
		}
		
	

	private static void BruteForceMethod() {
		// TODO Auto-generated method stub
		long total = 0;
		int i=0;
		int j=0;
		for(i=0;i<100000;i++){
			
			for(j=i;j<100000;j++){
				if (array[i]>array[j]){
					total++;
				}
			
				
			}
			if(i%1000 == 0){
			System.out.print(total);
			System.out.print("\n");
			}
		}
		System.out.print(total);
		System.out.print("\n Final total");
	}
}
