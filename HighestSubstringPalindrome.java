package string;

public class HighestSubstringPalindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        String bigpali = " ";
        for (int i = 0; i < s.length() -1; i++){
            for (int j = i + 1; j < s.length() -1; j++){
                if (ispalindrome(s,i,j)){
                    String b = s.substring(i, j+1);
                    if (b.length() > bigpali.length()){
                        bigpali = b;
                    }
                }
            }
        }
        System.out.println(bigpali);
    }
    static boolean ispalindrome(String s ,int start, int end){
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
