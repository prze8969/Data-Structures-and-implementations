class CircularQueue{
  int[] arr;
  int front;
  int rear;
  int size_of_array;
  CircularQueue(int size){
    arr = new int[size];
    size_of_array = size;
    front = -1;
    rear = -1;
  }
  boolean isFull(){
    return((rear +1)%size_of_array == front);
  }

  boolean isEmpty(){
    return (front == -1);
  }
  void enqueue(int value){
    if(isFull()){
      System.out.println("The queue is full");
      return;
    }
    if( front == -1 && rear == -1){
      //the queue isnt initialized
      front = 0 ;
      rear = 0;
     }
     arr[rear] = value;
     rear = (rear+1)%size_of_array;
  }

  int dequeue(){

    //if the queue is empty, then dont do anything
    if(isEmpty()){
      System.out.println("Empty queue");
      return -1;
      
          }
          
    int resVal = arr[front];
    front = (front+1)%size_of_array;

    
    // if the queue in future becomes empty by front == rear then just
    // reset the queue to the start
    // f = 0 r = 1 then queue  = [3,_,_,_,_]
    // dequeue : f = 1 r = 1 queue = [_,_,_,_,_]
    // since f = r = 1 hence it means queue is empty
    if(front ==  rear){
      front = -1;
      rear = -1;
    }

    return resVal;
  }

  int peek(){
    if(isEmpty()){
      System.out.println("The queue is empty");
      return -1;
    }
    return arr[front];
  }

  void display(){
    
    if(isEmpty()){
      System.out.println("The queue is empty");
      return;
    }
    int n = size_of_array;
    int i = front;
    while(i!= rear){
      System.out.println(arr[i]);
      i = (i+1)%n;
    }
  }
}
