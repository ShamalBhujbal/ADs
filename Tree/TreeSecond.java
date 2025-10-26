class TreeSecond{
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
	TreeSecond(){
		root = null;
	}
	void insert(int data){
		root = insertData(root,data);
		
	}
	Node insertData(Node root,int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		if(data < root.data) // root 50 insert 40
		{
			root.left=insertData(root.left,data);
		}
		else if(data > root.data)
		{
			root.right = insertData(root.right,data);
		}
			return root;
	} 
	void inOrder(Node n){
		if(n == null)
		{
			return;
		}
		else{
			inOrder(n.left);
			System.out.print(n.data+" ");
			inOrder(n.right);
		}
	}
	void preOrder(Node n){
		if(n == null){
			return;
			//System.out.print("Tree not exist:");
		}
		else{
			System.out.print(n.data+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	void postOrder(Node n){
		if(n == null){
			return;
			//System.out.print("Tree not exist:");
		}
		else{
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.data+" ");
		}
	}
	public static void main(String args[]){
		TreeSecond ts = new TreeSecond();
		ts.insert(30);
		ts.insert(40);
		ts.insert(50);
		ts.insert(10);
		ts.insert(20);
		System.out.println("\nPreOrder:");
		ts.preOrder(ts.root);
		System.out.println("\nInorder:");
		ts.inOrder(ts.root);
		System.out.println("\nPostOrder:");
		ts.postOrder(ts.root);
	}
}