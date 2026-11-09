/** Child Minuman untuk jenis teh. */
public class MinumanTeh extends Minuman {
    private final int suhuAir;

    public MinumanTeh(String nama, int harga, int suhuAir) {
        super(nama, harga);
        if (suhuAir < 40 || suhuAir > 100) {
            throw new IllegalArgumentException("Suhu seduh teh harus 40-100 C.");
        }
        this.suhuAir = suhuAir;
    }

    public int getSuhuAir() { return suhuAir; }

    @Override
    public String getJenis() { return "Teh"; }

    @Override
    public void tampilkanCara() {
        System.out.println("Cara membuat: seduh teh dengan air bersuhu "
                + suhuAir + " C, lalu diamkan beberapa menit.");
    }
}