package string;

public class RemoveVowel {
    public static void main(String[] args) {
        String s = "java is easy";
        String s2 = "";
        String s3 = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length()-1; i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                s3+=ch;
            else
                s2+=ch;
        }
        System.out.println(s2);
    }
}
