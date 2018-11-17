package com.ads2.Q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter no. of vertex:");
		int v = Integer.parseInt(br.readLine());
		
		BFS b = new BFS(v);
		int ch;
		
		do
		{
			System.out.println("Want to add edge?");
			ch = Integer.parseInt(br.readLine());
			
			switch(ch)
			{
				case 0 : int to = Integer.parseInt(br.readLine());
						 int from = Integer.parseInt(br.readLine());
						 b.addEdge(to, from);
						 break;
			}
		}while(ch<1);
		
		System.out.println("Enter the vertex you want to start ?");
		b.BFSTraversal(Integer.parseInt(br.readLine()));
	}
}
