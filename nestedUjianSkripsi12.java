import java.util.Scanner;
public class nestedUjianSkripsi12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================= Percobaan 1: IF UKT =================
        System.out.println("--- CETAK KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");

            // ================= Percobaan 2: SWITCH SEMESTER =================
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

            // ================= Percobaan 3: NESTED IF SKRIPSI =================
            sc.nextLine();
            System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
            String bebasKompen = sc.nextLine().trim();

            System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
            int bimbinganP1 = sc.nextInt();

            System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
            int bimbinganP2 = sc.nextInt();

            String pesan;
            if (bebasKompen.equalsIgnoreCase("Ya")) {
                if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                    pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
                } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                    pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
                } else if (bimbinganP1 < 8) {
                    pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
                } else {
                    pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
                }
            } else {
                pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
            }
            System.out.println(pesan);
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        sc.close();
    }
}
