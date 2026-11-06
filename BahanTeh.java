
public class BahanTeh extends BahanMinuman {

    public BahanTeh(String namaBahan, int jumlah) {
        super(namaBahan, jumlah);
    }

    @Override
    public String getKategori() {
        return "Bahan Teh";
    }

    @Override
    public void tampilkanKegunaan() {
        System.out.println("Kegunaan: Digunakan untuk membuat minuman teh.");
    }
}
