package string;

public class RemoveConsecutiveWord {
    public static void main(String[] args) {
        String s1 = "Bangalore is a bangalore city".toLowerCase();
        String s2[] = s1.split(" ");
        for (int i = 0; i < s2.length; i++) {
            if (s2[i] .equals( "\u0000")) {
                continue;
            }
            for (int j = i + 1; j < s2.length; j++) {
                if (s2[i].equals(s2[j])) {
                    s2[j] = "\u0000";
                }
            }
        System.out.print(s2[i] + " ");
        }
    }
}
