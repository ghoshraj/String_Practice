package string;

public class SmallestSubstringPalindrome {
    public static void main(String[] args) {
        String s = "Malayalam";
        String smallpali = null;
        for (int i = 0; i < s.length() -1; i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                if (ispali(s,i,j)){
                    String b = s.substring(i,j+1);
                    if (smallpali == null || b.length() < smallpali.length()){
                        smallpali = b;
                    }
                }
            }
        }
        System.out.println(smallpali);
    }
    public static boolean ispali(String s , int start , int end){
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
