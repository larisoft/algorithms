package mirror_tree;

public class MirrorTree{

    public static void main(String[] args){
        
        Implementation impl = new Implementation();

        TreeNode node = impl.getTree();

        impl.printInOrder(node);

        node = impl.invertTree(node);

        System.out.println(" Inverted " );

        impl.printInOrder(node);
    }
}