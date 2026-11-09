/** Bahan utama jus buah. */
public class BahanBuah extends BahanMinuman {
    public BahanBuah(String namaBahan, int jumlah) { super(namaBahan, jumlah); }

    @Override
    public String getKategori() { return "Bahan Buah"; }

    @Override
    public void tampilkanKegunaan() {
        System.out.println("Kegunaan   : digunakan sebagai bahan utama jus.");
    }
}