package string;

public class MinimumOccuranceChar {
    public static void main(String[] args) {
        String s = "AA@jiajaqvvxjjjaixcijk";
        int mincount = 4;
        char c = ' ';
        char[]ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++){
            int count = 1;
            if (ch[i] == '\u0000')
                continue;
            for (int j = i + 1; j < ch.length;j++){
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\u0000';
                }
            }
            if (count < mincount){
                mincount = count;
                c = ch[i];
            }
            if (mincount == 1)
                break;
        }
        System.out.println(c + ":" + mincount);
    }
}
