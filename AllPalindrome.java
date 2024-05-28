package string;

public class AllPalindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        for (int i = 0; i < s.length() - 1; i++){
            for (int j = i + 1; j < s.length(); j++){
                if (ispalindrome(s,i,j))
                    System.out.println(s.substring(i , j+1));
            }
        }
    }
    static boolean ispalindrome(String s , int start , int end){
        s = s.toUpperCase();
        int i = start;
        int j = end;
        while (i < j){
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
