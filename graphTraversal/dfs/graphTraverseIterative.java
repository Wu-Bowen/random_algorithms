class Solution {
    public Node dfsTraverseRecursive(int V, LinkedList<Integer>[] adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> s = new Stack<> ();
        for(int i = 0; i < adj.length; i++) {
            if(!visited[i]){
                s.push(i);
                while(!s.isEmpty()){
                    int v = s.pop();
                    visited[v] = true;
                    for(int j = 0; j < adj[v].size(); j++) {
                        if(!visited[j]){
                            s.push(j);
                        }
                    }
                }
            }
        }
    }
}
// O (V + E)