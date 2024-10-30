import java.util.Scanner;

/**
 * Program BMICalculator adalah aplikasi untuk menghitung Body Mass Index (BMI),
 * menentukan kategori BMI pengguna, dan memberikan saran berdasarkan hasil BMI.
 * Program ini juga menghitung berat badan ideal berdasarkan tinggi badan.
 *
 * @version 1.0
 */
public class BMICalculator {

    /**
     * Batas bawah BMI untuk kategori berat badan kurang.
     */
    private static final double AMBANG_BERAT_KURANG = 18.5;

    /**
     * Batas atas BMI untuk kategori berat badan normal.
     */
    private static final double AMBANG_BERAT_NORMAL = 24.9;

    /**
     * Batas atas BMI untuk kategori kelebihan berat badan.
     */
    private static final double AMBANG_BERAT_LEBIH = 29.9;

    /**
     * Nilai BMI ideal yang digunakan untuk menghitung berat badan ideal.
     */
    private static final double BMI_IDEAL = 22.0;

    /**
     * Menghitung Body Mass Index (BMI) berdasarkan berat dan tinggi badan.
     *
     * @param berat Berat badan pengguna dalam kilogram
     * @param tinggi Tinggi badan pengguna dalam meter
     * @return nilai BMI yang dihitung
     */
    public static double hitungBMI(double berat, double tinggi) {
        return berat / (tinggi * tinggi);
    }

    /**
     * Menentukan kategori BMI berdasarkan nilai BMI yang diberikan.
     *
     * @param bmi Nilai BMI yang sudah dihitung
     * @return String kategori BMI (Kekurangan, Normal, Kelebihan, atau Obesitas)
     */
    public static String getKategoriBMI(double bmi) {
        return (bmi < AMBANG_BERAT_KURANG) ? "Kekurangan Berat Badan" :
                (bmi < AMBANG_BERAT_NORMAL) ? "Normal (Sehat)" :
                        (bmi < AMBANG_BERAT_LEBIH) ? "Kelebihan Berat Badan" : "Obesitas";
    }

    /**
     * Menghitung berat badan ideal berdasarkan tinggi badan pengguna.
     *
     * @param tinggi Tinggi badan pengguna dalam meter
     * @return Berat badan ideal dalam kilogram
     */
    public static double hitungBeratIdeal(double tinggi) {
        return BMI_IDEAL * (tinggi * tinggi);
    }

    /**
     * Memberikan saran berdasarkan kategori BMI pengguna.
     *
     * @param bmi Nilai BMI pengguna
     * @return String berisi saran untuk mencapai berat badan ideal
     */
    private static String getSaranBMI(double bmi) {
        if (bmi < AMBANG_BERAT_KURANG) {
            return "Saran: Anda perlu meningkatkan asupan kalori dan memperhatikan pola makan yang sehat.";
        } else if (bmi >= 25) {
            return "Saran: Anda mungkin perlu mempertimbangkan untuk menurunkan berat badan dengan diet seimbang dan olahraga.";
        } else {
            return "Saran: Berat badan Anda ideal! Jaga pola makan dan gaya hidup sehat.";
        }
    }

    /**
     * Mencetak hasil perhitungan BMI, kategori, berat ideal, dan saran kepada pengguna.
     *
     * @param bmi Nilai BMI yang dihitung
     * @param kategori Kategori BMI
     * @param beratIdeal Berat badan ideal dalam kilogram
     */
    private static void cetakHasil(double bmi, String kategori, double beratIdeal) {
        System.out.printf("\nHasil BMI Anda:\nBMI: %.2f\nKategori: %s\nBerat badan ideal Anda: %.2f kg\n",
                bmi, kategori, beratIdeal);
        System.out.println(getSaranBMI(bmi));
    }

    /**
     * Metode utama untuk menjalankan program BMI Calculator.
     * Menerima input dari pengguna untuk berat dan tinggi badan,
     * kemudian menghitung dan mencetak hasil BMI, kategori, berat ideal, dan saran.
     *
     * @param args Argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Selamat datang di Program Kalkulator BMI!");

            System.out.print("Masukkan berat badan Anda (kg): ");
            double berat = scanner.nextDouble();

            System.out.print("Masukkan tinggi badan Anda (meter): ");
            double tinggi = scanner.nextDouble();

            double bmi = hitungBMI(berat, tinggi);
            String kategori = getKategoriBMI(bmi);
            double beratIdeal = hitungBeratIdeal(tinggi);

            cetakHasil(bmi, kategori, beratIdeal);
        }
    }
}