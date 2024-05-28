package string;

public class ReverseWords {
    public static void main(String[] args) {
        String s1 = "java is easy";
        String []s2 = s1.split(" ");
        String s3 = s2[s2.length - 1];
        for (int i = s2.length - 2; i >= 0; i--){
            s3 = s3 + " " + s2[i];
           //System.out.print(s2[i] + " ");
        }
        System.out.println(s3);
    }
}
