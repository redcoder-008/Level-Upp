import java.util.Stack;
public  class MaxAreaInHistorgram{
    public static void findMax(int [] heights){
        int n= heights.length;
        Stack <Integer> s= new Stack<>();
        int [] nsl= new int [n];
        int []nsr= new int [n];
        int maxArea= 0;
        for(int i=0;i<n;i++){ 
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]= -1;
            }
            else{
                nsl[i]= s.peek();
            }
            s.push(i);
        }
        s.clear();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = n;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<n;i++){
            int height = heights[i];
            int width = nsr[i]- nsl[i] -1;
            int area = height*width;
            maxArea= Math.max(area,maxArea);
        
        }
        System.out.println(maxArea);

    }
    public static void main(String[] args) {
        int heights[]= {2,1,5,6,2,3};
        findMax(heights);
        
    }

}