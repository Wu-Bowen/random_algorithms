class Solution {
    public Node dfsClone(Node node) {
        HashMap<Node, Node> hm = new HashMap<> ();
        return dfsCloneHelper(node, hm);
    }
    public Node dfsCloneHelper(Node node, HashMap<Node, Node> hm) {
        if(node == null) {
            return node;
        }
        if(hm.containsKey(node)){
            return hm.get(node);
        }

        Node clone = new Node(node.data);
        hm.put(node, clone);
        for(int i = 0; i < node.neighbors; i++) {
            if(hm.containsKey(node.neighbors.get(i))){
                clone.neighbors.add(hm.get(node.neighbors.get(i)));
            } else{
                clone.neighbors.add(dfsCloneHelper(node.neighbors.get(i), hm));
            }
        }
        return clone;
    }
}