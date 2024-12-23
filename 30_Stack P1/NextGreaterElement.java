import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        int nums[]={6,7,0,9,1,4};
        int n= nums.length;
        int nxtGr[] = new int[n];
        Stack <Integer>s = new Stack<>();
        for(int i=n-1;i>=0; i--){
            while (!s.isEmpty() && nums[s.peek()] <= nums[i]){
                s.pop();
            }
            if(s.isEmpty()) nxtGr[i]=-1;
            else{
                nxtGr[i]= nums[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<n;i++){
            System.out.print( nxtGr[i] +" ");
        }
        System.out.println();
    }
}
