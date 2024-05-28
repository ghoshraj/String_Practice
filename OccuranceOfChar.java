package string;

public class OccuranceOfChar {
    public static void main(String[] args) {
        String s = "ramana";
        char [] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++){
            int count = 1;
            if (ch[i] == '\u0000')
                continue;
                for (int j = i + 1; j < s.length(); j++){
                if (ch[i] == ch[j]){
                    ch[j] = '\u0000';
                    count++;
                }
            }
                System.out.println(ch[i] +": " + count);
        }
    }
}
