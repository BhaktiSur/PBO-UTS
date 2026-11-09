/** Child penyajian untuk minuman menggunakan es batu. */
public class MinumanEs extends PenyajianMinuman {
    private final int jumlahEsBatu;

    public MinumanEs(Minuman minuman, int jumlahEsBatu) {
        super(minuman);
        if (jumlahEsBatu <= 0) {
            throw new IllegalArgumentException("Jumlah es batu harus lebih dari 0.");
        }
        this.jumlahEsBatu = jumlahEsBatu;
    }

    public int getJumlahEsBatu() { return jumlahEsBatu; }

    @Override
    public String getJenisPenyajian() { return "Dengan es batu"; }

    @Override
    public void tampilkanCaraPenyajian() {
        System.out.println("Cara saji  : masukkan " + jumlahEsBatu
                + " es batu lalu tuangkan " + getMinuman().getNama() + ".");
    }
}