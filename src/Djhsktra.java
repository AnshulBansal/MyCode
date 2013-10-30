import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// This is the implementation of Djhsktra Shortest path Algorithm 
public class Djhsktra {
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	public static ArrayList<Integer> exploredarray = new ArrayList<Integer>();
	public static int[] pathlength = new int[205];
	public static int[][] edgewieght = new int[205][205];
	static int vertextotransverse = 0;
	static int vertextotraversefrom = 0;
	static int score = 100000000;
	public static void main(String args[]) throws FileNotFoundException{
		
		inputgraph();
		exploredarray.add(1);
		pathlength[1] = 0;
		for(int j = 0; j <200; j++){
		findnextvertextotraverse();
		System.out.print(vertextotransverse);
		System.out.print(score);
		addtotheexplored();
		}
		//7,37,59,82,99,115,133,165,188,197
		System.out.print("\n");
		System.out.print(pathlength[7]);
		System.out.print("\n");
		System.out.print(pathlength[37]);
		System.out.print("\n");
		System.out.print(pathlength[59]);
		System.out.print("\n");
		System.out.print(pathlength[82]);
		System.out.print("\n");
		System.out.print(pathlength[99]);
		System.out.print("\n");
		System.out.print(pathlength[115]);
		System.out.print("\n");
		System.out.print(pathlength[133]);
		System.out.print("\n");
		System.out.print(pathlength[165]);
		System.out.print("\n");
		System.out.print(pathlength[188]);
		System.out.print("\n");
		System.out.print(pathlength[197]);
		
		
		

	}

	private static void addtotheexplored() {
		// TODO Auto-generated method stub
		exploredarray.add(vertextotransverse);
		pathlength[vertextotransverse] = pathlength[vertextotraversefrom] + edgewieght[vertextotraversefrom][vertextotransverse];
	}

	private static void findnextvertextotraverse() {
		// TODO Auto-generated method stub
		score = 100000000;
		vertextotransverse =0;
		int tailvertex = 1;
		for(int j = 0;j<exploredarray.size();j++){
			tailvertex = exploredarray.get(j);
			findminimumgreedyscorefortailvertex(tailvertex);
			
			
		}
		
	}

	private static int findminimumgreedyscorefortailvertex(int tailvertex) {
		// TODO Auto-generated method stub
		
		int temp = 0;
		for(int j = 0 ; j<graph.get(tailvertex).size();j++){
			if(!(exploredarray.contains(graph.get(tailvertex).get(j)))){
			temp = pathlength[tailvertex] + edgewieght[tailvertex][graph.get(tailvertex).get(j)];
			if(temp<score){
				score = temp;
				vertextotransverse = graph.get(tailvertex).get(j);
			vertextotraversefrom = tailvertex;
			}
			}
		}
		return score;
	}

	private static void inputgraph() throws FileNotFoundException {
		// TODO Auto-generated method stub

		File f = new File("src/dijkstraData.txt");

		int i;
		int j;
		for (i = 0; i < 201; i++) {
			graph.add(new ArrayList<Integer>());
			//exploredarray.add(false);
			pathlength[i]= 15000;
			for(j =0 ; j<205;j++){
				edgewieght[i][j] = 15000;
			}
			
		}

		Scanner sr = new Scanner(f);

		
		while (sr.hasNext()) {
		Scanner s = new Scanner(sr.nextLine());
		i = s.nextInt();
		
		while(s.hasNext()){
			String l = s.next();
			l.indexOf(",");
		graph.get(i).add(Integer.parseInt(l.substring(0,l.indexOf(","))));
		edgewieght[i][Integer.parseInt(l.substring(0,l.indexOf(",")))] = Integer.parseInt(l.substring(l.indexOf(",")+1));
		}
		System.out.print(graph.get(i));
			System.out.print("\n");
		}
	}
		
		
	}


