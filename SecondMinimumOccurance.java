package string;

public class SecondMinimumOccurance {
    public static void main(String[] args) {
        String s = "jaaraar";
        char ch [] = s.toCharArray();
        int mincount = Integer.MAX_VALUE;
        int second_mincount = Integer.MAX_VALUE;
        char minchar = ' ';
        char second_minchar = ' ';
        for (int i = 0; i < ch.length;i++){
            int count = 1;
            if (ch[i] == '\u0000')
                continue;
            for (int j = i + 1; j < ch.length; j++){
                if (ch[i] == ch[j]){
                    ch[j] = '\u0000';
                    count++;
                }
            }
            if (count < mincount){
                second_mincount = mincount;
                mincount = count;
                second_minchar = minchar;
                minchar = ch[i];
            }
            else if (count < second_mincount && count != mincount){
                second_mincount = count;
                second_minchar = ch[i];
            }
        }
        System.out.println(second_minchar + ":" + second_mincount);
    }
}
