package thuchanh;

public class question1 {
    public static void kiemtradiem(int mang[][], int key[][]) {
        int dem = 0;
        for (int i = 0; i < mang.length; i++) {

            for (int j = 0; j < mang[i].length; j++) {
                if (mang[i][j] == key[0][j]) {
                    dem++;
                }
            }
            System.out.println("Grades of the second student " + i + " :" + dem + "point");
            dem = 0;

        }
    }

    public static void main(String[] args) {
        System.out.println("Check the answers to evaluate the score");
        int[][] mang = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        int[][] key = {
            {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}};
        kiemtradiem(mang, key);
    }
}
