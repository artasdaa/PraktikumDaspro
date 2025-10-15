import java.util.Scanner;

public class BonusKaryawan_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input data 
        System.out.print("Masukkan nilai kinerja (1-100): ");
        int kinerja = input.nextInt(); //Membaca nilai kinerja karyawan (1–100)
        System.out.print("Masukkan lama bekerja (tahun): ");
        int lamaKerja = input.nextInt(); //Membaca lama bekerja dalam setahun
        System.out.print("Masukkan gaji pokok (Rp): ");
        double gajiPokok = input.nextDouble(); //Membacagaji pokok dalam rupiah
        System.out.print("Apakah memiliki sertifikasi profesional? (ya/tidak): ");
        String sertifikasi = input.next(); //Membaca jawaban apakah karyawan memiliki sertifikasi profesional

        double bonus = 0; //Untuk menyimpan bonus utama berdasarkan kinerja dan lama kerja

        //Penentuan bonus utamaberdasarkan kinerja dan lama kerja
        if (kinerja >= 70 && kinerja < 90) { //Jika kinerja baik (70–89)
            if (lamaKerja < 2) {
                bonus = 0.01 * gajiPokok;
            } else if (lamaKerja >= 2 && lamaKerja < 5) {
                bonus = 0.03 * gajiPokok;
            } else if (lamaKerja >= 5) {
                bonus = 0.05 * gajiPokok;
            }
        } else if (kinerja >= 90) { //Jika kinerja sangat baik (90–100)
            if (lamaKerja < 2) {
                bonus = 0.02 * gajiPokok;
            } else if (lamaKerja >= 2 && lamaKerja < 5) {
                bonus = 0.04 * gajiPokok;
            } else if (lamaKerja >= 5) {
                bonus = 0.07 * gajiPokok;
            }

        } 

        //Bonus tambahan untuk sertifikasi profesional
        double bonusSertifikasi = 0;
        boolean eligible = ((kinerja >= 70) && (lamaKerja >= 0));
        if (eligible && sertifikasi.equalsIgnoreCase("ya")) {
            bonusSertifikasi = 500_000; //Bonus tetap
        }

        double totalBonus = bonus + bonusSertifikasi; //Menjumlahkan bonus utama dan bonus sertifikasi

        //Output Hasil
        System.out.printf("Bonus utama: Rp %.0f\n", bonus);
        System.out.printf("Bonus sertifikasi: Rp %.0f\n", bonusSertifikasi);
        System.out.printf("Total bonus yang diterima: Rp %.0f\n", totalBonus);
    }
}
