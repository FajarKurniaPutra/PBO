import java.util.ArrayList;

public class Restoran {
    private String nib;
    private String nama;
    private String alamat;
    private ArrayList<Hidangan> daftarMenu;
    private double pemasukan;

    public Restoran(String nib, String nama, String alamat) {
        this.nib = nib;
        this.nama = nama;
        this.alamat = alamat;
        this.daftarMenu = new ArrayList<Hidangan>();
        this.pemasukan = 0;
    }

    public String getNib() {
        return nib;
    }

    public void setNib(String nib) {
        this.nib = nib;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(double pemasukan) {
        this.pemasukan = pemasukan;
    }

    public void tambahMenu(Hidangan h) {
        daftarMenu.add(h);
    }

    public void lihatMenu() {
        System.out.println("Menu Restoran " + nama + ":");
        for (Hidangan h : daftarMenu) {
            h.infoHidangan();
        }
    }

    public void prosesPesanan(Pelanggan p) {
        double total = p.bayarPesanan();
        pemasukan += total;
        System.out.println("\nPesanan dari " + p.getNama() + " berhasil diproses. Total: " + total);
    }

    public double hitungPemasukan() {
        return pemasukan;
    }
}
