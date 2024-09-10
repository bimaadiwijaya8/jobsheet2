public class Jobsheet2 {
    public static void main(String[] args) {
    //     String nama = "Bima Adiwijaya";
    //     int umur = 19;
    //     boolean apakah = true;

    //     //System.out.println("Perkenalkan nama saya " + nama + ", umur saya " + umur + ", apakah saya mahasiswa? " + apakah);
    //     System.out.println(String.format("nama saya %s dan saya berusia %s, dan apakah saya siswa %s", nama, umur, apakah));
    //

    // char golonganDarah = 'A';
    // byte jarak = (byte) 130;
    // short jumlahPendudukDalamSatuDusun = 1025;
    // float suhu = 60.50F;
    // double berat = 0.5467812345;
    // long saldo = 1500000;
    // int angkaDesimal = 0x10;

    // System.out.println("Golongan darah\t\t\t\t\t\t\t: " + (byte) golonganDarah);
    // System.out.println("jarak\t\t\t\t\t\t\t\t: " + jarak);
    // System.out.println("Jumlah penduduk dalam satu dusun\t\t\t\t: " + jumlahPendudukDalamSatuDusun);
    // System.out.println("Suhu\t\t\t\t\t\t\t\t: " + suhu);
    // System.out.println("Berat\t\t\t\t\t\t\t\t: " + (float) berat);
    // System.out.println("Saldo\t\t\t\t\t\t\t\t: " + saldo);
    // System.out.println("Angka Desimal \t\t\t\t\t\t\t: " + angkaDesimal);
    
        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("setelah evaluasi, x = " + x);
        x = 10;
        System.out.println("++x" + ++x);
        System.out.println("setelah evaluasi, x = " + x);
        int y = 12;
        System.out.println(x > y || y == x && y <= x);
        int z = x ^ y;
        System.out.println("hasil x ^ y adalah " + z);
        z %= 2;
        System.out.println("Hasil akhir " + z);

    }
    
}