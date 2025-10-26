// Q10. Insert into a BST 
// Write a program to insert nodes into a BST and print inorder traversal. 
// Test Case: 
// Insert: 50, 30, 20, 40, 70, 60, 80 
// Tree (BST) Inorder: 20 30 40 50 60 70 80 
class BSTInsert{
	Node root;
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			Node left=null;
			Node right=null;
		}
	}
	BSTInsert(){
		root = null;
	}
	void insert(int key){
		root = insertData(root,key);
	}
	Node insertData(Node root,int key){
		if(root == null){
			root = new Node(key);
		}
		if(key < root.data){
			root.left=insertData(root.left,key);
		}else if(key > root.data){
			root.right=insertData(root.right,key);
		}
	return root;
	}
	// Node search(Node root,int key){
		// if(root == null){
			// System.out.print("\nNot Found");
	        // return null;
		// }
		// if(key == root.data){
			// System.out.print("\nFound");
			// return root;
		// }if(key < root.data){
			// return search(root.left,key);
		// }
		// else{
			// return search(root.right,key);
		// }
	// }
	void inOrder(Node n){
		if(n == null){
			return;
		}else{
			inOrder(n.left);
			System.out.print(n.data+" ");
			inOrder(n.right);
		}
	}
	public static void main(String args[]){
		BSTInsert bst = new BSTInsert();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);
		bst.inOrder(bst.root);
		bst.search(bst.root,20);
		bst.search(bst.root,90);
	}
	
}