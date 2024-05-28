package string;

public class OccuranceOfWords {
    public static void main(String[] args) {
        String s1 = "madam is very beautiful madam speaks hindi".toLowerCase();
        String []s2 = s1.split(" ");
        for (int i = 0; i < s2.length; i++) {
            int count = 1;
            if (s2[i] == "\u0000") {
            continue;
            }
            for (int j = i + 1; j < s2.length; j++) {
                if (s2[i].equals(s2[j])) {
                    count++;
                    s2[j] = "\u0000";
                }
            }
                System.out.println(s2[i] + " " + count);
        }
    }
}
