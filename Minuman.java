import java.util.Locale;

/** Parent untuk semua jenis minuman. */
public abstract class Minuman {
    private String nama;
    private int harga;

    protected Minuman(String nama, int harga) {
        setNama(nama);
        setHarga(harga);
    }

    public String getNama() { return nama; }
    public int getHarga() { return harga; }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama minuman tidak boleh kosong.");
        }
        this.nama = nama.trim();
    }

    public void setHarga(int harga) {
        if (harga <= 0) {
            throw new IllegalArgumentException("Harga harus lebih dari nol.");
        }
        this.harga = harga;
    }

    public abstract String getJenis();
    public abstract void tampilkanCara();

    public void tampilkanInfo() {
        System.out.println("Nama       : " + nama);
        System.out.println("Jenis      : " + getJenis());
        System.out.printf(Locale.forLanguageTag("id-ID"), "Harga      : Rp%,d%n", harga);
    }
}