class QueueArray{
	int size = 5; //impliment queue using array need to specify array size.
	int f,r; //f -for dequeue r - enqueue
	int Q[] = new int[size];
	QueueArray(){
		f=-1; //assining default values to front and rear
		r=-1;
	}
	boolean isEmpty(){
		//check underflow condition
		return (f==-1);
	}
	boolean isFull(){
		//checking overflow condition
		return(r == size-1);
	}
	void enQueue(int x){
		if(isFull()){
			System.out.println("Queue is Full /Overflow");
			return;
		}else{
			if(f == -1){
				f=0;
			}
			Q[++r]=x;
				System.out.print(x+"Inserted in queue!!");
			
		}
	}
	void deQueue(){
		if(isEmpty()){
			System.out.println("Underflow of queue!!");
			//return;
		}else{
			int x = Q[f];
			System.out.println(x+" Deleted !!");
			f++;
		}
		}
	void count(){
		if(isEmpty()){
			System.out.println("Queue is Empty !!");
			return;
		}else{
			int count = r-f+1;
			System.out.println("Count is: "+count);
		}
		
	}
	void display(){
		if(isEmpty()){
			System.out.println("Queue is Empty !!");
		}else{
			for(int i=f;i<=r;i++){
				System.out.print(Q[i]+" ");
			}
		}
	}
	
	public static void main(String args[]){
		QueueArray qa = new QueueArray();
		// qa.enQueue(10);
		// qa.enQueue(20);
		// qa.enQueue(30);
		// qa.enQueue(40);
		// qa.enQueue(50);
		//qa.enQueue(60);
		qa.display();
		System.out.println("\n After Dequeue !!");
		//qa.deQueue();
		qa.display();
		qa.deQueue();
		qa.display();
		qa.count();
	}
}