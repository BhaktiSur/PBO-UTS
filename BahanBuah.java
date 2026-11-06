
public class BahanBuah extends BahanMinuman {

    public BahanBuah(String namaBahan, int jumlah) {
        super(namaBahan, jumlah);
    }

    @Override
    public String getKategori() {
        return "Bahan Buah";
    }

    @Override
    public void tampilkanKegunaan() {
        System.out.println("Kegunaan: Digunakan sebagai bahan dasar jus.");
    }
}
