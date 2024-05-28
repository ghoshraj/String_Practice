package string;

public class Permutation {
    public static void main(String[] args) {
        String s1 = "abc";
        permutation(s1,0,s1.length() -1);
    }

    static void permutation(String s,int start , int end){
        if (start == end){
            System.out.println(s);
            return;
        }
        for (int i = start; i <= end; i++){
            String s1 = swap(s,start,i);
            permutation(s1,start + 1,end);
        }
    }
    static String swap(String s1, int i , int j){
        char[]ch = s1.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
}
