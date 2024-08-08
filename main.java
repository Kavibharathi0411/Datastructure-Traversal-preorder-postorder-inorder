import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }
    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    void printPostorder(Node node) {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }
    void printPreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right); 
        
    }
    

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();


        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.left.right=new Node(9);
        tree.root.left.left.right.left=new Node(1);
        tree.root.right.left=new Node(7);
        tree.root.right.right=new Node(6);
        tree.root.right.right.left=new Node(8);


        System.out.println("Inorder traversal: ");
        tree.printInorder(tree.root);
        System.out.print("\n");
        System.out.println("Postorder traversal: ");
        tree.printPostorder(tree.root);
        System.out.print("\n");
        System.out.println("Preorder traversal: ");
        tree.printPreorder(tree.root);
    }
}