import java.util.Scanner;

public class bai3_DeterminingLeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("nhap so nam : ");
        int year=sc.nextInt();
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.print(year+" La nam nhuân !");
        }else{
            System.out.print(year+" Khong phai nam nhuan !");
        }
    }
}
