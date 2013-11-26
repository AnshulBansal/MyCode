
public class Mod {
	
	public static void main(String Args[]){
		int l=1;
		int k =10000;
		while(k>0){
			l = l*2;
			if(l>1000000007){
				l = l%1000000007;
				
			}
			k--;
			
		}
				
		
		System.out.print(l);
		
	}

}
