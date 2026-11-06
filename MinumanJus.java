public class MinumanJus extends Minuman {
    private final String bahanUtama;

    public MinumanJus(String nama, int harga, String bahanUtama) {
        super(nama, harga);
        this.bahanUtama = bahanUtama;
    }

    @Override
    public String getJenis() {
        return "Jus";
    }

    @Override
    public void tampilkanCara() {
        System.out.println("Cara membuat: blender " + bahanUtama + " bersama es batu, lalu sajikan.");
    }
}