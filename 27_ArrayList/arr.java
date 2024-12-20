import java.util.ArrayList;
import java.util.Collections;
public class arr{
    public static int maxElement(ArrayList <Integer> list){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if( max < list.get(i)){
                max= list.get(i);
            }
        }
        return max;
    }
    public static void swap(ArrayList<Integer> list ,int idx1,int idx2){
        int temp= list.get(idx1);
        list.set( idx1,list.get(idx2));
        list.set(idx2,temp); 
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String [] args){
        ArrayList list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(31);
        list.add(12);
      
          System.out.println(list);
          /*  
          
          System.out.println(maxElement(list));
          swap(list,1,3);
          System.out.println(list);
          */   
          Collections.sort(list); //sorting in ascending order
          System.out.println(list);
          Collections.sort(list, Collections.reverseOrder());//sorting in an descending order
          
          System.out.println(list);





    }
}