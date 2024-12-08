public class Q14 {
    public static void PrintBinaryString(int n,int lastplace, String str )
    {
        if(n==0) 
        {
            System.out.println(str);
            return;
        }
        PrintBinaryString(n-1, 0, str+"0");
        if(lastplace==0)
        {
            PrintBinaryString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        PrintBinaryString(3, 0, " ");
       
    }
    
}
