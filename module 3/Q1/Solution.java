package com.ads2.Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter no. of vertex:");
		int v = Integer.parseInt(br.readLine());
		
		DFS d = new DFS(v);
		int ch;
		
		do
		{
			System.out.println("Want to add edge ?");
			ch = Integer.parseInt(br.readLine());
		
			switch(ch)
			{
				case 0 :	int to = Integer.parseInt(br.readLine());
							int from = Integer.parseInt(br.readLine());j
							d.addEdge(to, from);
							break;
			}
		}while(ch < 1);
		
		System.out.println("Enter your starting vertex:");
		int V = Integer.parseInt(br.readLine());
		
		d.traversal(V);
	}

}
