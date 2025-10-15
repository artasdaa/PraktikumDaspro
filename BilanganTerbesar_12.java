import java.util.Scanner;

public class BilanganTerbesar_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Inputan tiga angka
        System.out.print("Masukkan angka pertama: "); //Membaca angka pertama
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: "); //Membaca angka kedua
        int b = input.nextInt();
        System.out.print("Masukkan angka ketiga: "); //Membaca angka ketiga
        int c = input.nextInt();

        //Menentukan angka terbesar
        int terbesar = Math.max(a, Math.max(b, c));
        //Variabel untuk menyimpan hasil dan perhitungan jumlah angka terbesar
        String hasil = "Angka terbesar adalah: " + terbesar; //Pesan default jika hanya satu angka terbesar
        int JumlahTerbesar = 0; //Menghitung berapa banyak angka yang sama besar
        String AngkaTerbesar = ""; //Menyimpan angkaangka terbesar yang sama besar

        //Mengecek apakah masing masing sama dengan angka terbesar
        if (a == terbesar) {
            JumlahTerbesar++; //Tambahkan jumlah angka terbesar
            AngkaTerbesar += a + " "; //Simpan angka
        }
        if (b == terbesar) {
            JumlahTerbesar++;
            AngkaTerbesar += b + " ";
        }
        if (c == terbesar) {
            JumlahTerbesar++;
            AngkaTerbesar += c + " ";
        }

        //Jika ada lebih dari satu angka dengan nilai terbesar yang sama
        if (JumlahTerbesar > 1) {
            hasil = "Ada " + JumlahTerbesar + " angka terbesar, yaitu: " + AngkaTerbesar.trim();
        }
        
        System.out.println(hasil); //Menampilkan hasil akhir
    }
}
