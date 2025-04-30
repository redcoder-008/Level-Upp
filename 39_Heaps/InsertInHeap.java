import java.util.ArrayList;

public class InsertInHeap {
   public static class Heap{
        ArrayList<Integer>arr = new ArrayList<>();
        public void add(int data){
            //add at the last
            arr.add(data);
            int x= arr.size()-1;
            int par= (x-1)/2; //parent index
            int temp = arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);


        }

    }
    public static void main(String[] args) {
    
    }
    
}
