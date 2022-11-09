import java.util.Scanner;

public class bai5_Zodiac {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Nhap so nam : ");
        int year=sc.nextInt();
        int check=year%12;
        switch(check){
            case 0:
            System.out.print("nam con khi");
            break;

            case 1:
            System.out.print("nam con ga");
            break;

            case 2:
            System.out.print("nam con cho");
            break;

            case 3:
            System.out.print("nam con heo");
            break;

            case 4:
            System.out.print("nam con chuot");
            break;

            case 5:
            System.out.print("nam con trau");
            break;

            case 6:
            System.out.print("nam con ho");
            break;

            case 7:
            System.out.print("nam con tho");
            break;

            case 8:
            System.out.print("nam con rong");
            break;

            case 9:
            System.out.print("nam con ran");
            break;

            case 10:
            System.out.print("nam con ngua");
            break;

            case 11:
            System.out.print("nam con de");
            break;
            
        }
    }
}
