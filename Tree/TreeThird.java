class TreeThird{
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
	TreeThird(){
		root = null;
	}
	void insert(int data){
		root = insertData(root,data);
	}
	Node insertData(Node root,int data){
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		else if(data < root.data) // 50  30
		{
			root.left = insertData(root.left,data);
		}
		else if(data > root.data){ //50 30
			root.right = insertData(root.right,data);
		}
		return root;
	}
	void inOrder(Node n){
		if(n == null)
		{
			return;
		}
		else 
		{
			inOrder(n.left);
			System.out.print(n.data+" ");
			inOrder(n.right);
		}
	}
	void preOrder(Node n){
		if(n==null)
		{
			return;
		}else{
			System.out.print(n.data+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	void postOrder(Node n){
	if(n == null)
	{
		return;
	}
     else{
		 postOrder(n.left);
		 postOrder(n.right);
		 System.out.print(n.data+" ");
	 }	
	}
	void delete(int data){
		root = deleteData(root,data);
	}
	Node deleteData(Node root,int data){
		if(root == null)
		{
			return;
		}
		else if(data < root.data)
		{
			root.left=deleteData(root.left,data);
		}
		else if(data > root.data){
			root.right = deleteData(root.right,data);
		}
		else
		{
			if(root.left == null)
			{
				return root.right;
			}
			if(root.right == null)
			{
				return root.left;
			}
			
		root.data = minValue(root.right);
		root.right=deleteData(root.right,root.data);
		}
		int minValue(Node root){
			int x = root.left.data;
			root=root.left;
		}
		return x;
	}
	public static void main(String args[]){
		TreeThird tt = new TreeThird();
		tt.insert(40);
		tt.insert(60);
		tt.insert(30);
		tt.insert(10);
		tt.insert(70);
		tt.insert(80);
		System.out.println("\nInOrder:");
		tt.inOrder(tt.root);
		System.out.println("\nPreOrder:");
		tt.preOrder(tt.root);
		System.out.println("\nPostOrder:");
		tt.postOrder(tt.root);
		tt.delete(80);
		tt.inOrder();
	}
}