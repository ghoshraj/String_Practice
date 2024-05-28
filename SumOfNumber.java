package string;

import java.util.Scanner;

public class SumOfNumber {
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             String s1 = sc.nextLine();
             int store = 0;
             int sum = 0;
             char [] arr = s1.toCharArray();
             for (int i = 0; i < arr.length; i++){
                 if (arr[i] >= 48 && arr[i] <= 57){
                     store =store * 10 + arr[i] - 48;
                 }
                 else {
                     sum += store;
                     store = 0;
                 }
                 if (i == arr.length - 1)
                     sum += store;
             }
             System.out.println(sum);
         }
   }
