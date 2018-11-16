import java.util.Stack;

public class Depthfirsttree {
boolean[] marked;
Stack<Integer> reversepost;
public  Depthfirsttree(Digraph g)
{
	reversepost = new Stack<Integer>();
	marked = new boolean[g.V()];
	for(int i=0;i<g.V();i++)
	{
		if(!marked[i])
			dfs(g,i);
	}
}
void dfs(Digraph g,int v)
{
	marked[v]=true;
	for(int w:g.adj(v))
	
		if(!marked[v])
		
			dfs(g,v);

	reversepost.push(v);
}
public Iterable<Integer> reversepost()
{
	return reversepost;
}
void display()
{
	System.out.println("False");
}
}
