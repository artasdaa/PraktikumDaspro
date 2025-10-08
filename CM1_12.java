import java.util.Scanner;
public class CM1_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Inputan meminta Data Mahasiswa berupa Nama dan NIM mereka
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();

        //Inputan Nilai Mata Kuliah 1
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = input.nextDouble();

        //Inputan Nilai Mata Kuliah 2
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = input.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = input.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = input.nextDouble();

        //Hitung nilai akhir dari nilai UTS, UAS, dan, Tugas Rumusnya: UTS 30%, UAS 40%, dan Tugas 30%
        double akhir1 = (uts1*0.3)+(uas1*0.4)+(tugas1*0.3);
        double akhir2 = (uts2*0.3)+(uas2*0.4)+(tugas2*0.3);

        //Variabel untuk menyimpan nilai huruf (grade) dan status kelulusan
        String grade1 = "", grade2 = "";
        String status1, status2;

        //Menentukan nilai huruf
        if (akhir1 >= 85) grade1 = "A";
        else if (akhir1 >= 80) grade1 = "A";
        else if (akhir1 >= 73) grade1 = "B+";
        else if (akhir1 >= 65) grade1 = "B";
        else if (akhir1 >= 60) grade1 = "C+";
        else if (akhir1 >= 50) grade1 = "C";
        else if (akhir1 >= 39) grade1 = "D";
        else grade1 = "E";

        if (akhir2 >= 85) grade2 = "A";
        else if (akhir2 >= 80) grade2 = "A";
        else if (akhir2 >= 73) grade2 = "B+";
        else if (akhir2 >= 65) grade2 = "B";
        else if (akhir2 >= 60) grade2 = "C+";
        else if (akhir2 >= 50) grade2 = "C";
        else if (akhir2 >= 39) grade2 = "D";
        else grade2 = "E";

        //Menentukan apakah mahasiswa lulus tiap mata kuliah, Jika nilai akhir >= 60 maka LULUS, kalau kurang dari 60 maka TIDAK LULUS
        status1 = (akhir1 >= 60) ? "LULUS":"TIDAK LULUS";
        status2 = (akhir2 >= 60) ? "LULUS":"TIDAK LULUS";

        //Menghitung rata-rata dari dua nilai akhir mata kuliah
        double rataRata = (akhir1 + akhir2) / 2;
        String statusSemester;

        //Ini adalah logika kelulusan semester, jika dua-duanya lulus, baru dicek rata-ratanya
        //Jika rata-rata >= 70 maka lulus semester, kalau tidak maka tidak lulus, jika salah satu mata kuliah tidak lulus, otomatis tidak lulus semester
        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rataRata >= 70)
                statusSemester = "LULUS (Rata-rata >= 70)";
            else
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
        } else {
            statusSemester = "TIDAK LULUS (Ada Mata Kuliah tidak lulus)";
        }

        // Output
        System.out.println("\n================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama : "+nama);
        System.out.println("NIM  : "+nim);
        System.out.println();
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                uts1, uas1, tugas1, akhir1, grade1, status1);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n",
                uts2, uas2, tugas2, akhir2, grade2, status2);
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRata);
        System.out.println("Status Semester      : "+statusSemester);

        input.close();
    }
}