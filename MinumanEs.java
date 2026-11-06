/** Child class untuk minuman yang disajikan dengan es batu. */
public class MinumanEs extends PenyajianMinuman {
    private final int jumlahEsBatu;

    public MinumanEs(Minuman minuman, int jumlahEsBatu) {
        super(minuman);
        if (jumlahEsBatu <= 0) {
            throw new IllegalArgumentException("Jumlah es batu harus lebih dari 0.");
        }
        this.jumlahEsBatu = jumlahEsBatu;
    }

    public int getJumlahEsBatu() {
        return jumlahEsBatu;
    }

    @Override
    public String getJenisPenyajian() {
        return "Es (dengan es batu)";
    }

    @Override
    public void tampilkanCaraPenyajian() {
        System.out.println("Cara menyajikan: masukkan " + jumlahEsBatu
                + " es batu ke gelas, lalu tuangkan "
                + getMinuman().getNama() + " dan sajikan.");
    }
}
