package string;

public class ChangeRepeatCharacter {
    public static void main(String[] args) {
        String s1 = "jaava";
        char[] ch = s1.toCharArray();
        for (int i = 0 ; i < ch.length; i++){
           int count = 0;
            for (int j = i +1; j < ch.length;j++){
                if (ch[i] == ch[j]){
                    ch[j] = '$';
                    count++;
                }
            }
            if (count > 0)
          ch[i]= '$';
        }
        System.out.println(ch);
    }
}
