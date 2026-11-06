import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Minuman> daftarMinuman = new ArrayList<>();
        daftarMinuman.add(new MinumanKopi("Kopi Susu", 18000, true));
        daftarMinuman.add(new MinumanTeh("Teh Tawar Hangat", 3000, 80));
        daftarMinuman.add(new MinumanJus("Jus Jeruk", 12000, "jeruk"));
        daftarMinuman.add(new MinumanTeh("Teh Dingin", 5000, 80));

        ArrayList<BahanMinuman> daftarBahan = new ArrayList<>();
        daftarBahan.add(new BahanKopi("Bubuk kopi", 2));
        daftarBahan.add(new BahanTeh("Teh celup", 1));
        daftarBahan.add(new BahanBuah("Buah jeruk", 3));
        daftarBahan.add(new BahanTeh("Teh celup", 1));

        ArrayList<PenyajianMinuman> daftarPenyajian = new ArrayList<>();
        daftarPenyajian.add(new MinumanPanas(daftarMinuman.get(0), 65));
        daftarPenyajian.add(new MinumanPanas(daftarMinuman.get(1), 60));
        daftarPenyajian.add(new MinumanEs(daftarMinuman.get(2), 5));
        daftarPenyajian.add(new MinumanDingin(daftarMinuman.get(3), 10));

        System.out.println("=== PROGRAM DATA MINUMAN ===");
        for (int i = 0; i < daftarMinuman.size(); i++) {
            System.out.println("\n--- MINUMAN " + (i + 1) + " ---");

            System.out.println("[1] INFORMASI MINUMAN");
            Minuman minuman = daftarMinuman.get(i);
            minuman.tampilkanInfo();
            minuman.tampilkanCara();

            System.out.println("\n[2] INFORMASI BAHAN UTAMA");
            BahanMinuman bahan = daftarBahan.get(i);
            bahan.tampilkanInfo();
            bahan.tampilkanKegunaan();

            System.out.println("\n[3] INFORMASI PENYAJIAN");
            PenyajianMinuman penyajian = daftarPenyajian.get(i);
            penyajian.tampilkanInfoPenyajian();
            penyajian.tampilkanCaraPenyajian();
        }

    }
}