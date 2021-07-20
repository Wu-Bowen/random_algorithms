class Solution {
    public void dfsTraverseRecursive(int V, LinkedList<Integer>[] adj) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<> ();
        for(int i = 0; i < V; i++){
            if(!visited[i]) {
                q.add(i);
                while(!q.isEmpty()){
                    Vertex v = q.poll();
                    visited[v] = true;
                    for(Integer neighbor : adj[i]){
                        if(!visited[neighbor]) {
                            visited[neighbor] = true;
                            q.add(neighbor);
                        }
                    }
                }
            }
        }
        return;
    }
}