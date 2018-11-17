package com.ads2.Q1;

import java.util.Iterator;
import java.util.LinkedList;

class DFS 
{
	int V;
	LinkedList<Integer> adj[];
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	DFS(int v) 
	{
		V = v;
		adj = new LinkedList[v];
		
		for(int i = 0;i < v ;i++)
		{
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int to,int from)
	{
		adj[to].add(from);
	}
	
	void isVisited(int v,boolean visited[])
	{
		visited[v] = true;
		System.out.print(v+" ");
		
		Iterator<Integer> it = adj[v].listIterator();
		while(it.hasNext())
		{
			int n = it.next();
			if(!visited[n])
			{
				isVisited(n,visited);
			}
		}
	}
	
	void traversal(int v)
	{
		boolean visited[] = new boolean[V];
		
		isVisited(v,visited);
	}
	
	
}
