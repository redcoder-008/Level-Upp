import java.util.Scanner;
public class Q1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a Number");
        int a = sc.nextInt();
        if(a<=0)
        {
            System.out.println(a+" is Negative Number");
        }
        else
        {
            System.out.println(a+" is Postive Number");
        }
        sc.close();

    }
}