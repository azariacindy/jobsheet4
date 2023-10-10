import java.util.Scanner;

public class circle07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double keliling, luas;

        //eksekusi code yang mungkin menghasilkan pengecualian
        try {
            System.out.print("Masukkan jari-jari (r) lingkaran: ");
            r = input.nextInt();

            keliling = 2 * Math.PI * r;
            luas = Math.PI * r * r;

            System.out.println("Keliling Lingkaran: " + keliling);
            System.out.println("Luas Lingkaran: " + luas);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Masukan tidak valid. Pastikan Anda memasukkan angka yang benar.");
        }
    }
}
