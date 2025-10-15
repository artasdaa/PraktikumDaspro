import java.util.Scanner;

public class KalkulatorBMI_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input data
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble(); //Membaca input berat badan dalam satuan kilogram
        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggi = input.nextDouble(); //Membaca input tinggi badan dalam satuan meter

        double bmi = berat / (tinggi * tinggi); //Proses perhitungan BMI dengan rumus berat badan(kg) / tinggi badan (m) * tinggi badan (m)

        String kategori, risiko; //Deklarasi variabel untuk menyimpan hasil kategori dan risiko kesehatan
        //Menentukan Kategori BMI Berdasarkan Nilai
        if (bmi < 18.5) {
            kategori = "Kurang berat badan (Underweight)";
            risiko = "Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.";
        } else if (bmi < 25) {
            kategori = "Berat badan normal (Normal weight)";
            risiko = "Relatif rendah.";
        } else if (bmi < 30) {
            kategori = "Kelebihan berat badan (Overweight)";
            risiko = "Meningkatnya risiko penyakit jantung, diabetes, tekanan darah tinggi.";
        } else {
            kategori = "Obesitas (Obese)";
            risiko = "Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker.";
        }

        //output hasil
        System.out.printf("Nilai BMI: %.2f\n", bmi);
        System.out.println("Kategori BMI: " + kategori);
        System.out.println("Risiko kesehatan: " + risiko);
    }
}
