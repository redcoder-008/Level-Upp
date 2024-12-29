public class removeKdigits(402)LC {
    class Solution {
        public String removeKdigits(String nums, int k) 
        {
             
             Stack<Character> st= new Stack<>();
            
             for( int i=0;i< nums.length();i++)
             {
                  char ch = nums.charAt(i);
                 
                  while( st.isEmpty()==false && st.peek()> ch  && k>0)
                  {
                       st.pop();
                       k--;
                  }
                 
                  st.push(ch);
             }
            
             while( st.isEmpty()==false  && k>0)
             {
                  st.pop();
                  k--;
             }
            
             StringBuilder ans= new StringBuilder();
            
             while( st.isEmpty()==false)
             {
                  char ch = st.pop();
                 
                  ans.append( ch );
             }
            
             ans.reverse();
            
             int i=0;
            
             while( i< ans.length() && ans.charAt(i)=='0')
             {
                  i++;
             }
            
             if( i== ans.length() )
             {
                 return "0";
             }
            else
            {
                 return ans.toString().substring(i);
            }
             
        }
    }

    
}
