
public class TicTacToe {

	static int cross = 1;
	static int zero = 2;
	static int none = 0;
	static int finalwin = 0;
	static int[][] bigarraydecision = new int[4][4];
	static int[][] totalarray = new int[10][10];
	static int[][] currentarray = new int[4][4];
	public static void main(String args[]){
		
		
		int i=0;
		int j=0;
		for(i=1;i<10;i++){
			for(j=1;j<10;j++){
				
				totalarray[i][j] = cross;
			}
			}
		for(i=1;i<4;i++){
			for(j=1;j<4;j++){	
				subarray(i,j);
			}
		}
		finalwin = checkarray(bigarraydecision,zero);
		finalwin = checkarray(bigarraydecision,cross);
		System.out.print(finalwin);
	}

	private static void subarray(int i, int j) {
		// TODO Auto-generated method stub
		int l=0,m=0;
		int k=1,n=1;
		int whowin = none;
		for(l = 3*i-2 ;l<3*i+1;l++  ){
			n=1;
			for(m = 3*j-2;m<3*j+1;m++){
				currentarray[k][n] = totalarray[l][m];
				n++;
			}
			k++;	
		}
		
		whowin = checkarray(currentarray,cross);
		whowin = checkarray(currentarray,zero);
		System.out.print(whowin);
		bigarraydecision[i][j] = whowin;
		}

	private static int checkarray(int[][] currentarray2, int cross2) {
		// TODO Auto-generated method stub
		if(currentarray2[1][1] == cross2 && currentarray[1][2] == cross2 && currentarray[1][3] ==cross2   ){
			return cross2;
		}
		if(currentarray2[2][1] == cross2 && currentarray[2][2] == cross2 && currentarray[2][3] ==cross2   ){
			return cross2;
		}
		if(currentarray2[3][1] == cross2 && currentarray[3][2] == cross2 && currentarray[3][3] ==cross2   ){
			return cross2;
		}
		if(currentarray2[1][1] == cross2 && currentarray[2][1] == cross2 && currentarray[3][1] ==cross2   ){
			return cross2;
		}
		if(currentarray2[1][2] == cross2 && currentarray[2][2] == cross2 && currentarray[3][2] ==cross2   ){
			return cross2;
		}
		if(currentarray2[1][3] == cross2 && currentarray[2][3] == cross2 && currentarray[3][3] ==cross2   ){
			return cross2;
		}
		if(currentarray2[1][1] == cross2 && currentarray[2][2]==cross2 && currentarray[3][3] ==cross2){
			return cross2;
		}
		if(currentarray2[3][1] == cross2 && currentarray[2][2]==cross2 && currentarray[1][3] ==cross2){
			return cross2;
		}
		return none;
		
	}
}
