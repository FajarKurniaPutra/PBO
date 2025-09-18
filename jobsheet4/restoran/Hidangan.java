public class Hidangan {
    private String idHidangan;
    private String nama;
    private double harga;
    private int stok;

    public Hidangan(String idHidangan, String nama, double harga, int stok) {
        this.idHidangan = idHidangan;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getIdHidangan() {
        return idHidangan;
    }

    public void setIdHidangan(String idHidangan) {
        this.idHidangan = idHidangan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int kurangiStok() {
        if (stok > 0) {
            stok--;
        }
        return stok;
    }

    public int tambahStok() {
        stok++;
        return stok;
    }

    public void infoHidangan() {
        System.out.println("ID: " + idHidangan + ", Nama: " + nama + ", Harga: " + harga + ", Stok: " + stok);
    }
}