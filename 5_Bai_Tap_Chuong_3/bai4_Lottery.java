import java.util.Scanner;

public class bai4_Lottery {
    public static void main(String[] args){
        int lottery=(int)(Math.random()*100);
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess=sc.nextInt();

        int lotteryDigit1=lottery/10;
        int lotteryDigit2=lottery%10;

        int guessDigit1=guess/10;
        int guessDigit2=guess%10;

        System.out.println("The lottery number is : "+lottery);

        if(guess==lottery){
            System.out.print("Exact match : you win 10,000 dolla");
        }else if(guessDigit2==lotteryDigit1&&guessDigit1==lotteryDigit2){
            System.out.print("Match all digits : you win 3000 dolla");
        }else if(guessDigit1==lotteryDigit1
                ||guessDigit1==lotteryDigit2
                ||guessDigit2==lotteryDigit1
                ||guessDigit2==lotteryDigit2
        ){
            System.out.print("Match one digit: you win 1000 dolla");
        }else{
            System.out.print("you dont match anything, see you later !!!");
        }

    }
}
