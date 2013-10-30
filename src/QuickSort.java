import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	

	// This is the implementation of quicksort algorithm using last median and first pivot
	public static long total = 0;
	public static int array[] = new int[10000];
	public static int counter=0;

	public static void main(String[] args) throws IOException {

		File f = new File("src/QuickSort.txt");
		Scanner s = new Scanner(f);
		int n = 0;

		while (s.hasNext()) {

			array[n] = s.nextInt();
		//	System.out.print(array[i] + "\n");

			n++;
		}
      n = array.length-1;
		QuickSrtusingfirstpivot(0,n);
	//	Quicksortusinglastpivot(0,n);
		//quicksortusingmedianpivot(0,n);
		// BruteForceMethod();
for(int i1=0;i1<n+1;i1++){
	System.out.print(array[i1] + "\n");
}
System.out.print(counter);
	}

	private static void quicksortusingmedianpivot(int l, int k) {
		// TODO Auto-generated method stub
		if(l==k){
			return;
		}
		if (k>l){
		int i=l+1; // startelement
		int j=l+1; // 
		int temp;
		int arrayr[] = new int[3];
		arrayr[0] = array[l];
		arrayr[1] = array[k];
		arrayr[2] = array[(l+k)/2];
		Arrays.sort(arrayr);
		int pivot = 0;

		if(arrayr[1] == array[l]){
	
			pivot = array[l];	
		}
		if(arrayr[1] == array[k]){
			
			
			temp = array[k];
			array[k] = array[l];
			array[l]=temp;
			pivot = array[l];
			}
		if(arrayr[1] == array[(l+k)/2]){
			
			temp = array[(l+k)/2];
			array[(l+k)/2] = array[l];
			array[l]=temp;
			pivot = array[l];	
			}
			
			for(j=l+1;j<k+1;j++){
				int vella = array[j];
				counter++;
				if(array[j]<pivot){
					
					temp = array[i];
					array[i] = array[j];
					array[j]=temp;
					
					i++;
					
					
					
					
				}
				
					
					
				
			}
			i--;
		
			temp = array[i];
			array[i] = array[l];
			array[l] = temp;
			
			quicksortusingmedianpivot(l,i-1);
			quicksortusingmedianpivot(i+1,k);
		return;
			
		}else{
			return;
		}
	}

	private static void Quicksortusinglastpivot(int l, int k) {
		// TODO Auto-generated method stub
		if(l==k){
			return;
		}
		if (k>l){
		int i=l+1; // startelement
		int j=l+1; // 
		int temp;
		temp = array[l];
		array[l] = array[k];
		array[k]=temp;
		
		int pivot = 0;
			pivot = array[l];	
		
			
			for(j=l+1;j<k+1;j++){
				int vella = array[j];
				counter++;
				if(array[j]<pivot){
					
					temp = array[i];
					array[i] = array[j];
					array[j]=temp;
					
					i++;
					
					
					
					
				}
				
					
					
				
			}
			i--;
		
			temp = array[i];
			array[i] = array[l];
			array[l] = temp;
			
			Quicksortusinglastpivot(l,i-1);
			Quicksortusinglastpivot(i+1,k);
		return;
			
		}else{
			return;
		}
		
	}



	private static void QuickSrtusingfirstpivot(int l, int k) {
		// TODO Auto-generated method stub
		if(l==k){
			return;
		}
		if (k>l){
		int i=l+1; // startelement
		int j=l+1; // 
		int pivot = 0;
			pivot = array[l];	
		
			
			for(j=l+1;j<k+1;j++){
				int vella = array[j];
				counter++;
				if(array[j]<pivot){
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j]=temp;
					
					i++;
					
					
					
					
				}
				
					
					
				
			}
			i--;
			int temp;
			temp = array[i];
			array[i] = array[l];
			array[l] = temp;
			
			QuickSrtusingfirstpivot(l,i-1);
			QuickSrtusingfirstpivot(i+1,k);
		return;
			
		}else{
			return;
		}
		
	}
}
