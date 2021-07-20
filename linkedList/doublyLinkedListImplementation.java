class LinkedNodeList{
    Node dummyHead;
    Node dummyTail;
    
    LinkedNodeList(){
        dummyHead = new Node(0,0);
        dummyTail = new Node(0,0);
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }
    
    void moveToHead(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        addToHead(node);
    }
    
    void addToHead(Node node){
        Node tmp = dummyHead.next ;
        dummyHead.next = node;
        node.next = tmp;
        node.prev = dummyHead;
        tmp.prev = node;
    }
    
    void removeTail(){
        Node newTail = dummyTail.prev.prev;
        newTail.next = dummyTail;
        dummyTail.prev = newTail;
    }
    
    Node getTail(){
        return dummyTail.prev;
    }
    
}

 class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int value){
            this.key = key;
            this.val =value;
        }
}