public class Solution {
    // adjacency array and number of vertices
    public int kruskalMST(int connections[][], int N) {
        Arrays.sort(connections, (a, b) -> {a[2] - b[2]});
        Union u = new Union(N);
        int edges = 0;
        int totalCost = 0;
        for(int i = 0; i < connections.length; i++) {
            int node1 = connections[i][0];
            int node2 = connections[i][1];
            int p1 = union.findParent(node1);
            int p2 = union.findParent(node2);
            if(p1 != p2){
                edges++;
                union.union(node1, node2);
                totalCost += connections[i][2];
            }
        }
        if(edges == N -1) {
            return totalCost;
        }
        return -1;
    }

    static private class Union {
        public Map<Integer, Integer> nodeParent;
        // each node gets its own union
        public Union (int n) {
            nodeParent = new HashMap<>();
            for(int i = 1; i <= n; i++) {
                nodeParent.put(i, i);
            }
        }
        // recursive function to find the final parent
        public int findParent(int node) {
            if(node == nodeParent.get(node)) {
                return node;
            }
            return findParent(nodeParent.get(node));
        }
        // put p1 as parent of p2
        public void union (int node1, int node2) {
            int p1 = findParent(node1);
            int p2 = findParent(node2);
            if(p1 == p2) {
                return;
            }
            nodeParent.put(p2, p1);
        }
    }
}