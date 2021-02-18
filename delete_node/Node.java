package delete_node;


public class Node{
    Node prev;
    int key; 
    Node next;

    public Node(int key, Node head){
        this.key = key;
        this.prev = head;
    }
}