public class BinaryToDec {
    public static void b2d(int bin)
    {
        int dec=0;
        int pow=0;
        
        while (bin>0)
        {
          int  ld= bin%10;
            dec= dec+(ld*(int)Math.pow(2,pow));
            bin=bin/10;
            pow++;
        }
        System.out.println("decimal num : "+dec);
    }
    public static void main(String[] args) {
        b2d(111);
    }
    
}
