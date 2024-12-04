import java.util.Scanner;

public class Q2 {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        int number;
        int choice=0;
        int oddNum=0;
        int evenNum=0;
       do{
        System.out.print("Enter the number");
        number = sc.nextInt();
        if(number%2==0)
        {
            evenNum+=number;
        }
        else{
            oddNum+=number;
        }
        System.out.println("Do you Want to continue? Press 1 for yes or 0 for no");
        choice = sc.nextInt();
       }
       while (choice ==1);
        
        System.out.println("The sum of odd number is : "+oddNum);
        System.out.println("The sum of Even number is : "+evenNum);
    

       }
      
   

    
}
