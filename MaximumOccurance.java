package string;

public class MaximumOccurance {
    public static void main(String[] args) {
        String s = "jjaaarra";
        char[] ch = s.toCharArray();
        int maxcount = 1;

        char c = ' ';
        for (int i = 0; i < ch.length - 1;i++){
            int count = 1;
            if (ch[i] == '\u0000')
                continue;
            for (int j = i + 1; j < ch.length;j++){
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\u0000';
                }
            }
            if (count > maxcount) {
                maxcount = count;
                c = ch[i];
            }
        }
        System.out.println(c + " : " + maxcount);
    }
}
