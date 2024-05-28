package string;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String s = "JaVa";
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++){
            char ch1 = ch[i];
            if (ch1 >= 'A' && ch1 <= 'Z') {
                ch[i] = (char)(ch1 + 32);
            }
            else {
                ch[i] = (char)(ch1 - 32);
            }
        }
        System.out.println(ch);
    }
}
