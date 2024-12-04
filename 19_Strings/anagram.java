import java.util.Arrays;

public class anagram {
    public static boolean checkAnagram(String s1,String s2)
    {
        char s1Array[]= s1.toCharArray();
        char s2Array[]= s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        // if(s1Array == s2Ar) return true;
       
        return (Arrays.equals(s1Array, s2Array));
        // System.out.println(s1Array);
        // System.out.println(s2Array);

    }
    public static void main(String[] args) {
        String s1="eat";
        String s2="tea";
        System.out.println(checkAnagram(s1, s2));
    }
}
