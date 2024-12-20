import java.util.ArrayList;
public class arr{
    public static int maxElement(ArrayList list){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if( max < (int)list.get(i)){
                max= (int) list.get(i);
            }
        }
        return max;
    }
    public static void main(String [] args){
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(maxElement(list));





    }
}