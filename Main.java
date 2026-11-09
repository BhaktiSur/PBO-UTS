import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/** Pengendali menu dan penyimpanan sementara Aplikasi Informasi Minuman. */
public class Main {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final ArrayList<Minuman> daftarMinuman = new ArrayList<>();
    private static final ArrayList<BahanMinuman> daftarBahan = new ArrayList<>();
    private static final ArrayList<PenyajianMinuman> daftarPenyajian = new ArrayList<>();

    public static void main(String[] args) {
        muatDataAwal();
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = bacaInt("Pilih menu: ");
            switch (pilihan) {
                case 1:
                    tampilkanSemua();
                    break;
                case 2:
                    tambahMinuman();
                    break;
                case 3:
                    cariMinuman();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program ditutup.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia. Pilih 0, 1, 2, atau 3.");
            }
        } while (pilihan != 0);
        INPUT.close();
    }

    private static void muatDataAwal() {
        Minuman kopi = new MinumanKopi("Kopi Susu", 18000, true);
        simpanData(kopi, new BahanKopi("Bubuk kopi", 2), new MinumanPanas(kopi, 65));

        Minuman tehHangat = new MinumanTeh("Teh Tawar Hangat", 3000, 80);
        simpanData(tehHangat, new BahanTeh("Teh celup", 1), new MinumanPanas(tehHangat, 60));

        Minuman jus = new MinumanJus("Jus Jeruk", 12000, "jeruk");
        simpanData(jus, new BahanBuah("Jeruk", 3), new MinumanEs(jus, 5));

        Minuman tehDingin = new MinumanTeh("Teh Dingin", 5000, 80);
        simpanData(tehDingin, new BahanTeh("Teh celup", 1), new MinumanDingin(tehDingin, 10));
    }

    private static void simpanData(Minuman minuman, BahanMinuman bahan,
            PenyajianMinuman penyajian) {
        if (minuman == null || bahan == null || penyajian == null
                || penyajian.getMinuman() != minuman) {
            throw new IllegalArgumentException("Data minuman, bahan, dan penyajian tidak sesuai.");
        }
        daftarMinuman.add(minuman);
        daftarBahan.add(bahan);
        daftarPenyajian.add(penyajian);
    }

    private static void tampilkanMenu() {
        System.out.println("\n========================================");
        System.out.println("       APLIKASI INFORMASI MINUMAN");
        System.out.println("========================================");
        System.out.println("1. Lihat semua minuman");
        System.out.println("2. Tambah minuman");
        System.out.println("3. Cari minuman berdasarkan nama");
        System.out.println("0. Keluar");
        System.out.println("========================================");
    }

    private static void tampilkanSemua() {
        System.out.println("\n===== DAFTAR MINUMAN (" + daftarMinuman.size() + ") =====");
        if (daftarMinuman.isEmpty()) {
            System.out.println("Belum ada data minuman.");
            return;
        }
        for (int i = 0; i < daftarMinuman.size(); i++) {
            tampilkanDetail(i);
        }
    }

    private static void tampilkanDetail(int i) {
        System.out.println("\n--- MINUMAN " + (i + 1) + " ---");
        Minuman minuman = daftarMinuman.get(i);
        BahanMinuman bahan = daftarBahan.get(i);
        PenyajianMinuman penyajian = daftarPenyajian.get(i);
        minuman.tampilkanInfo();
        minuman.tampilkanCara();
        bahan.tampilkanInfo();
        bahan.tampilkanKegunaan();
        penyajian.tampilkanInfoPenyajian();
        penyajian.tampilkanCaraPenyajian();
    }

    private static void tambahMinuman() {
        System.out.println("\n===== TAMBAH MINUMAN =====");
        System.out.println("1. Kopi   2. Teh   3. Jus");
        int jenis = bacaIntRentang("Pilih jenis (1-3): ", 1, 3);
        String nama = bacaTeks("Nama minuman: ");
        int harga = bacaIntRentang("Harga (Rp, lebih dari 0): ", 1, 100000000);

        Minuman minuman;
        BahanMinuman bahan;
        String namaBahan;
        if (jenis == 1) {
            boolean susu = bacaYaTidak("Menggunakan susu (y/n): ");
            minuman = new MinumanKopi(nama, harga, susu);
            namaBahan = "Bubuk kopi";
        } else if (jenis == 2) {
            int suhu = bacaIntRentang("Suhu air seduh teh (40-100 C): ", 40, 100);
            minuman = new MinumanTeh(nama, harga, suhu);
            namaBahan = "Teh celup";
        } else {
            namaBahan = bacaTeks("Jenis buah: ");
            minuman = new MinumanJus(nama, harga, namaBahan);
        }
        int jumlah = bacaIntRentang("Jumlah bahan utama (takaran, 1-100): ", 1, 100);
        if (jenis == 1) {
            bahan = new BahanKopi(namaBahan, jumlah);
        } else if (jenis == 2) {
            bahan = new BahanTeh(namaBahan, jumlah);
        } else {
            bahan = new BahanBuah(namaBahan, jumlah);
        }

        System.out.println("Penyajian: 1. Panas  2. Dingin tanpa es  3. Dengan es batu");
        int jenisSaji = bacaIntRentang("Pilih penyajian (1-3): ", 1, 3);
        PenyajianMinuman penyajian;
        if (jenisSaji == 1) {
            int suhu = bacaIntRentang("Suhu saji panas (40-100 C): ", 40, 100);
            penyajian = new MinumanPanas(minuman, suhu);
        } else if (jenisSaji == 2) {
            int suhu = bacaIntRentang("Suhu saji dingin (0-25 C): ", 0, 25);
            penyajian = new MinumanDingin(minuman, suhu);
        } else {
            int es = bacaIntRentang("Jumlah es batu (1-50): ", 1, 50);
            penyajian = new MinumanEs(minuman, es);
        }
        simpanData(minuman, bahan, penyajian);
        System.out.println("Minuman berhasil ditambahkan: " + minuman.getNama() + ".");
    }

    private static void cariMinuman() {
        System.out.println("\n===== CARI MINUMAN =====");
        String kataKunci = bacaTeks("Kata kunci nama: ").toLowerCase(Locale.ROOT);
        int jumlahHasil = 0;
        for (int i = 0; i < daftarMinuman.size(); i++) {
            if (daftarMinuman.get(i).getNama().toLowerCase(Locale.ROOT).contains(kataKunci)) {
                tampilkanDetail(i);
                jumlahHasil++;
            }
        }
        if (jumlahHasil == 0) {
            System.out.println("Tidak ada minuman dengan nama tersebut.");
        } else {
            System.out.println("Hasil pencarian: " + jumlahHasil + " minuman.");
        }
    }

    private static String bacaTeks(String pesan) {
        while (true) {
            System.out.print(pesan);
            String teks = INPUT.nextLine().trim();
            if (!teks.isEmpty()) {
                return teks;
            }
            System.out.println("Input tidak boleh kosong. Coba lagi.");
        }
    }

    private static int bacaInt(String pesan) {
        while (true) {
            System.out.print(pesan);
            String teks = INPUT.nextLine().trim();
            try {
                return Integer.parseInt(teks);
            } catch (NumberFormatException e) {
                System.out.println("Masukkan bilangan bulat yang valid.");
            }
        }
    }

    private static int bacaIntRentang(String pesan, int min, int max) {
        while (true) {
            int nilai = bacaInt(pesan);
            if (nilai >= min && nilai <= max) {
                return nilai;
            }
            System.out.println("Nilai harus antara " + min + " dan " + max + ".");
        }
    }

    private static boolean bacaYaTidak(String pesan) {
        while (true) {
            String jawaban = bacaTeks(pesan).toLowerCase(Locale.ROOT);
            if (jawaban.equals("y") || jawaban.equals("ya")) return true;
            if (jawaban.equals("n") || jawaban.equals("tidak")) return false;
            System.out.println("Masukkan y atau n.");
        }
    }
}
