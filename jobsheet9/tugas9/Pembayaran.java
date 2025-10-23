import java.util.Date;

abstract class Pembayaran {
    private String idTransaksi;
    private Date tanggal;
    private double jumlah;

    public Pembayaran(String idTransaksi, Date tanggal, double jumlah) {
        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
    }

    public String getIdTransaksi() { return idTransaksi; }
    public Date getTanggal() { return tanggal; }
    public double getJumlah() { return jumlah; }
    public void setJumlah(double jumlah) { this.jumlah = jumlah; }

    public abstract void prosesPembayaran();

    public void cetakStruk() {
        System.out.println();
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Jumlah: " + jumlah);
    }
}