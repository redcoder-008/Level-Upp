import java.util.Scanner;

public class Q3 {
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in) ;
       System.out.print("ENter the Day : ");
       int day = sc.nextInt();
       sc.close();
       switch(day){
        case 1 : System.out.println("Sunday"); break;
        case 2 : System.out.println("Monday"); break;
        case 3 : System.out.println("Tuesday"); break;
        case 4 : System.out.println("Wednesday"); break;
        case 5 : System.out.println("Thuraday"); break;
        case 6 : System.out.println("Friday"); break;
        case 7 : System.out.println("Saturday"); break;
        default : System.out.println("OPPS!! YOu enter wrong choice");
       }

    }
    
}
