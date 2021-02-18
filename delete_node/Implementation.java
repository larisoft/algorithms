package delete_node;
import java.util.LinkedList;
 
public class Implementation {



    



    public Node deleteNode(Node head, int key){

 

        if(head == null) return null;

        if(head.key == key) return head.next;

        Node storeHead = head;  
        Node nodeAfteReplaceNode = null;
        Node nodeBeforeReplaceNode = null;

        while(true){

            if(head == null){ 
                 break;
            }

            if(head.key == key){
 
                nodeBeforeReplaceNode = head.prev;
                nodeAfteReplaceNode = head.next; 
                break;
            }
            
            head = head.next;
        }


        nodeAfteReplaceNode.prev = nodeBeforeReplaceNode;
        nodeBeforeReplaceNode.next = nodeAfteReplaceNode;

        return storeHead; 



    }



    public Node getLinkedList(int size){

        int[] keys = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        Node head = new Node(keys[0], null);

        Node n = head;

        for(int i = 1; i < keys.length; i++){

            n.next = new Node(keys[i], n);
            n = n.next;
        }


        return head;
    }



    public void printLinkedList(Node head){

        Node storeHead = head;

        while(head.next != null){ 
            System.out.print(" "  + head.key);
            head = head.next;
        }

        head = storeHead;
    }
}
