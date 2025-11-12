public class Pertalite extends BBM {
    public Pertalite() { super("Pertalite"); }

    double hitungHarga(double liter) { return liter * 10000; }

    @Override
    public void infoKendaraan() {
        System.out.println("Pertalite cocok untuk motor harian.");
    }
}