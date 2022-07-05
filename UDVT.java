import java.util.Scanner;

public class UDVT {
    public static void main(String[] args) {
     double money =1.0;
     int mouth =1;
     double interesRate = 1.0;
     Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền gửi");
        money =input.nextDouble();
        System.out.println("nhập số tháng gửi");
        mouth = input.nextInt();
        System.out.println("nhập lãi suất");
        interesRate = input.nextDouble();
        double totalInterest = 0;
        for (int i=0; i<mouth;i++){
            totalInterest += money*(interesRate/100)/12*mouth;
        }
        System.out.println("số tiền lãi là "+totalInterest);
     }
}
