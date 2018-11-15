import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Graph g=new Graph(br);
		Bipartite b=new Bipartite(g);
		b.display();
	}

}
