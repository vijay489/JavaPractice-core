package Trees;

public class TreeTraversalTech {
    Node root;
    
    static class Node{
        int data;
        Node left,right;
        
        Node(int d){
            data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder Traversal : ");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("Postorder Traversal :");
        postOrderTraversal(root);
        System.out.println();
        System.out.println("preorder Traversal :");
        preOrderTraversal(root);
        System.out.println();
    }

    private static void preOrderTraversal(Node root) {
        if(root == null)
            return;

        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private static void postOrderTraversal(Node root) {
        if(root == null)
            return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    private static void inOrderTraversal(Node root) {
        if(root == null)
            return;

        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);

    }
}
