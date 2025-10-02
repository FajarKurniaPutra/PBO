import java.util.Date;

public class Steeplechase extends PacuanKuda {
    private int banyakRintangan;

    public Steeplechase() {
        super();
    }

    public Steeplechase(String namaPacuan, String lokasiPacuan, Date tanggalPacuan, 
                        int jarakLintasan, String tingkatanPacuan, int jumlahPeserta, 
                        float durasiPacuan, String pialaPenghargaan, 
                        int banyakRintangan) {
        super(namaPacuan, lokasiPacuan, tanggalPacuan, jarakLintasan, 
                tingkatanPacuan, jumlahPeserta, durasiPacuan, pialaPenghargaan);
        this.banyakRintangan = banyakRintangan;
    }

    public int getBanyakRintangan() {
        return banyakRintangan;
    }
    public void setBanyakRintangan(int rintangan) {
        this.banyakRintangan = rintangan;
    }

    public int tambahRintangan() {
        this.banyakRintangan++;
        return this.banyakRintangan;
    }

    public int kurangRintangan() {
        if (this.banyakRintangan > 0) {
            this.banyakRintangan--;
        }
        return this.banyakRintangan;
    }

    @Override
    public void tampilkanHasil() {
        super.tampilkanHasil();
        System.out.println("Jumlah Rintangan: " + getBanyakRintangan());
        System.out.println("Piala yang Diperebutkan: " + getPialaPenghargaan());
        System.out.println("--------------------");
    }
}