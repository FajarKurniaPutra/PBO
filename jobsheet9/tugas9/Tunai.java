import java.util.Date;

class Tunai extends Pembayaran {
    private double uangDiterima;

    public Tunai(String idTransaksi, Date tanggal, double jumlah, double uangDiterima) {
        super(idTransaksi, tanggal, jumlah);
        this.uangDiterima = uangDiterima;
    }

    public double getUangDiterima() { return uangDiterima; }

    public double hitungKembalian() {
        return uangDiterima - getJumlah();
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran tunai berhasil. Kembalian: " + hitungKembalian());
    }
}