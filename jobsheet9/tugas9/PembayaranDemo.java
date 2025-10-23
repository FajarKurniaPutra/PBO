import java.util.Date;

public class PembayaranDemo {
    public static void main(String[] args) {
        Date now = new Date();

        Pembayaran t1 = new Tunai("T001", now, 50000, 100000);
        Pembayaran t2 = new KartuKredit("T002", now, 150000, "1234-5678-9012");
        Pembayaran t3 = new EWallet("T003", now, 75000, "OVO123");

        t1.cetakStruk();
        t1.prosesPembayaran();

        t2.cetakStruk();
        t2.prosesPembayaran();

        t3.cetakStruk();
        t3.prosesPembayaran();
    }
}