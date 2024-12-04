import java.util.Scanner;

public class q1 {
    public static int countVowel(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== 'i' || s.charAt(i)== 'a' || s.charAt(i)== 'e' ||s.charAt(i)== 'u'|| s.charAt(i)== 'u' ) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s= sc.nextLine();

        System.out.println(countVowel(s));
    }
}
