package Trees;

public class CheckForBST {
    Node root;

    static class Node{
        int data;
        Node left,right;

        Node(int d){
            data = d;
            left =right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        boolean isBSTTree = isBst(root);
        System.out.println("Is given tree is BST:"+isBSTTree);
    }

    private static boolean isBst(Node root) {
      return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isBSTUtil(Node root, int minValue, int maxValue) {
        if(root == null)
            return true;

        if(root.data < minValue || root.data > maxValue)
            return false;

        return isBSTUtil(root.left, minValue
                ,root.data-1 )
                && isBSTUtil(root.right, root.data+1,maxValue);
    }
}
