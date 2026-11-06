public class MinumanKopi extends Minuman {
    private final boolean pakaiSusu;

    public MinumanKopi(String nama, int harga, boolean pakaiSusu) {
        super(nama, harga);
        this.pakaiSusu = pakaiSusu;
    }

    @Override
    public String getJenis() {
        return "Kopi";
    }

    @Override
    public void tampilkanCara() {
        System.out.print("Cara membuat: seduh kopi dengan air panas");
        if (pakaiSusu) {
            System.out.println(", lalu tambahkan susu.");
        } else {
            System.out.println(".");
        }
    }
}