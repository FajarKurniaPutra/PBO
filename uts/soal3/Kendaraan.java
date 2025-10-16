public class Kendaraan {
    private String noPlat;
    private String merk;
    private int tahun;

    public Kendaraan(String noPlat, String merk, int tahun) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getNoPlat() { return noPlat; }
    public String getMerk() { return merk; }
    public int getTahun() { return tahun; }

    public int hitungBiayaServis() {
        return 0;
    }

    public int hitungBiayaServis(boolean cuci) {
        if (cuci) return hitungBiayaServis() + 50000;
        else return hitungBiayaServis();
    }

    public void tampilData() {
        System.out.println("No Plat: " + noPlat);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}
