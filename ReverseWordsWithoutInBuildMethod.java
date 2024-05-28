package string;

public class ReverseWordsWithoutInBuildMethod {
    public static void main(String[] args) {
        String s1 = "java is easy";
        char []a = s1.toCharArray();
        int i = 0;
        int j = 0;

        while (i < a.length){
            while (j < a.length && a[j] != ' ')
                j++;
          int start = i;
          int end = j - 1;
          while (start < end){
              char temp = a[start];
              a[start] = a[end];
              a[end] = temp;
              start++;
              end--;
          }
            j++;
            i = j;
        }
        String s2 = new String(a);
        System.out.println(s2);
    }
}
