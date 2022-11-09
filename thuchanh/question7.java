package thuchanh;

import java.util.Scanner;

public class question7 {

 public static void main(String[] args) {
    int n;   
    Scanner nhap = new Scanner(System.in);
    System.out.println("Nhap so nguyen: ");
    n = nhap.nextInt();
    switch(n){
      case 1: 
      {
         int count = 0;
         for (int i = 0; i < 10; i++) {
             if (isPrimeNumber(i) == true) {
                 System.out.print(i+" ");
                 count++;
             }
         }
         System.out.println();
         System.out.println(" so luong so nguyen to co 1 chu so la: "+count);
         break;
      }
      case 2:
      {
         int count = 0 , k = 0;
         for (int i = 10, i < 100; i++){
            k=i
            while (isPrimeNumber(k) == true){
               k = k/10
            }
         } 
      }
    }
 }
}
