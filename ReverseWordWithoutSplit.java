package string;

public class ReverseWordWithoutSplit {
    public static void main(String[] args) {
        String s = "java is easy";
        String s1 = "";
        char ch[] = s.toCharArray();
        int i = s.length() - 1;
        int j = s.length() - 1;

        while (i > 0){
            while (j > 0 && ch[j] != ' ')
                j--;
            s1 +=s.substring(j,i + 1) + " ";
            j--;
            i = j;
        }
        System.out.println(s1);
    }
}
