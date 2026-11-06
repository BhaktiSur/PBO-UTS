import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Minuman> daftarMinuman = new ArrayList<>();
        daftarMinuman.add(new MinumanKopi("Kopi Susu", 18000, true));
        daftarMinuman.add(new MinumanTeh("Teh Tawar Hangat", 3000, 80));
        daftarMinuman.add(new MinumanJus("Jus Jeruk", 12000, "jeruk"));

        for (Minuman m : daftarMinuman) {
            m.tampilkanInfo();
            m.tampilkanCara();
            System.out.println();
        }
    }
}