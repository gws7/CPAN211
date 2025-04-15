import java.util.Scanner;
import java.util.Stack;

//Gabriel Sosin N01646959

public class BinarySearchTree {
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node); //Easier to use recursion if you have a helper method
    }

    private Node insertHelper(Node root, Node node) {
        int data = node.data;
        if (root == null) { //If no root exists, add that as root
            root = node;
            return root;
            //The else statements will be recursive because they will treat the left/right nodes as parents now (roots)
        } else if (data < root.data) {
            root.leftNode = insertHelper(root.leftNode, node);
        } else {
            root.rightNode = insertHelper(root.rightNode, node);
        }

        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node root) {
        if (root != null) {
            //InOrder ( Left | Parent | Right)
            displayHelper(root.leftNode);
            System.out.println(root.data);
            displayHelper(root.rightNode);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.leftNode, data);
        } else {
            return searchHelper(root.rightNode, data);
        }
    }

    public void remove(int data) {
        if (search(data)) {
            root = removeHelper(root, data);
        } else {
            System.out.println(data + " cannot be found");
        }
    }

    private Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.leftNode = removeHelper(root.leftNode, data);
        } else if (data > root.data) {
            root.rightNode = removeHelper(root.rightNode, data);
        } else { //Node Found
            if (root.leftNode == null && root.rightNode == null) {
                root = null;
            } else if (root.rightNode != null) { //Find successor to replace this node
                root.data = successor(root);
                root.rightNode = removeHelper(root.rightNode, root.data);
            } else { //Find predecessor to replace this node
                root.data = predecessor(root);
                root.leftNode = removeHelper(root.leftNode, root.data);
            }
        }
        return root;
    }

    private int successor(Node root) { //Find the least value below the right child of this root node
        root = root.rightNode;
        while (root.leftNode != null) {
            root = root.leftNode;
        }
        return root.data;
    }

    private int predecessor(Node root) { //Find the greatest value below the left child of this root node
        root = root.leftNode;
        while (root.rightNode != null) {
            root = root.rightNode;
        }
        return root.data;
    }

    public void inorder() {
        //Create a stack to hold the nodes when using inorder traversing
        Stack<Node> stack = new Stack<>();
        //Start iterating from the root
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            //Traverse left subtree
            while (current != null) {
                stack.push(current); //Adds current node to stack as long as it's not null
                current = current.leftNode; //Keeps moving left
            }

            //Get the left node from stack
            current = stack.pop();
            System.out.println(current.data);

            //Traverse right subtree
            current = current.rightNode;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 15 Integers");
        for (int i = 0; i < 15; i++) {
            int num = sc.nextInt();
            tree.insert(tree.new Node(num)); //Since node is an inner class I must use tree.new
        }
        sc.close();

        System.out.println("InOrder Printed:");
        tree.inorder();
    }

    class Node {
        int data;
        Node leftNode;
        Node rightNode;

        public Node(int data) {
            this.data = data;
        }
    }
}
