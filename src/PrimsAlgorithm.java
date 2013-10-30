import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;;
public class PrimsAlgorithm {
	
	
// This is the implementation of Prim's Minimum spanning tree Algorithm and calculates the total weight of the MST
	
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	public static ArrayList<Integer> explored = new ArrayList<Integer>();
	public static int[][] edgewieght = new int[501][501];
	public static int vertextotransverse = 1;
	public static int score;
	public static int vertextotransformfrom = 1;
	public static int answer =0;
	public static void main(String[] args) throws FileNotFoundException{
		
		//-686902
		answer =0;
		inputgraph();
		explored.add(1);
		for(int j = 0; j <501; j++){
			findnextvertextotraverse();
			System.out.print(vertextotransverse);
			System.out.print("\n");
			explored.add(vertextotransverse);
		answer = answer + edgewieght[vertextotransformfrom][vertextotransverse];
			
			}
	for(int m=0;m<501;m++){
		if(!(explored.contains(m))){
			System.out.print("wrong answer");
		}
	}
		System.out.print(answer);
	}


	private static void findnextvertextotraverse() {
		// TODO Auto-generated method stub
		score = 100000000;
		vertextotransverse =0;
		int tailvertex = 1;
		for(int j = 0;j<explored.size();j++){
			tailvertex = explored.get(j);
			findminimumgreedyscorefortailvertex(tailvertex);
			
			
		}
	}


	private static void findminimumgreedyscorefortailvertex(int tailvertex) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int j = 0 ; j<graph.get(tailvertex).size();j++){
			if(!(explored.contains(graph.get(tailvertex).get(j)))){
			temp = edgewieght[tailvertex][graph.get(tailvertex).get(j)];
			if(temp<score){
				score = temp;
				vertextotransverse = graph.get(tailvertex).get(j);
			vertextotransformfrom = tailvertex;
			}
			}
		}
		
	}
	private static void inputgraph() throws FileNotFoundException {
		// TODO Auto-generated method stub
		int i=0;
		File f = new File("src/Prim.txt");
		Scanner sr = new Scanner(f);
		for (i = 0; i < 502; i++) {
			graph.add(new ArrayList<Integer>());
			
		}
		sr.next();
		sr.next();
		int l,m,n;
		while(sr.hasNext()){
			l = sr.nextInt();
			m = sr.nextInt();
			graph.get(l).add(m);
			graph.get(m).add(l);
			
			n = sr.nextInt();
			edgewieght[l][m] = n;
			edgewieght[m][l] = n;
			
			
		}
		for(i =0;i<501;i++){
			System.out.print(graph.get(i));
			System.out.print("\n");
		}
	}

}
