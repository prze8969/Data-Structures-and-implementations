class Stack{
	int[] arr;
	int capacity;
	int top;
	Stack(int size){
		arr = new int[size];
		top = -1;
	}
	boolean isEmpty(){
		return(top == empty);
	}

	boolean isFull(){
		return(top == capacity -1);
		}
	void pushToStack(int data){
		if(isFull()){
			System.out.println("The stack is full please empty it before using");
			return;
		}
		arr[++top] = data;
	}

	int popFromStack(){
		if(isEmpty()){
			System.out.println("The stack is Empty please fill it");
			return -1;
		}
		return arr[top--];
	}

	int peek(){
		if(isEmpty()){
			System.out.println("Nothing here in the stack");
			return -1;
		}
		return arr[top];
	}	
}
