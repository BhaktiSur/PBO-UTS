/** Child penyajian untuk minuman panas. */
public class MinumanPanas extends PenyajianMinuman {
    private final int suhuSaji;

    public MinumanPanas(Minuman minuman, int suhuSaji) {
        super(minuman);
        if (suhuSaji < 40 || suhuSaji > 100) {
            throw new IllegalArgumentException("Suhu minuman panas harus 40-100 C.");
        }
        this.suhuSaji = suhuSaji;
    }

    public int getSuhuSaji() { return suhuSaji; }

    @Override
    public String getJenisPenyajian() { return "Panas"; }

    @Override
    public void tampilkanCaraPenyajian() {
        System.out.println("Cara saji  : tuangkan " + getMinuman().getNama()
                + " ke cangkir tahan panas pada suhu " + suhuSaji + " C.");
    }
}