// Q12. Height of Binary Tree 
// Write a recursive function to find the height of a binary tree. 
// Test Case: 
// Tree: 
// 1 
// / \ 
// 2   3 
// / \ 
// 4   5 
// Height = 3 
class HeightBST{
	Node root;
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
	HeightBST(){
		root = null;//creating construtor for assiging initial /default value of root is null.
	}
	void insert(int data){
		root = insertData(root,data);
	}
	Node insertData(Node root,int data){
		if(root == null){
			return new Node(data);
			//return root;
		}
		if(data < root.data){
			root.left = insertData(root.left,data);
		}
		else {
			root.right=insertData(root.right,data);
		}
	return root;
	}
	int heightTree(Node root){
		if(root == null){
			return 0;
		}
			int leftheight =heightTree(root.left);
			int rightheight = heightTree(root.right);
			if(leftheight < rightheight){
				return 1+rightheight;
			}else
				return 1+leftheight;
		
	}
	void inOrder(Node root){
		//only in BST inOrder returns AScending order data .
		if(root == null){
			return;
		}else{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	public static void main(String args[]){
		HeightBST ht = new HeightBST();
		ht.insert(10);
		ht.insert(3);
		ht.insert(2);
		ht.insert(14);
		ht.insert(19);
		ht.inOrder(ht.root);
		System.out.print("\n Height of tree is:"+ht.heightTree(ht.root));
		
	}
}