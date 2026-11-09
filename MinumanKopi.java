/** Child Minuman untuk jenis kopi. */
public class MinumanKopi extends Minuman {
    private final boolean pakaiSusu;

    public MinumanKopi(String nama, int harga, boolean pakaiSusu) {
        super(nama, harga);
        this.pakaiSusu = pakaiSusu;
    }

    public boolean isPakaiSusu() { return pakaiSusu; }

    @Override
    public String getJenis() { return "Kopi"; }

    @Override
    public void tampilkanCara() {
        System.out.println("Cara membuat: seduh kopi dengan air panas"
                + (pakaiSusu ? ", lalu tambahkan susu." : "."));
    }
}