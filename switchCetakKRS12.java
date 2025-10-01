import java.util.Scanner;
public class switchCetakKRS12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
            System.out.print("Masukkan semester saat ini: ");
            int semester = sc.nextInt();
            switch (semester) {
                case 1:
                    System.out.println("KRS Semester 1 ditampilkan");
                    break;
                case 2:
                    System.out.println("KRS Semester 2 ditampilkan");
                    break;
                case 3:
                    System.out.println("KRS Semester 3 ditampilkan");
                    break;
                case 4:
                    System.out.println("KRS Semester 4 ditampilkan");
                    break;
                case 5:
                    System.out.println("KRS Semester 5 ditampilkan");
                    break;
                case 6:
                    System.out.println("KRS Semester 6 ditampilkan");
                    break;
                case 7:
                    System.out.println("KRS Semester 7 ditampilkan");
                    break;
                case 8:
                    System.out.println("KRS Semester 8 ditampilkan");
                    break;
                default:
                    System.out.println("Semester tidak valid");
            }
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        sc.close();
    }
}
