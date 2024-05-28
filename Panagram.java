package string;

public class Panagram {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyza";
        System.out.println(ispanagram(s));
    }
    public static boolean ispanagram(String s){
        s = s.toLowerCase();
        if (s.length() < 26)
            return false;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1)
                return false;
        }
        return true;
    }
}
