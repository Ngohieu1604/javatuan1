package lesson2;

import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số :");
        int number = scanner.nextInt();
        if (number < 2 ){
            System.out.println(number + "đây không phải số nguyên tố");
        } else{
         int i = 2;
         boolean check = true;
         while (i <= Math.sqrt(number)){
             if (number % i == 0){
                 check =false;
                 break;
             }
             i++;
         }
         if (check){
             System.out.println(number+ "đây là số nguyên tốt");
         }else {
             System.out.println(number + "đây không phải là số nguyên tố");
         }
        }
    }
}
