package string;

public class LongestWord {
    public static void main(String[] args) {
        String s ="Java is Easy";
        String []s2 = s.split(" ");
        int length = 0;
        String s3 = "";
        for (int i = 0; i < s2.length; i++){
            String s1 = s2[i];
            int flength = s1.length();
            if (flength > length)
                s3 = s1;
        }
        System.out.println(s3);
    }
}
