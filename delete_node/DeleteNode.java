package delete_node;

public class DeleteNode {

    public static void main(String[] args){
        Implementation impl = new Implementation();

        Node mNodes = impl.getLinkedList(0);
 
        mNodes =  impl.deleteNode(mNodes, 10);  
        impl.printLinkedList(mNodes);

    }
    
}
