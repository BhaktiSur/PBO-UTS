/** Child class untuk minuman dingin tanpa tambahan es batu. */
public class MinumanDingin extends PenyajianMinuman {
    private final int suhuSaji;

    public MinumanDingin(Minuman minuman, int suhuSaji) {
        super(minuman);
        if (suhuSaji < 0 || suhuSaji > 25) {
            throw new IllegalArgumentException("Suhu minuman dingin harus 0-25 derajat Celsius.");
        }
        this.suhuSaji = suhuSaji;
    }

    public int getSuhuSaji() {
        return suhuSaji;
    }

    @Override
    public String getJenisPenyajian() {
        return "Dingin (tanpa es batu)";
    }

    @Override
    public void tampilkanCaraPenyajian() {
        System.out.println("Cara menyajikan: dinginkan " + getMinuman().getNama()
                + " hingga " + suhuSaji
                + " derajat Celsius, lalu tuang ke gelas tanpa es batu.");
    }
}
