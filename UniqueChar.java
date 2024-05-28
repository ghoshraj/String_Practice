package string;

public class UniqueChar {
    public static void main(String[] args) {
        String s = "jaava";
        char []ch = s.toCharArray();
        String S1 = " ";
        for (int i = 0; i < ch.length -1;i++){
            int count = 0;
            if (ch[i] == '\u0000')
                continue;
            for (int j = i + 1; j < ch.length; j++){
                if (ch[i] == ch[j]){
                    ch[j] = '\u0000';
                    count++;
                }
            }
            if (count > 0)
                ch[i] = '\u0000';
            if (ch[i] != '\u0000')
                S1 += ch[i] + "";
        }
        System.out.println(S1);
    }
}
