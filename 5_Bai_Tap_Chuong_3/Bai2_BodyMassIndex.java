import java.util.Scanner;

public class Bai2_BodyMassIndex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("nhap so can nang : ");
        double kilogram=sc.nextDouble();
        
        System.out.print("nhap so chieu cao: ");
        double height=sc.nextDouble();

        double BMI;
        BMI=kilogram/(height*height);
        System.out.println("The BMI IS : "+BMI);

        if(BMI<18.5){
            System.out.print("=======Underweight=========");
        }else if(BMI>=18.5&&BMI<25.5){
            System.out.print("=======Normal==========");
        }else if(BMI>=25.0&&BMI<30.0){
            System.out.print("=======Overweight=======");
        }else{
            System.out.print("=======Obese======");
        }



    }
}
