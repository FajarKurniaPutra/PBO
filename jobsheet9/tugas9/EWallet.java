import java.util.Date;

class EWallet extends Pembayaran {
    private String idDompet;

    public EWallet(String idTransaksi, Date tanggal, double jumlah, String idDompet) {
        super(idTransaksi, tanggal, jumlah);
        this.idDompet = idDompet;
    }

    public String getIdDompet() { return idDompet; }

    public boolean konfirmasiSaldo() {
        return true; 
    }

    @Override
    public void prosesPembayaran() {
        if (konfirmasiSaldo()) {
            System.out.println("Pembayaran melalui e-wallet " + idDompet + " berhasil.");
        } else {
            System.out.println("Saldo tidak cukup di e-wallet " + idDompet);
        }
    }
}