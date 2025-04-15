import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 15 Integers");
        for (int i = 0; i<15; i++){
            int num = sc.nextInt();
            tree.insert(new Node(num));
        }
        sc.close();

        System.out.println("InOrder Printed:");
        tree.inorder();
        
    }
}
