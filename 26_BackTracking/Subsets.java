public class Subsets {
    public static void printSubsets(String str,String ans,int i)
    {
        if(i==str.length())
        {
            if(ans.length()==0) System.out.println("NULL");
            else{
                System.out.println(ans);
                
            }
            return;
        }
        //if yes
        printSubsets(str, ans+str.charAt(i), i+1);
        //if No 
        printSubsets(str, ans, i+1);
        //subset
    }public static void main(String[] args) {
        String str = "XYZ";
        printSubsets(str, "", 0);
    }
}
