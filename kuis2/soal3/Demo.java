import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<BBM> list = new ArrayList<>();
        list.add(new Pertalite());
        list.add(new Pertamax());
        list.add(new Solar());

        for (BBM b : list) {
            System.out.println("Jenis: " + b.getNama());
            System.out.println("Harga 1L: Rp" + b.hitungHarga(1));
            b.infoKendaraan();
            System.out.println();
        }

        riwayat(new Pertamax(), 10);

        BBM bbm = new Solar();
        if (bbm instanceof Solar) {
            Solar s = (Solar) bbm;
            s.infoKendaraan();
        }
    }

    public static void riwayat(BBM bbm, double liter) {
        System.out.println("Riwayat: " + bbm.getNama() + " total Rp" + bbm.hitungHarga(liter));
    }
}