package thuchanh;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
       System.out.print("Nhap vao 1 day so nguyen n = ");
       long n = ip.nextLong();
       long tong = 0;
       int i = 0;

       while (n != 0) {

           tong = tong * 10 + n % 10;
           n = n / 10;
       }
       long[] mang = new long[99999999];
       long sum;
       while (tong != 0) {
           sum = tong % 10;
           tong = tong / 10;
           i++;
           mang[i] = sum;

       }
       System.out.println("vi tri:");
       int vitri = ip.nextInt();
       if (vitri <= i) {

           System.out.println("gia tri cua vi tri thu " + vitri + " la so:" + mang[vitri]);
       } else {
           System.out.println(" vi tri  da vuot qua vi tri cua day so nguyen");
       }
   }
}
