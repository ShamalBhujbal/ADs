class CircularQueue{
        int size = 5;
		int f,r;
		int cQ[] = new int[size];
		CircularQueue(){
			f=-1;
			r=-1;
		}
		boolean isEmpty(){
			return (f==-1);
		}
		boolean isFull(){
			return ((r+1)% size == f);
		}
		void enQueue(int x){
			if(isFull()){
				System.out.println("Queue Overflow!!");
				return;
			}else{
				if(isEmpty()){
					f=0;
				}
				r = (r+1)% size;
				cQ[r]=x;
				System.out.println(x+"Inserted in queue !!");
			}
		}
		int deQueue(){
			if(isEmpty()){
				System.out.println("Queue Underflow !!");
				return 0;
			}
			int x= cQ[f];
			System.out.println(x+"Deleted !!");
			if(f == r)
			{ 
				f=-1;
				r=-1;
			}else{
			f=(f+1)%size;
			
			}
		return x;
		}
		void display(){
			if(isEmpty()){
				System.out.println("Queue Underflow !!");
				return ;
			}
			// int i = front;
			// while(i != rear){
				// System.out.print(CQ[i]+ " ");
				// i = (i+1) % size;
			// }
			// System.out.println(CQ[i]);
			int i = f;
			while(i != r){
				System.out.print(cQ[i]+" ");
				i=(i+1)%size;
			}
			System.out.print(cQ[i]+" ");
		}
		public static void main(String args[]){
			CircularQueue cq = new CircularQueue();
			cq.enQueue(10);
			cq.enQueue(20);
			cq.enQueue(30);
			cq.enQueue(40);
			cq.enQueue(50);
			cq.display();
			System.out.println("\nAfter Deleting queue element !!");
			cq.deQueue();
			cq.display();
		}
}