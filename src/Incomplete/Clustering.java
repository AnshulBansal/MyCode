import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// This program implements clustering

public class Clustering {
		public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		public static ArrayList<Integer> exploredarray = new ArrayList<Integer>();
		public static int[] pathlength = new int[205];
		public static int[][] edgewieght = new int[505][505];
		static int vertextotransverse = 0;
		static int vertextotraversefrom = 0;
		static int score = 100000000;
		public static void main(String args[]) throws FileNotFoundException{
			
			inputgraph();
			exploredarray.add(1);
			pathlength[1] = 0;
			//for(int j = 0; j <200; j++){
		//	findnextvertextotraverse();
			//}
			
			

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

			File f = new File("src/clustering1.txt");

			int i;
			int j;
			for (i = 0; i < 505; i++) {
				graph.add(new ArrayList<Integer>());
				
				
				for(j =0 ; j<505;j++){
					edgewieght[i][j] = 15000;
			
				}
				
			}

			Scanner sr = new Scanner(f);

		sr.next();
			int l,m;
			while(sr.hasNext()){
			l = sr.nextInt();
			 m = sr.nextInt(); 
			graph.get(l).add(m);
			edgewieght[l][m] = sr.nextInt();
		
			}
			for(int k = 0;k<500;k++){
			System.out.print(graph.get(k));
				System.out.print("\n");
			}
		}
			
			
		}


