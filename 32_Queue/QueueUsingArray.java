
  class Queue{
   static  int array[];
   static int size;
   static int  rear;
   Queue(int n){
    array= new int [n];
    size=n;
    rear=-1;
}
public   boolean isEmpty(){
    return rear==-1;
 
}
public void add(int data)
{
    if(rear== size-1) {
        System.out.println("Queue is full");
        return;
    }
    rear+=1;
    array[rear] = data;
}
//remove function
public  int remove(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -2;
    }
    int front = array[0];
    for(int i=0;i<rear;i++){
        array[i]= array[i+1];
    }
    rear--;
    return front;
}
public  int peek(){
    return array[0];
}


}

public class QueueUsingArray{
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
   
    
}