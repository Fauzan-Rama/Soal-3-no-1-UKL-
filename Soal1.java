package Soal3;

import java.util.Scanner;

public class Soal1  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== REKAP NILAI SISWA ===");
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahsiswa = input.nextInt();

        double totalnilai = 0;

        
        for (int r = 1; r <= jumlahsiswa; r++) {
            System.out.print("Masukkan nilai siswa ke-" + r + ": ");
            double nilai = input.nextDouble();
            totalnilai += nilai;
        }

        
        double ratarata = totalnilai / jumlahsiswa;

        System.out.println("\n=== HASIL REKAP NILAI ===");
        System.out.println("Jumlah siswa : " + jumlahsiswa);
        System.out.println("Total nilai  : " + totalnilai);
        System.out.println("Rata-rata    : " + ratarata);

        input.close();
    }
}
