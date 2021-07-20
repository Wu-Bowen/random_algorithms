class Solution {
    public Node dfsTraverseRecursive(int V, LinkedList<Integer>[] adj) {
        boolean[] visited = new boolean[V];
        for(int i = 0; i < adj.length; i++) {
            if(!visited[i]){
                dfsHelper(i, adj, visited);
            }
        }
    }

    public void dfsHelper(int v, LinkedList<Integer>[] adj, boolean[] visited) {
        visited[v] = true;
        // cycle through neighbors
        for(int i = 0; i < adj[v].size(); i++) {
            if(!visited[i]) {
                dfsHelper(i, adj, visited);
            }
        }
    }
}
// O (V + E)