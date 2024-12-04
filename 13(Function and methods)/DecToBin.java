public class DecToBin {
    public static void D2B(int decNum)
    {
        int myNum=decNum;
        int pow=0;
        int binNum=0;
        while(decNum>0)
        {
            int rem= decNum%2;
            binNum= binNum+ ( rem*(int)Math.pow(10,pow));
            pow++;
            decNum/=2;
        }
        System.out.println("binNum= "+binNum);
    }
    public static void main(String[] args) {
        D2B(111);
    }
    
}
