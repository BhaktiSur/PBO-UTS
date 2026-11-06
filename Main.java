
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Minuman> daftarMinuman = new ArrayList<>();

        // Data minuman awal
        daftarMinuman.add(new MinumanKopi("Kopi Susu", 18000, true));
        daftarMinuman.add(new MinumanTeh("Teh Tawar Hangat", 3000, 80));
        daftarMinuman.add(new MinumanJus("Jus Jeruk", 12000, "jeruk"));

        int pilihan;

        do {
            System.out.println("\n================================");
            System.out.println("    SISTEM PEMESANAN MINUMAN");
            System.out.println("================================");
            System.out.println("1. Lihat Daftar Minuman");
            System.out.println("2. Tambah Minuman");
            System.out.println("3. Keluar");
            System.out.println("================================");
            System.out.print("Masukkan pilihan: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.println("\n===== DAFTAR MINUMAN =====");

                    for (Minuman m : daftarMinuman) {
                        m.tampilkanInfo();
                        m.tampilkanCara();
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("\n===== TAMBAH MINUMAN =====");
                    System.out.println("1. Minuman Kopi");
                    System.out.println("2. Minuman Teh");
                    System.out.println("3. Minuman Jus");
                    System.out.print("Pilih jenis minuman: ");

                    int jenis = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukkan nama minuman: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan harga minuman: ");
                     int harga = input.nextInt();
                    input.nextLine();

                    if (jenis == 1) {
                        System.out.print("Apakah menggunakan susu? (true/false): ");
                        boolean susu = input.nextBoolean();
                        input.nextLine();

                        daftarMinuman.add(
                            new MinumanKopi(nama, harga, susu)
                        );

                    } else if (jenis == 2) {
                        System.out.print("Masukkan suhu teh: ");
                        int suhu = input.nextInt();
                        input.nextLine();

                        daftarMinuman.add(
                            new MinumanTeh(nama, harga, suhu)
                        );

                    } else if (jenis == 3) {
                        System.out.print("Masukkan jenis buah: ");
                        String buah = input.nextLine();

                        daftarMinuman.add(
                            new MinumanJus(nama, harga, buah)
                        );

                    } else {
                        System.out.println("Jenis minuman tidak tersedia!");
                        break;
                    }

                    System.out.println("Minuman berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan program!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 3);

        input.close();
    }
}
