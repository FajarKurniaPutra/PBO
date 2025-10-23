import java.util.Date;

class KartuKredit extends Pembayaran {
    private String nomorKartu;

    public KartuKredit(String idTransaksi, Date tanggal, double jumlah, String nomorKartu) {
        super(idTransaksi, tanggal, jumlah);
        this.nomorKartu = nomorKartu;
    }

    public String getNomorKartu() { return nomorKartu; }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran menggunakan kartu kredit dengan nomor: " + nomorKartu);
    }
}