// Q14. Convert Sorted Array to Balanced BST
// Input: [1, 2, 3, 4, 5, 6, 7]
// Output (Preorder example): 4 2 1 3 6 5 7

class SortedArrayToBST {
    Node root;

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Function to convert sorted array to balanced BST
    Node sortedArrayToBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }

        // middle element
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        // recursively build left and right subtrees
        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    // Preorder traversal (Root → Left → Right)
    void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        SortedArrayToBST tree = new SortedArrayToBST();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        tree.root = tree.sortedArrayToBST(arr, 0, arr.length - 1);

        System.out.print("Preorder Traversal of Balanced BST: ");
        tree.preOrder(tree.root);
    }
}
