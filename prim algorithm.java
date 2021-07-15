public class MST {
    // adjacency array and number of vertices
    public void primMST(int graph[][], int V) {
        int[] parent = new int[V];
        int[] key = new int[V];

        Boolean mstSet = new Boolean[V];
        for(int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;
        for(int i = 0; i < V-1; i++) {
            int minIndex = minKey(key, mstSet);
            mstSet[i] = true;
            for(int j = 0; j < V; j++){
                if(graph[minIndex][j] != 0 && mstSet[j] = false && graph[minIndex][j] < key[j]){
                    key[j] = graph[minIndex][j];
                    parent[j] = minIndex;
                }
            }
        }
        // calculate total cost
        int cost = 0;
        for(int i = 1; i < V; i++) {
            cost += graph[i][parent[i]];
        }
        return cost;
    }

    public int minKey(int[] key, boolean[] mstSet){ 
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i = 0; i < mstSet.length; i++) {
            if(mstSet[i] == false && key[i] < min) {
                min = key[i];
                min_Index = i;
            }
        }
        return minIndex;
    }
}