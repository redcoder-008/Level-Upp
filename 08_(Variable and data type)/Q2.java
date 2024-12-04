import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Input the side of the Square : ");
        int l=sc.nextInt();
        int area= l*l;
        System.out.println("The area of square is : "+area);
        sc.close();
    }
    
}
