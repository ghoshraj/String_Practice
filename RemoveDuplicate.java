package string;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "jaarra";
        String c =" ";
        char []ch = s.toCharArray();
        for (int i= 0; i < ch.length - 1; i++){
            if (ch[i] == '\u0000')
                continue;
            for (int j = i + 1; j < ch.length;j++){
                if (ch[i] == ch[j]){
                    ch[j] = '\u0000';
                }
            }
                c +=ch[i] + "";
        }
        System.out.println(c);
    }
}
