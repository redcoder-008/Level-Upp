class Queue{
    static  int array[];
    static int size;
    static int  rear;
    static int front ;
    Queue(int n){
     array= new int [n];
     size=n;
     rear=-1;
     front = -1;
 }
 public   boolean isEmpty(){
     return rear==-1 && front==-1;
  
 }
 public static boolean isFull(){
    return (rear+1)% size ==front;
 }
 public void add(int data)
 {
     if(isFull()) {
         System.out.println("Queue is full");
         return;
     }
     if(front == -1) front =0; //adding first element
     rear=( rear+1)% size;
     array[rear] = data;
 }
 //remove function
 public  int remove(){
     if(isEmpty()){
         System.out.println("Queue is empty");
         return -2;
     }
  int result = array[front];
  //deleeting last element
  if(rear==front){
      rear= front = -1;
    }
    else{
        
        front =(front+1) % size;
  }
  return result;
    
     
 }
 public  int peek(){
     return array[front];
 }
 
 
 }
public class CircularQueueUsgArr {

    

 
 
     public static void main(String[] args) {
         Queue q= new Queue(3);
         q.add(1);
         q.add(2);
         q.add(3);
         System.out.println(q.remove());
         q.add(4);
         System.out.println(q.remove());
         q.add(5);
         System.out.println("-----");
         while(!q.isEmpty())
         {
             System.out.println(q.peek());
             q.remove();
         }
     }
    
     
 }
    

