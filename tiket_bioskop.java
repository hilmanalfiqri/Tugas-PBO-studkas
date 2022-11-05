import java.util.Scanner;
public class tiket_bioskop {
    String Menu = "";
    int Pilihan, JumlahTiket, Harga;
    int Total = 0;
    Scanner scan = new Scanner(System.in);

    void Menu() {
        System.out.println("          Pemesanan Tiket Bioskop            ");
        System.out.println("");
        System.out.println(" Jenis Tiket             Harga Tiket        ");
        System.out.println("========================================");
        System.out.println(" 1. Reguler      ");
        System.out.println("    Reg          =      Rp 35.000   ");
        System.out.println(" 2. Premium HD    ");
        System.out.println("    Premium           =      Rp 50.000   ");
        System.out.println(" 3. Premiere HD  ");
        System.out.println("    Premiere         =      RP 75.000   ");
        System.out.println("========================================");

        System.out.println("Melakukan Pemesanan Tiket Bioskop");
        System.out.println("Masukkan Nomor Pesanan");
        Pilihan = scan.nextInt();
        System.out.println("Masukkan Jumlah Pesanan");
        JumlahTiket = scan.nextInt();
        Harga = 35000 * JumlahTiket;
        System.out.println("Harga Pesanan= Rp. " + Harga);
        System.out.println("Total Pembayaran Rp. " + Harga + " Untuk " + JumlahTiket + " Pilihan ");
        Total = Total + Harga;


    }

    void tiket_bioskopRegular() {
        System.out.println("tiket_bioskop reguler = Rp. 35.000");
        System.out.println(" Masukkan Jumlah Pesanan Tiket Anda : ");
        JumlahTiket = scan.nextInt();
        Harga = 35000 * JumlahTiket;
        System.out.println("Harga Pesanan= Rp. " + Harga);
        System.out.println("Total Pembayaran Rp. " + Harga + " Untuk " + JumlahTiket + " Pilihan ");
        Total = Total + Harga;


    }

    void tiket_bioskopPremiumHD() {
        System.out.println("tiket_bioskop Premium HD = Rp. 50.000");
        System.out.println(" Masukkan Jumlah Pesanan Tiket Anda : ");
        JumlahTiket = scan.nextInt();
        Harga = 50000 * JumlahTiket;
        System.out.println("Harga Pesanan= Rp. " + Harga);
        System.out.println("Total Pembayaran Rp. " + Harga + " Untuk " + JumlahTiket + " Pilihan ");
        Total = Total + Harga;
    }


    void tiket_bioskopPremiereHD() {
        System.out.println("tiket_bioskop Premiere HD = Rp. 75.000");
        System.out.println(" Masukkan Jumlah Pesanan Tiket Anda : ");
        JumlahTiket = scan.nextInt();
        Harga = 75000 * JumlahTiket;
        System.out.println("Harga Pesanan= Rp. " + Harga);
        System.out.println("Total Pembayaran Rp. " + Harga + " Untuk " + JumlahTiket + " Pilihan ");
        Total = Total + Harga;


    }
}
