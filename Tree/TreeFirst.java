class TreeFirst{
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
	TreeFirst(){  //creating constructor for initializing null value to the root node.
		root=null;
	}
	TreeFirst(int data){ 
		root = new Node(data); 
	}
	void inOrder(Node n){
		if(n == null)
		{
			return;
		}
		inOrder(n.left);
		System.out.print(n.data+" ");
		inOrder(n.right);
	}
	public static void main(String args[]){
		TreeFirst tf = new TreeFirst();
		tf.root=new Node(50);
		tf.root.left=new Node(40);
		tf.root.right=new Node(60);
		tf.inOrder(tf.root);
		
	}
	
}