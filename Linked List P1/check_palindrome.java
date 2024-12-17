import java.lang.classfile.components.ClassPrinter.ListNode;

public class check_palindrome {
    
class Solution {
    public boolean isPalindrome(ListNode head)
    {
         // finding the mid point 
        
         ListNode slow= head;
         ListNode fast= head;
        
         while(fast!=null && fast.next!=null)
         {
               slow= slow.next;
               fast= fast.next.next;
         }
        
         ListNode mid= slow;
        
        // reverse the linkedlist starting from mid till the end
        
         ListNode curr= mid;
         ListNode prev= null;
        
         while( curr!=null )
         {
             ListNode ne = curr.next;
             
             curr.next= prev;
             
             prev= curr;
             curr= ne;
         }
        
         curr = head;
        
          while( prev!= null)
          {
                if( curr.val != prev.val )
                {
                     return false;
                }
              else
              {
                   curr= curr.next;
                   prev= prev.next;
              }
          }
        
        return true;
    }
}









    
    
}
