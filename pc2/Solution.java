

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
public static void main(String[] args) throws NumberFormatException, IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int v=Integer.parseInt(br.readLine());
   Graph g=new Graph(v);
   
   int e=Integer.parseInt(br.readLine());
   for(int i=0;i<e;i++)
   {
	   String p=br.readLine();
	   String[] y=p.split(" ");
	   g.addEdge(Integer.parseInt(y[0]), Integer.parseInt(y[1]), Double.parseDouble(y[2]));
   }
   switch(br.readLine())
   {
   case "Graph":
   {
	   for(int i=0;i<v;i++)
	   {
		   System.out.println(i+":");
	   for(Edge e1:g.adj(i) )
	   {
		   System.out.print(e1.src+"-"+e1.dst+" "+e1.weight+" ");
	     
	   }
	   System.out.println();
	   }
	 
   }
   case "DirectedPaths":
   {
	   System.out.println();
	   String k=br.readLine();
	  // System.out.println(k);
	   String[] t=k.split(" ");
	 //  System.out.println(h[0]+","+h[1]);
	   Dijkistra d=new Dijkistra(g,Integer.parseInt(t[0]));
	  d.display(Integer.parseInt(t[1]));
   }
   case "ViaPaths":
   {
	   String w=br.readLine();
	   String[] k=w.split(" ");
	   Dijkistra dj=new Dijkistra(g,Integer.parseInt(k[0]));
	   dj.display(Integer.parseInt(k[1]));
	   Dijkistra d1=new Dijkistra(g,Integer.parseInt(k[1]));
	   d1.display(Integer.parseInt(k[2]));
   }
   }
}
}
