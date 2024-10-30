# BMICalculator

BMICalculator adalah program sederhana berbasis Java yang menghitung Body Mass Index (BMI) pengguna, menentukan kategori BMI berdasarkan hasil perhitungan, dan memberikan saran yang relevan. Program ini juga dapat menghitung berat badan ideal pengguna berdasarkan tinggi badan.

## Fitur

- **Menghitung BMI**: Menghitung nilai BMI berdasarkan input berat dan tinggi badan pengguna.
- **Menentukan Kategori BMI**: Menampilkan kategori BMI (Kekurangan Berat Badan, Normal, Kelebihan Berat Badan, Obesitas).
- **Saran untuk Pengguna**: Memberikan saran berdasarkan kategori BMI.
- **Menghitung Berat Ideal**: Menghitung berat ideal yang disarankan berdasarkan tinggi badan.

## Struktur Proyek

- **BMICalculator.java**: Kelas utama yang berisi metode untuk menghitung BMI, menentukan kategori, memberikan saran, dan menghitung berat ideal.

## Cara Penggunaan

1. Clone atau unduh proyek ini ke komputer Anda.
2. Buka terminal atau command prompt, lalu navigasikan ke folder proyek.
3. Jalankan perintah berikut untuk mengeksekusi program:
   ```bash
   javac Patch/BMICalculator.java
   java ..BMICalculator
   ```
4. Ikuti instruksi di terminal:
   - Masukkan berat badan dalam satuan kilogram.
   - Masukkan tinggi badan dalam satuan meter.
5. Program akan menampilkan hasil BMI, kategori, berat ideal, dan saran berdasarkan hasil BMI.

## Contoh Penggunaan

```plaintext
Selamat datang di Program Kalkulator BMI!
Masukkan berat badan Anda (kg): 70
Masukkan tinggi badan Anda (meter): 1.75

Hasil BMI Anda:
BMI: 22.86
Kategori: Normal (Sehat)
Berat badan ideal Anda: 67.38 kg
Saran: Berat badan Anda ideal! Jaga pola makan dan gaya hidup sehat.
```

## Penjelasan Metode

- **hitungBMI**: Menghitung BMI berdasarkan berat dan tinggi badan.
- **getKategoriBMI**: Menentukan kategori BMI berdasarkan ambang batas yang telah ditetapkan.
- **hitungBeratIdeal**: Menghitung berat badan ideal menggunakan nilai BMI yang ideal (22.0).
- **getSaranBMI**: Memberikan saran terkait berat badan berdasarkan hasil BMI pengguna.
- **cetakHasil**: Menampilkan hasil BMI, kategori, berat ideal, dan saran.

## Prasyarat

- **Java JDK**: Program ini membutuhkan Java Development Kit (JDK) versi 8 atau yang lebih baru untuk dapat dijalankan.
