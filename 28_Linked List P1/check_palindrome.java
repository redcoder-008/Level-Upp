// import java.lang.classfile.components.ClassPrinter.ListNode;
// import java.lang.classfile.components.ClassPrinter.Node;

// public class check_palindrome {
    

//     public boolean isPalindrome(Node head)
//     {
//          // finding the mid point 
        
//          Node slow= head;
//          Node fast= head;
        
//          while(fast!=null && fast.next!=null)
//          {
//                slow= slow.next;
//                fast= fast.next.next;
//          }
        
//          Node mid= slow;
        
//         // reverse the linkedlist starting from mid till the end
        
//          Node curr= mid;
//          Node prev= null;
        
//          while( curr!=null )
//          {
//              Node ne = curr.next;
             
//              curr.next= prev;
             
//              prev= curr;
//              curr= ne;
//          }
        
//          curr = head;
        
//           while( prev!= null)
//           {
//                 if( curr.val != prev.val )
//                 {
//                      return false;
//                 }
//               else
//               {
//                    curr= curr.next;
//                    prev= prev.next;
//               }
//           }
        
//         return true;
//     }
// }









    
    
// }
