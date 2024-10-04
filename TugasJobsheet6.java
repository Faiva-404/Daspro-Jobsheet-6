import java.util.Scanner;

public class TugasJobsheet6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int bil1, bil2, bil3;
        
        System.out.print("Masukkan bilangan 1: ");
        bil1 = scanner.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = scanner.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = scanner.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil1);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar adalah: " + bil2);
            } else {
                System.out.println("Bilangan terbesar adalah: " + bil3);
            }
        }
    }
}