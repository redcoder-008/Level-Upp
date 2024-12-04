import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENter price of pencil : ");
        float pencil= sc.nextFloat();
        System.out.print("ENter price of pen : ");
        float pen= sc.nextFloat();
        System.out.print("ENter price of Eraser : ");
        float eraser= sc.nextFloat();
        float total= pen+pencil+eraser;
        System.out.println("Total amount is : "+total);
        float gst_amount=  (float) ((0.18)*total);
        System.out.println(gst_amount);
        float final_amount = total+gst_amount;
        System.out.println("Total amount including 18% GST is :"+final_amount);




        
        


    }
    
}
