import java.util.Scanner;
public class Tugas320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarang = -1;
            int tokoTerbaik = 0;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("\n--- Toko " + i + "---");
                System.out.print("Masukkan jumlah pelanggan: ");
                int jumlahPelanggan = sc.nextInt();

                while (jumlahPelanggan < 0) {
                    System.out.print("Jumlah pelanggan tidak boleh negatif. Ulangi: ");
                    jumlahPelanggan = sc.nextInt();
                }

                int  totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("  Jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                    int jumlahBarang = sc.nextInt();

                    while (jumlahBarang < 0) {
                        System.out.print("  Jumlah barang tidak boleh negatif. Ulangi: ");
                        jumlahBarang = sc.nextInt();
                    }

                    totalBarangToko += jumlahBarang;
                }

                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                totalBarangSeluruhToko += totalBarangToko;

                if (totalBarangToko > maxBarang) {
                    maxBarang = totalBarangToko;
                    tokoTerbaik = i;
                }
            }

            System.out.println("\n========================================");
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        }
        sc.close();
    }
}
