import java.util.Scanner;

public class PerpustakaanKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Perpustakaan Kampus ===");
        System.out.print("Apakah membawa kartu mahasiswa? (ya/tidak): ");
        String kartu = input.nextLine().toLowerCase();

        System.out.print("Apakah sudah registrasi online? (ya/tidak): ");
        String registrasi = input.nextLine().toLowerCase();

        if (kartu.equals("ya") || registrasi.equals("ya")) {
            System.out.println("Izin masuk perpustakaan diberikan.");
        } else {
            System.out.println("Izin masuk perpustakaan ditolak.");
        }

        input.close();
    }
}