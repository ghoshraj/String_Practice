package string;

public class SecondMaximumOccuranceChar {
    public static void main(String[] args) {
        String s = "jjaaarra";
        char[] ch = s.toCharArray();
        int maxcount = 1;
        int secondmaxcount = 0;

        char c = ' ';
        char c1 = ' ';
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
                  secondmaxcount = maxcount;
                  maxcount = count;
                  c1 = c;
                  c = ch[i];
              }
              else if (count > secondmaxcount && count != maxcount){
                  secondmaxcount = count;
                  c1 = ch[i];
              }
        }
       // System.out.println(c + " : " + maxcount);
        System.out.println(c1 + " : " + secondmaxcount);
    }
}
