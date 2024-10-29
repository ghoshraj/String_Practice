package string;

public class Advance1 {
    public static void main(String[] args) {
//        string input = Bamboozled ;.
//        output ->
//        B a
//        e d
//        e d
//        mbooozled
//         mbooozled
//        mbooozled
//         Bamboo
//        Bamboo
//        Bamboo
//        Bamboo
//        delzoobmaB
//        Bamboozled
//        Bmoze
//        Bbzd
//        Boe
//        BamboozledHype!
//        BambooMonger!
        String s = "Bamboozled";
        System.out.println(s.charAt(0)+ " " + s.charAt(1));
        for (int i = 0; i < 2; i++){
            System.out.println(s.charAt(8) + " " + s.charAt(9));
        }
        for (int i = 0; i < 3; i++){
            System.out.println(s.substring(2,10));
        }
        for (int i = 0; i < 4; i++){
            System.out.println(s.substring(0,6));
        }
         StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse().toString());
        System.out.println(s);
        String s1 = "";
        for (int i = 0; i < s.length(); i++){
            if (i % 2 == 0)
                s1+=s.charAt(i);
        }
        System.out.println(s1);
        String s2 = "";
        for (int i = 0; i <s.length();i+=3){
            s2+=s.charAt(i);
        }
        System.out.println(s2);
        System.out.println(s+"Hype!");
       String s3 = "";
       for (int i = 0; i <= 5; i++){
           s3+=s.charAt(i);
       }
        System.out.println(s3+"Monger!");
    }
}
