package string;

public class CaseCountString {
    public static void main(String[] args) {
        String s = "*abcA123BH#@";
        int n = 0;
        int b = 0;
        int sm = 0;
        int sp = 0;
        for (int i = 0; i < s.length(); i++){
             if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                b++;
            }
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sm++;
            }
             else if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                 n++;
             }
            else {
                sp++;
            }
        }
        System.out.println(n + "  " + b + " " + sm + " " + sp);
    }
}
