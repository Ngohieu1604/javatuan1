package lesson1;

import java.util.Scanner;

public class Mainimport {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);// khai báo biến scanner
        System.out.println("Enter width");// nhập chiều rộng
        width = scanner.nextFloat();
        System.out.println("Enter height");// nhập chiều dài
        height= scanner.nextFloat();
        float area = width * height;
        System.out.println("area =" +area);
    }
}
