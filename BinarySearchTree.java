import java.util.*;
class Node{
    int value;
    Node left,right;
    Node(int value)
    {
        this.value=value;
        left=right=null;
    }
}
public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        root=null;
    }
    void insert(int value){
        root=insertRec(root,value);
    }
    static Node insertRec(Node root, int value)
    {
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(value <=root.value)
        {
            root.left=insertRec(root.left, value);
        }
        else if(value> root.value)
        {
            root.right=insertRec(root.right, value);
        }
        return root;
    }
    static void inorder(Node node){
        if(node==null)
        return;
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of values : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            tree.insert(sc.nextInt());
        System.out.println("Tree in inorder Traversal: ");
        inorder(tree.root);
    }
}
