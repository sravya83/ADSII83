import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 String s=br.readLine();
	 //System.out.println("list "+s);
		 switch(s)
	 {
	 case "List":
		
		 /*int ver=Integer.parseInt(br.readLine());
		 System.out.println("v"+ver);
		 int edg=Integer.parseInt(br.readLine());
		 System.out.println("e"+edg);*/
		 Graph g=new Graph(br);
         System.out.println(g.toString());
		
		 break;
	 case "Matrix":
		 int s1=br.read();
		 int s2=br.read();
		// Matrix m=new Matrix(s1,s2);
		 break; 
	 }
	}

}
