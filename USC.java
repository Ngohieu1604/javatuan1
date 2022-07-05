import java.util.Scanner;

public class USC {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số a");
        a = input.nextInt();
        System.out.println("nhập số b");
        b = input.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0 || b==0)
            System.out.println("No greatest common factor");
        while (a!=b){
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
        System.out.println("Greatest common factor: "+a);
    }
}