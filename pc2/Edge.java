
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

 class Edge {
int src;
int dst;
double weight;
Edge(int src,int dst,double weight)
{
	this.src=src;
	this.dst=dst;
	this.weight=weight;
}
int V()
{
	return src;
}
int E()
{
	return dst;
}
double W()
{
	return weight;
}
}

class Graph
{
int v;
ArrayList<Edge>[] adj;
Graph(int v)
{
	this.v=v;
	adj=(ArrayList<Edge>[]) new ArrayList[v];
     for(int i=0;i<v;i++)
     {
			adj[i]=new ArrayList<Edge>();

     }
}
void addEdge(int s,int d,double w)
{
	Edge e=new Edge(s,d,w);
	Edge e1=new Edge(d,s,w);
	int v=e.V();
	adj[v].add(e);
	adj[d].add(e1);
}
Iterable<Edge> adj(int v)
{
	return adj[v];
}
int V()
{
	return v;
}
}
