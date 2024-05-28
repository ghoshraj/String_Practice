package string;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Malayalam";
        System.out.println(palindrome(s));
    }
    static boolean palindrome(String s){
        s = s.toUpperCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j){
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
