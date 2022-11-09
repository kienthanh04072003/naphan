package thuchanh;
import java.util.Scanner;;
public class question10 {
    public static void main(String[] args) {
        int number, count = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("nhap vao mot so nguyen duong bat ki : ");
        number = scanner.nextInt();
        while (number > 0) {
            number /= 10;
            count++; 
        System.out.println("So cac chu so : " +count);
}
}
}