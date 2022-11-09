package thuchanh;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class question3 {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\bai tap chuong 3\\thuchanh\\text.txt");
        int i = 0;
        try ( Scanner sc = new Scanner(file)) {
            float[] a = new float[100];
            float[] ngay = new float[100];
            float[] gio = new float[100];
            float[] nhietdo = new float[100];
            float[] doam = new float[100];
            int n = 0;
            while (sc.hasNextFloat()) {
                float number = sc.nextFloat();
                i++;
                a[i] = number;
                n++;
            }
            transferArray(a, ngay, n, gio, nhietdo, doam);
            trungbinhnhietdo(nhietdo, n);
            doam(doam, n);
        }

    }

    public static void transferArray(float[] a, float[] ngay, int n, float[] gio, float[] nhietdo, float[] doam) {

        for (int j = 1; j <= n; j = j + 4) {
            int t = 0;
            ngay[j] = a[j];

        }

        for (int t = 2; t <= n; t = t + 4) {
            gio[t] = a[t];

        }

        for (int g = 3; g <= n; g = g + 4) {
            nhietdo[g] = a[g];

        }

        for (int q = 4; q <= n; q = q + 4) {
            doam[q] = a[q];

        }
        System.out.println("\t\t\tNgay\t\tGio\t\tNhietdo\t\tDoAm");
        for (int i = 1; i < n; i = i + 4) {
            int t = i + 1;
            int l = t + 1;
            int f = l + 1;
            System.out.println("\t\t\t" + (int) ngay[i] + "\t\t" + (int) gio[t] + "\t\t" + nhietdo[l] + "\t\t" + doam[f]);
        }
    }

    public static void trungbinhnhietdo(float[] nhietdo, int n) {
        float sum = 0;
        float trungbinh;
        int g = 0;

        for (int i = 3; i < n; i = i + 4) {
            sum = sum + nhietdo[i];
            g++;
        }
        trungbinh = sum / g;
        System.out.println("\nNhiet Do trung binh la:\t\t\t\t\t" + trungbinh);
    }

    public static void doam(float[] doam, int n) {
        float sum = 0;
        float trungbinh;
        int g = 0;

        for (int i = 4; i < n; i = i + 4) {
            sum = sum + doam[i];
            g++;
        }
        trungbinh = sum / g;
        System.out.println("\nNhiet Do trung binh la:\t\t\t\t\t\t\t" + trungbinh);
    }
}

    

