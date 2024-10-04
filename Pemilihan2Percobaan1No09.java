import java.util.Scanner;
public class Pemilihan2Percobaan1No09 {
    public static void main(String[] args) {
        Scanner absen09 = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = absen09.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) !=0)
            System.out.println("Tahun Kabisat");
        } else
        System.out.println("Bukan Tahun abisat");
    }
}