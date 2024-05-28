package string;

public class CountTotalPalindrome {
    public static void main(String[] args) {
        String s = "banana";
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++){
            for (int j = i + 1; j < s.length();j++){
                if (ispalindrome(s,i,j))
                    count ++;
            }
        }
        System.out.println(count);
    }
    static boolean ispalindrome(String s , int start , int end){
        s = s.toLowerCase();
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
