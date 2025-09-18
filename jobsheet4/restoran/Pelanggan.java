import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String nomorTelepon;
    private String alamat;
    private ArrayList<Hidangan> pesanan;

    public Pelanggan(String idPelanggan, String nama, String nomorTelepon, String alamat) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.alamat = alamat;
        this.pesanan = new ArrayList<Hidangan>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void pesanHidangan(Hidangan h) {
        if (h.getStok() > 0) {
            pesanan.add(h);
            h.kurangiStok();
        } else {
            System.out.println("Stok habis untuk hidangan: " + h.getNama());
        }
    }

    public void lihatPesanan() {
        System.out.println("\nPesanan " + nama + ":");
        for (Hidangan h : pesanan) {
            h.infoHidangan();
        }
    }

    public double bayarPesanan() {
        double total = 0;
        for (Hidangan h : pesanan) {
            total += h.getHarga();
        }
        return total;
    }
}
