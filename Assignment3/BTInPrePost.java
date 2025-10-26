// Q8. Inorder, Preorder, Postorder Traversals 
// Implement recursive functions to print inorder, preorder, and postorder traversals. 
// Test Case: 
// Tree: 
      // 10 
     // /  \ 
    // 20   30 
   // / \ 
  // 40  50 
// • Inorder: 40 20 50 10 30 
// • Preorder: 10 20 40 50 30 
// • Postorder: 40 50 20 30 10 


// Q9. Level Order Traversal (BFS) 
// Implement level-order traversal of a binary tree. 
// Test Case: 
// Tree: 
       // 1 
     // /   \ 
    // 2     3 
   // / \   / \ 
  // 4   5 6   7 
// Output: 1 2 3 4 5 6 7

// display(Node root){
	root.data
	root.left.data 
	root.right.data
}
class BTInPrePost{
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
	BTInPrePost(){//constructor to store default value of Bt's root
		root = null;
	}
	void inOrder(Node n){
		if(n == null){
			return;
		}else{
			inOrder(n.left);
			System.out.print(n.data+" ");
			inOrder(n.right);
		}
	}
	void preOrder(Node n){
		if(n == null){
			return;
		}else{
			System.out.print(n.data+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	void postOrder(Node n){
		if(n == null){
			return;
		}else{
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.data+" ");
		}
	}
	
	public static void main(String args[]){
		BTInPrePost tree = new BTInPrePost();
		tree.root= new Node(10);
		tree.root.left=new Node(20);
		tree.root.right= new Node(30);
		tree.root.left.left= new Node(40);
		tree.root.left.right=new Node(50);
		System.out.println("\n IN ORDER !!");
		tree.inOrder(tree.root);
		System.out.println("\n Pre ORDER !!");
		tree.preOrder(tree.root);
		System.out.println("\n Post ORDER !!");
		tree.postOrder(tree.root);
		
	}
}