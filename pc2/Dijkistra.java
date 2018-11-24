

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Dijkistra {
		Hashtable<Integer,Double> h = new Hashtable<Integer,Double>();	
		Edge[] edgeto;
		double distanceto[];
		Dijkistra(Graph g,int s)
		{
			distanceto=new double[g.V()];
			edgeto=new Edge[g.V()];
			for(int i=0;i<g.V();i++)
			{
				distanceto[i]=Double.POSITIVE_INFINITY;
			}
			distanceto[s]=0.0;
			h.put(s, distanceto[s]);
			while(!h.isEmpty())
			{
			double max=100000;
			int key1=0;
			Set<Integer> st=h.keySet();
		   Iterator i=st.iterator();
		   while(i.hasNext())
		   {
	             int key=(int) i.next();
			    Double value=h.get(key);
			   if(max>value)
			   {
				   max=value;
				   key1=key;
			   }
		   }
		  h.remove(key1);
		  for(Edge e:g.adj(key1))
		  {
			  relax(e);
		  }
			}
		}
		void relax(Edge e)
		{
		int v=e.V();

		int w=e.E();

		if(distanceto[w]>distanceto[v]+e.W())
		{
			distanceto[w]=distanceto[v]+e.W();
			edgeto[w]=e;
			 if(!h.containsKey(w))
	         {
	         h.put(w, distanceto[w]);
	         }
	         else
	         {
	         	h.replace(w, distanceto[w]);
	         }
			 }
		
		}
		void display(int i)
		{
			//System.out.println(distanceto[i]);
			if(distanceto[i]==Double.POSITIVE_INFINITY)
			System.out.println("No Path Found.");
			else
				System.out.println(distanceto[i]);
			
		}

}