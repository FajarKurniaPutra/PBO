public class Motor extends Kendaraan {
    public Motor(String noPlat, String merk, int tahun) {
        super(noPlat, merk, tahun);
    }

    @Override
    public int hitungBiayaServis() {
        return 250000;
    }

    @Override
    public int hitungBiayaServis(boolean cuci) {
        if (cuci) return hitungBiayaServis() + 50000;
        else return hitungBiayaServis();
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis: Motor");
        System.out.println("Biaya Servis: Rp" + hitungBiayaServis());
        System.out.println("Biaya Servis + Cuci: Rp" + hitungBiayaServis(true));
        System.out.println();
    }
}