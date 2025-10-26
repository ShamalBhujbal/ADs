// Q11. Minimum & Maximum Node in BST 
// Find the smallest and largest element in a BST. 
// Test Case: 
// BST from Q4 → Min: 20, Max: 80 

class MinMaxNode{
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
	MinMaxNode(){
		root = null;
	}
	void insert(int key){
		root = insertData(root,key);
	}
	Node insertData(Node root,int key){
		if(root == null)
		{
		root = new Node(key);
		 return root;
		}
		if(key < root.data){
		root.left=insertData(root.left,key);
		}
		else if(key > root.data){
			root.right=insertData(root.right,key);
		}
		return root;
	}
	Node max(Node root){
		if(root == null ){
			System.out.println("Tree is empty !!");
			return null;
		}
		if(root.right == null){
			return root;
		}
		return  max(root.right);
	}
	Node min(Node root){
		if(root == null){
			System.out.println("Tree is empty !!");
			return null;
		}if(root.left == null){
			return root;
		}
	return min(root.left);
	}
	// void (Node root){
		
	// }
	public static void main(String args[]){
		MinMaxNode mm = new MinMaxNode();
		mm.insert(50);
		mm.insert(30);
		mm.insert(20);
		mm.insert(40);
		mm.insert(70);
		mm.insert(60);
		mm.insert(80);
		System.out.println("Max Node :"+mm.max(mm.root).data);
		System.out.println("Max Node :"+mm.min(mm.root).data);
	}
}