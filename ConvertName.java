package string;

public class ConvertName {
    public static void main(String[] args) {
        String s = "Rajesh Kumar Ghosh";
        String []s2 = s.split(" ");
        String ans = "";
        for (int i = 0; i < s2.length-1; i++){
            ans += s2[i].charAt(0)+".";
        }
        ans+=s2[s2.length-1];
        System.out.println(ans);
    }
}
