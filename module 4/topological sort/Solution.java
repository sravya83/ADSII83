import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Digraph g=new Digraph(br);
        Depthfirsttree b=new Depthfirsttree(g);
     //  System.out.println( b.reversepost());
       b.display();
       }
}
