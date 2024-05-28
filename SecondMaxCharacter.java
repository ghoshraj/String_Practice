package string;

public class SecondMaxCharacter {
    public static void main(String[] args) {
        String s = "hihhhhhhhi";
        char [] arr = s.toCharArray();
        char max1 = arr[0];
        char max2 = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2 && arr[i] != max1){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
