import java.util.Scanner;

public class jobsheet4 {
    public static void main(String[] args) {
        // int r;
        // double keliling, luas;

        // Scanner input = new Scanner(System.in);

        // System.out.println("Masukkan jari jari lingkaran: ");
        // r = input.nextInt();

        // keliling = 2 * 3.14 * r;
        // luas = 3.14 * r * r;

        // System.out.println("keliling lingkaran = " + keliling);
        // System.out.println("keliling lingkaran = " + luas);

        // int masuk, tidakMasuk, total;
        // int gaji = 40000, potGaji = 25000;

        // Scanner input = new Scanner(System.in);

        // System.out.println("Masukkan jumlah hari masuk kerja anda ");
        // masuk = input.nextInt();

        // System.out.println("Masukkan jumlah hari tidak masuk kerja ");
        // tidakMasuk = input.nextInt();
        
        // total = (masuk * gaji) - (tidakMasuk * potGaji);

        // System.out.println("Gaji yang anda terima adalah " + total);

        int harga, jumlah;
        double dis = 0.1, total, bayar, jumlahDis;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Harga Barang yang Dibeli = ");
        harga = input.nextInt();

        System.out.println("Masukkan Jumlah Barang yang Dibeli");
        jumlah = input.nextInt();

        total = harga * jumlah;
        jumlahDis = total * dis;
        bayar = total - jumlahDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jumlahDis);
        System.out.println("Jumlah yang harus dibayarkan adalah " + bayar);
    }
}
