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
    return((rear +1)%capacity == front);
  }

  boolean isEmpty(){
    return (front == -1);
  }
  void enqueue(int value){
    if( front == -1 && rear == -1){
      //the queue isnt initialized
       
     }
  }
}
