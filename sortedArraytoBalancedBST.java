

public class sortedArraytoBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) { 
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node createBST(int arr[], int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int arr[] = {};

    }
}

