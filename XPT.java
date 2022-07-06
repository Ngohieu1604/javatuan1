import java.util.Scanner;

public class XPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {10,4,6,7,8,6,0,0,0,0};
        int num = 7;
        int index = 0;
        for (int i = 0; i<arr.length; i++,index++){
            if (arr[i] == num){
                System.out.println(" Vi tri phan tu xoa la: " + index);
                int j = i;
                while (j<arr.length-1){
                    arr[j] = arr[j+1];
                    arr[j+1]=0;
                    j++;
                }
            }
        }
    }
}
