import java.util.Date;

public class PacuanKuda {
    private String namaPacuan;
    private String lokasiPacuan;
    private Date tanggalPacuan;
    private int jarakLintasan;
    private String tingkatanPacuan;
    private int jumlahPeserta;
    private float durasiPacuan;
    private String pialaPenghargaan;

    public PacuanKuda() {
    }

    public PacuanKuda(String namaPacuan, String lokasiPacuan, Date tanggalPacuan, 
                    int jarakLintasan, String tingkatanPacuan, int jumlahPeserta, 
                    float durasiPacuan, String pialaPenghargaan) {
        this.namaPacuan = namaPacuan;
        this.lokasiPacuan = lokasiPacuan;
        this.tanggalPacuan = tanggalPacuan;
        this.jarakLintasan = jarakLintasan;
        this.tingkatanPacuan = tingkatanPacuan;
        this.jumlahPeserta = jumlahPeserta;
        this.durasiPacuan = durasiPacuan;
        this.pialaPenghargaan = pialaPenghargaan;
    }

    public String getNamaPacuan() {
        return namaPacuan;
    }
    public void setNamaPacuan(String nama) {
        this.namaPacuan = nama;
    }

    public String getLokasiPacuan() {
        return lokasiPacuan;
    }
    public void setLokasiPacuan(String lokasi) {
        this.lokasiPacuan = lokasi;
    }

    public Date getTanggalPacuan() {
        return tanggalPacuan;
    }
    public void setTanggalPacuan(Date tanggal) {
        this.tanggalPacuan = tanggal;
    }

    public int getJarakLintasan() {
        return jarakLintasan;
    }
    public void setJarakLintasan(int jarak) {
        this.jarakLintasan = jarak;
    }

    public String getTingkatanPacuan() {
        return tingkatanPacuan;
    }
    public void setTingkatanPacuan(String tingkatan) {
        this.tingkatanPacuan = tingkatan;
    }

    public int getJumlahPeserta() {
        return jumlahPeserta;
    }
    public void setJumlahPeserta(int jumlah) {
        this.jumlahPeserta = jumlah;
    }

    public float getDurasiPacuan() {
        return durasiPacuan;
    }
    public void setDurasiPacuan(float durasi) {
        this.durasiPacuan = durasi;
    }

    public String getPialaPenghargaan() {
        return pialaPenghargaan;
    }
    public void setPialaPenghargaan(String piala) {
        this.pialaPenghargaan = piala;
    }

    public void mulaiPacuan() {
        System.out.println("\nPacuan Kuda " + namaPacuan + " dimulai!");
    }

    public void hentikanPacuan() {
        System.out.println("Pacuan Kuda " + namaPacuan + " dihentikan.");
    }

    public int tambahPeserta() {
        this.jumlahPeserta++;
        return this.jumlahPeserta;
    }

    public int kurangPeserta() {
        if (this.jumlahPeserta > 0) {
            this.jumlahPeserta--;
        }
        return this.jumlahPeserta;
    }

    public void tampilkanHasil() {
        String durasiFormatted = String.format("%.2f", durasiPacuan); 
        System.out.println("\n--- Hasil Pacuan ---");
        System.out.println("Nama: " + namaPacuan);
        System.out.println("Tingkatan: " + tingkatanPacuan);
        System.out.println("Lokasi: " + lokasiPacuan);
        System.out.println("Tanggal: " + tanggalPacuan);
        System.out.println("Peserta: " + jumlahPeserta);
        System.out.println("Durasi Terbaik: " + durasiFormatted + " menit"); 
    }
}