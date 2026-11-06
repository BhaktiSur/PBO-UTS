
public class BahanKopi extends BahanMinuman {

    public BahanKopi(String namaBahan, int jumlah) {
        super(namaBahan, jumlah);
    }

    @Override
    public String getKategori() {
        return "Bahan Kopi";
    }

    @Override
    public void tampilkanKegunaan() {
        System.out.println("Kegunaan: Digunakan untuk membuat minuman kopi.");
    }
}
