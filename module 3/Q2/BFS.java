package com.ads2.Q2;

import java.util.Iterator;
import java.util.LinkedList;

class BFS 
{
	int V;
	LinkedList<Integer> adj[];
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	BFS(int v) 
	{
		V = v;
		adj = new LinkedList[v];
		
		for(int i = 0;i < v;i++)
		{
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int to,int from)
	{
		adj[to].add(from);
	}
	
	void BFSTraversal(int v)
	{
		boolean[] visited = new boolean[V];
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		visited[v] = true;
		ll.add(v);
		
		while(ll.size() != 0)
		{
			v = ll.poll();
			System.out.print(v+" ");
			
			Iterator<Integer> it = adj[v].listIterator();
			while(it.hasNext())
			{
				int n = it.next();
				if(!visited[n])
				{
					visited[n] = true;
					ll.add(n);
				}
			}
		}
	}
	
	
}
