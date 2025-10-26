// Q9. Level Order Traversal (BFS)
// Test Case:
// Tree: 
//        1 
//      /   \ 
//     2     3 
//    / \   / \ 
//   4   5 6   7 
// Output: 1 2 3 4 5 6 7

import java.util.*;

class LevelOrderTraversal {
    Node root;

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Level order traversal using queue
    void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();

        // Building the test case tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.print("Level Order Traversal: ");
        tree.levelOrder(tree.root);
    }
}
