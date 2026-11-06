/**
 * Parent class untuk mengatur cara penyajian suatu Minuman.
 * Setiap penyajian memiliki satu objek Minuman yang sudah dibuat anggota 1.
 */
public abstract class PenyajianMinuman {
    private final Minuman minuman;

    public PenyajianMinuman(Minuman minuman) {
        if (minuman == null) {
            throw new IllegalArgumentException("Minuman tidak boleh null.");
        }
        this.minuman = minuman;
    }

    public Minuman getMinuman() {
        return minuman;
    }

    public abstract String getJenisPenyajian();

    public abstract void tampilkanCaraPenyajian();

    public void tampilkanInfoPenyajian() {
        System.out.println("Penyajian : " + getJenisPenyajian());
    }
}
