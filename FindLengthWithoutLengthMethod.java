package string;

public class FindLengthWithoutLengthMethod {
    public static void main(String[] args) {
        String s1 = "abcdefgh";
        char [] arr = s1.toCharArray();
        int count = 0;
        for (int i= 0;i < arr.length; i++){
            count++;
        }
        System.out.println(count);
    }
}
