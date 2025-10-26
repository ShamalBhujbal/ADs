// Assignment: Tree Data Structures (Coding) 
// Q7. Create a Binary Tree & Print Preorder Traversal 
// Write a program to create a binary tree and print its preorder traversal. 
// Test Case: 
// Tree: 
      // 1 
     // / \ 
    // 2   3 
   // / \ 
  // 4   5 
// Expected Output (Preorder): 1 2 4 5 3 

class BinaryTreePreOrder{
	Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	 static void preOrder(Node n){
		 if(n == null){
			// System.out.println("Tree is Empty !!");
			 return;
		 }
		 else{
			 System.out.print(n.data+" ");
			 preOrder(n.left);
			 preOrder(n.right);
		 }
	 }
	public static void main(String args[]){
		BinaryTreePreOrder tree = new BinaryTreePreOrder();
		tree.root = new Node(1);
		tree.root.left=new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		preOrder(tree.root);
	}
}