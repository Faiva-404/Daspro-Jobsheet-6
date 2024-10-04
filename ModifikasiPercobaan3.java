import java.util.Scanner;
public class ModifikasiPercobaan3 {
    public static void main(String[] args) {
        Scanner absen09 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih; 
        double pajak = 0;

        System.out.print("Masukkan Kategori: "); 
        kategori = absen09.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = absen09.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2000000)
                pajak = 015;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else 
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
        } else
            System.out.println("Masukkan Kategori Salah ");
            absen09.close();
    }
}

