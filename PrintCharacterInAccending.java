package string;

public class PrintCharacterInAccending {
    public static void main(String[] args) {
        String s = "aghdscGJF";
        char [] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++){
            for (int j = 0; j < ch.length - 1 -i; j++){
                if (ch[j] > ch[j + 1]){
                    char ch1 = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = ch1;
                }
            }
        }
        System.out.println(ch);
    }
}
