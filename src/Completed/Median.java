import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Median {
	
	public static ArrayList<Integer> input = new ArrayList<Integer>();
	public static int counter =0;
	public static int size =0;
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("src/Median.txt");
		Scanner s = new Scanner(f);
		while(s.hasNext()){
			input.add(s.nextInt());
			Collections.sort(input);
			size = input.size();
			if(size%2 == 0){
				size = size/2;
				size--;
			}else{
				size = (size+1)/2;
				size--;
			}
			counter = counter + input.get(size);
			
		}
		System.out.print(counter);
		
		
		
	}

}
