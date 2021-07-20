class Solution {
    public void dfsTraverseRecursive(int V, ArrayList<Integer>[] adj) {
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
                            visited[j] = true;
                            s.push(j);
                        }
                    }
                }
            }
        }
        return;
    }
}
// O (V + E)