package string;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            s = s.toLowerCase();
            if (s.charAt(i) == 'a'|| s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
