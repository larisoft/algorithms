package mirror_tree;

 
import java.util.*;

import jdk.nashorn.api.tree.Tree;

public class Implementation{





    public TreeNode getTree(){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
  
        root.left.left = new TreeNode(4); 
        root.left.right = new TreeNode(5);

        return root;

    }


    public void printInOrder(TreeNode node){

        Queue<TreeNode> mQueue = new LinkedList<TreeNode>(); 

        mQueue.add(node);
        
        while(!mQueue.isEmpty()){


            node = mQueue.poll();


            System.out.println(node.data+ " ");

            if(node.left!=null){
                mQueue.add(node.left);
            }

            if(node.right!=null){
                mQueue.add(node.right);
            }

        }
    }



    public TreeNode invertTree(TreeNode treeNode){

        Queue<TreeNode> mQueue = new LinkedList<TreeNode>(); 
        mQueue.add(treeNode); 

        while(!mQueue.isEmpty()){

            TreeNode node = mQueue.poll(); 
            if(node!=null){

                TreeNode n = node.left;
                node.left = node.right;
                node.right = n;
            }
            
            if(node.left!=null){
                mQueue.add(node.left);
            }

            if(node.right!=null){
                mQueue.add(node.right);
            }
 
 
        }

        return treeNode;

    }
}