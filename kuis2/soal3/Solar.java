public class Solar extends BBM {
    public Solar() { super("Solar"); }

    double hitungHarga(double liter) { return liter * 8000; }

    @Override
    public void infoKendaraan() {
        System.out.println("Solar digunakan untuk truk dan kendaraan diesel.");
    }
}