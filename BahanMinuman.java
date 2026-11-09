/** Parent untuk bahan utama pembuatan minuman. */
public abstract class BahanMinuman {
    private final String namaBahan;
    private final int jumlah;

    protected BahanMinuman(String namaBahan, int jumlah) {
        if (namaBahan == null || namaBahan.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama bahan tidak boleh kosong.");
        }
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah bahan harus lebih dari nol.");
        }
        this.namaBahan = namaBahan.trim();
        this.jumlah = jumlah;
    }

    public String getNamaBahan() { return namaBahan; }
    public int getJumlah() { return jumlah; }
    public abstract String getKategori();
    public abstract void tampilkanKegunaan();

    public void tampilkanInfo() {
        System.out.println("Bahan      : " + namaBahan);
        System.out.println("Jumlah     : " + jumlah + " takaran");
        System.out.println("Kategori   : " + getKategori());
    }
}