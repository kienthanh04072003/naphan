package thuchanh.question8;
import java.util.Scanner;;
public class text2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap chuoi vao check doi xung : ");
        String str=sc.nextLine();

        checkString check1=new checkString(str);
        check1.checkBolean(str);

    }
}
