public abstract class BahanMinuman {
    private String namaBahan;
    private int jumlah;

    public BahanMinuman(String namaBahan, int jumlah) {
        this.namaBahan = namaBahan;
        this.jumlah = jumlah;
    }

    public String getNamaBahan() {
        return namaBahan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public abstract String getKategori();

    public abstract void tampilkanKegunaan();

    public void tampilkanInfo() {
        System.out.println("Nama Bahan : " + namaBahan);
        System.out.println("Jumlah     : " + jumlah);
        System.out.println("Kategori   : " + getKategori());
    }
}