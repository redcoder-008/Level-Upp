public class Fourth {
    public static void main(String[] args) {
        char cha='A';
        int n=4;
    
        for(int line =0;line<n;line++)
        {
            for(int ch =0;ch<=line;ch++)
            {
                System.out.print(cha);
                cha++;
            }
            System.out.println();
        }
    }
    
}
