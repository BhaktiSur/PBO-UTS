public class MinumanTeh extends Minuman {
    private final int suhuAir;

    public MinumanTeh(String nama, int harga, int suhuAir) {
        super(nama, harga);
        this.suhuAir = suhuAir;
    }

    @Override
    public String getJenis() {
        return "Teh";
    }

    @Override
    public void tampilkanCara() {
        System.out.println("Cara membuat: celup teh ke air bersuhu " + suhuAir
                + " derajat Celsius, diamkan beberapa menit.");
    }
}