public class sumTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int sum(Node root){
        if (root == null) {
            return 0;
        }
        int old_val = root.data;

        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        root.data = leftsum+rightsum;
        return root.data + old_val;
    }
    public static void printInorder(Node node) 
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        sum(root);
        printInorder(root);
    }
}

