public class Q12 {
    public static void removeDublicate(String str, int idx, StringBuilder newstr,boolean map[])
    {
        if(idx== str.length()){
            System.out.println(newstr   );
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true)
        { //if dublicate exits
            removeDublicate(str, idx+1, newstr, map);
        }
        else{
            //if it is new character
            map[currChar - 'a' ] = true;
            removeDublicate(str, idx+1, newstr.append(currChar), map);

        }
    }
    public static void main(String[] args) {
        String str="apnaaccollegge";
        boolean[] map= new boolean [26];
        StringBuilder newstr= new StringBuilder(""); 
        removeDublicate(str, 0, newstr,map);
    }
}
