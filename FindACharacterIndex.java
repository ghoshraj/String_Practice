package string;

public class FindACharacterIndex {
    public static void main(String[] args) {
        String s = "java is easy";
        char a = 'a';
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == a)
                System.out.println(i);
        }
    }
}
