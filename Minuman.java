public abstract class Minuman {
    private String nama;
    private int harga;

    public Minuman(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif!");
            return;
        }
        this.harga = harga;
    }

    public abstract String getJenis();

    public abstract void tampilkanCara();

    public void tampilkanInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("Jenis  : " + getJenis());
        System.out.println("Harga  : Rp " + harga);
    }
}