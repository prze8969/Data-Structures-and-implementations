class Queue{
  int[] arr;
  int front;
  int capacity;
  int rear;

  Queue(int size){
    arr = new int[size];
    capacity = size;
    front = -1;
    rear = -1;
  }
  boolean isFull(){
    return (rear == capacity -1);
  }

  boolean isEmpty(){
    return (front == -1);
  }

  void enqueue(int val){
    if(isFull()){
      System.out.println("Queue is full");
      return;
    }

    if(front == -1){
      front = 0;
    }
    rear++;
    arr[rear] = val;

  }

  int dequeue(){
    if(isEmpty()){
      System.out.println("Queue is empty");
      return;
    }
    int val = arr[front];
    front++;

    if(front > rear){
      rear = -1;
      front = -1;
    }
    return val;
  }
}
