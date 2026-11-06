/** Child class untuk minuman yang disajikan panas. */
public class MinumanPanas extends PenyajianMinuman {
    private final int suhuSaji;

    public MinumanPanas(Minuman minuman, int suhuSaji) {
        super(minuman);
        if (suhuSaji < 40 || suhuSaji > 100) {
            throw new IllegalArgumentException("Suhu minuman panas harus 40-100 derajat Celsius.");
        }
        this.suhuSaji = suhuSaji;
    }

    public int getSuhuSaji() {
        return suhuSaji;
    }

    @Override
    public String getJenisPenyajian() {
        return "Panas";
    }

    @Override
    public void tampilkanCaraPenyajian() {
        System.out.println("Cara menyajikan: tuang " + getMinuman().getNama()
                + " ke cangkir tahan panas dan sajikan pada suhu "
                + suhuSaji + " derajat Celsius.");
    }
}
