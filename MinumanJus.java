/** Child Minuman untuk jenis jus buah. */
public class MinumanJus extends Minuman {
    private final String bahanUtama;

    public MinumanJus(String nama, int harga, String bahanUtama) {
        super(nama, harga);
        if (bahanUtama == null || bahanUtama.trim().isEmpty()) {
            throw new IllegalArgumentException("Jenis buah tidak boleh kosong.");
        }
        this.bahanUtama = bahanUtama;
    }

    public String getBahanUtama() { return bahanUtama; }

    @Override
    public String getJenis() { return "Jus"; }

    @Override
    public void tampilkanCara() {
        System.out.println("Cara membuat: blender " + bahanUtama
                + " dengan air secukupnya, kemudian sajikan sesuai pilihan.");
    }
}