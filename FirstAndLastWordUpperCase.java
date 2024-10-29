package string;

public class FirstAndLastWordUpperCase {
    public static void main(String[] args) {
        String s = "java is easy";
        String []s1 = s.split(" ");
        String s2 = "";
        for (int i = 0; i < s1.length; i++){
            if(i == 0 || i == s1.length - 1)
                s2 += s1[i].toUpperCase()+" ";
            else
            s2+=s1[i]+" ";
        }
        System.out.println(s2);
    }
}
