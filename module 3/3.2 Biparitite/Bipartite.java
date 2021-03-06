
public class Bipartite {
    private boolean isBipartite;   
    private boolean[] color;       
    private boolean[] marked;                
    private Stack<Integer> cycle;  
    public Bipartite(Graph G) {
        isBipartite = true;
        color  = new boolean[G.V()];
        marked = new boolean[G.V()];

        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {
                dfs(G, v);
            }
        }
    }
    private void dfs(Graph G, int v) { 
        marked[v] = true;
       // System.out.println(marked[v]);
        for (int w : G.adj(v)) {

           // if (cycle != null) return;

            if (!marked[w]) {
                color[w] = !color[v];
                dfs(G, w);
            } 

            
            /*else if (color[w] == color[v]) {
                isBipartite = false;
                cycle = new Stack<Integer>();
                cycle.push(w);  
                for (int x = v; x != w;) {
                    cycle.push(x);
                }
                cycle.push(w);   */  
				else if(color[w]==color[v])
			{
                System.out.println("Graph is not a bipartite");
				System.exit(0);
			}	}
        }
    
    public boolean isBipartite() {
        return isBipartite;
    }

	public void display() {
		// TODO Auto-generated method stub
	
		System.out.println("Graph is bipartite");
	
	
}}