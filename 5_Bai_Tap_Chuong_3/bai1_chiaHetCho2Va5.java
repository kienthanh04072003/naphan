import java.util.Scanner;

public class bai1_chiaHetCho2Va5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("INPUT A NUMBER FORM KEYBOARD : ");
        n=sc.nextInt();
        if(n%5==0){
           System.out.print("INPUT NUMBER IS DIVISIBLE BY 5 !");
        }else if(n%2==0){
            System.out.print("INPUT NUMBER IS DIVISIBLE BY 2 !");
        }else{
            System.out.print("INPUT NUMBER IS DIVISIBLE BY 2 and 5 !");
        }
        
    }
}
