import java.util.Stack;

class Pair
{
     char chr;
     int freq;
    
     Pair( char chr, int freq)
     {
          this.chr= chr;
          this.freq= freq;
     }
}

class Solution {
    public String removeDuplicates(String s, int k)
    {
        Stack<Pair>st= new Stack<>();
        
        for( int i=0;i< s.length();i++)
        {
             char ch = s.charAt(i);
            
            if( st.isEmpty()==false && st.peek().chr == ch )
            {
                 st.peek().freq++;
                 
                 if( st.peek().freq == k )
                 {
                     st.pop();
                 }
            }
            else
            {
                Pair p = new Pair( ch, 1);
                
                st.push( p );
            }
        }
        
        
        StringBuilder ans= new StringBuilder();
        
        while( st.isEmpty()==false)
        {
            int freq= st.peek().freq;
            char ch = st.peek().chr;
            st.pop();
            
            for( int i=1;i<= freq;i++)
            {
                 ans.append( ch );
            }
        }
        
        ans.reverse();
        return ans.toString();
    }
}





