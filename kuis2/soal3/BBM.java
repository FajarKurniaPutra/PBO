abstract class BBM {
    protected String nama;

    public BBM(String nama) {
        this.nama = nama;
    }

    abstract double hitungHarga(double liter);

    public void infoKendaraan() {
        System.out.println(nama + " digunakan untuk berbagai jenis kendaraan.");
    }

    public String getNama() {
        return nama;
    }
}