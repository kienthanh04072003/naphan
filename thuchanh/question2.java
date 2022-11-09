package thuchanh;
import java.util.Scanner;

public class question2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][][] a = new int[100][100][100];
        inputInformation(a);

    }

    public static void inputInformation(int[][][] a) {
        int student, test, score;
        System.out.print("nhap so luong sinh vien : ");
        student = sc.nextInt();

        System.out.print("nhap gioi han so diem: ");
        test = sc.nextInt();

        System.out.print("nhap so lan ky thi : ");
        score = sc.nextInt();

        int[] arrTn = new int[100];
        int[] arrTl = new int[100];
        int a1 = 0;
        int b2 = 0;

        for (int i = 0; i < student; i++) {
            System.out.println("nhap diem cho hoc sinh thu " + (i + 1) + ": ");
            for (int j = 0; j < test; j++) {

                for (int k = 0; k < score; k++) {
                    if (j == 1) {
                        System.out.println("nhap diem trac nhiem lan thu " + (k + 1) + ": ");

                        a1 = sc.nextInt();
                        a[i][j][k] = a1;

                        int sumTNTL = a1 + b2;
                        System.out.println("");
                        System.out.println("tong diem cua hoc sinh la: " + (i + 1) + "la" + sumTNTL);

                    } else {

                        System.out.println("nhap diem tu luan lan thu " + (k + 1) + ": ");
                        b2 = sc.nextInt();
                        a[i][j][k] = b2;
                    }

                }
            }
        }
        outPut(a, student, test, score);

    }

    public static void outPut(int[][][] a, int student, int test, int score) {
        for (int i = 0; i < student; i++) {
            System.out.println("diem cua hoc sinh thu " + (i + 1) + " la");

            for (int j = 0; j < test; j++) {

                for (int k = 0; k < score; k++) {

                    System.out.println(a[i][j][k] + " ");

                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
    
