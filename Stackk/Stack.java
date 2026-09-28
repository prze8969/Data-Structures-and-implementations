ALGORITHM FOR STACK

--PUSH--
1.IF TOP = MAX-1 
	PRINT OVERFLOW
2.SET TOP = TOP + 1
3.SET STACK[TOP] = VALUE
4. END

--POP--
1.IT TOP == -1
	PRINT UNDERFLOW
2.SET VAL = STACK[TOP]
3 TOP = TOP -1
4. END

--PEEK--
1.IF TOP == -1
	PRINT EMPTY
2. RETURN STACK[TOP]
3.END


class Stack{
	int[] arr;
	int capacity;
	int top;
	Stack(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	boolean isEmpty(){
		return top == -1;
	}

	boolean isFull(){
		return top == capacity -1;
		}
	void pushToStack(int data){
		if(isFull()){
			System.out.println("Stack Overflow!");
			return;
		}
		arr[++top] = data;
	}

	int popFromStack(){
		if(isEmpty()){
			System.out.println("Stack Underflow!");
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
	void display(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Elemment is the Stack are as follow : ");
		for(int i = 0; i <= top; i++){
			System.out.print(arr[i] + " ");
		}
}
