/**
 * sample
 */
class Student
{
    int arr[];

    Student( int arr[])
    {
         this.arr= new int[arr.length];
        
        for( int i=0;i< arr.length;i++)
        {
             this.arr[i]= arr[i];
        }

    }
     Student ( Student obj)
     {
        this.arr= new int[obj.arr.length];
        
        for( int i=0;i< obj.arr.length;i++)
        {
             this.arr[i]= obj.arr[i];
        }
     }

     void display()
     {
         for( int i=0;i< arr.length;i++)
         {
              System.out.print( arr[i]+ " ");
         }
         System.out.println();
     }
}
public class sample {

    public static void main(String[] args) 
    {
        int a[]= {10,20,30};

           Student st1= new Student( a );

           Student st2 = new Student( st1 );
           
           st1.display();
           st2.display();

           a[0]= 11;
           a[1]=55;
           a[2]=77;
           
           st1.display();
           st2.display();

    }
}