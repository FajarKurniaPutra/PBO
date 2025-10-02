import java.util.Date;

public class FlatRacing extends PacuanKuda {
    private String kondisiLintasan;
    private String modelLintasan;

    public FlatRacing() {
        super();
    }

    public FlatRacing(String namaPacuan, String lokasiPacuan, Date tanggalPacuan, 
                        int jarakLintasan, String tingkatanPacuan, int jumlahPeserta, 
                        float durasiPacuan, String pialaPenghargaan, 
                        String kondisiLintasan, String modelLintasan) {
        super(namaPacuan, lokasiPacuan, tanggalPacuan, jarakLintasan, 
                tingkatanPacuan, jumlahPeserta, durasiPacuan, pialaPenghargaan);
        this.kondisiLintasan = kondisiLintasan;
        this.modelLintasan = modelLintasan;
    }

    public String getKondisiLintasan() {
        return kondisiLintasan;
    }
    public void setKondisiLintasan(String kondisi) {
        this.kondisiLintasan = kondisi;
    }

    public String getModelLintasan() {
        return modelLintasan;
    }
    public void setModelLintasan(String model) {
        this.modelLintasan = model;
    }

    public void aturLintasan(String jenis) {
        this.modelLintasan = jenis;
        System.out.println("Lintasan Flat Racing diatur ke jenis: " + jenis);
    }

    @Override
    public void tampilkanHasil() {
        super.tampilkanHasil();
        System.out.println("Detail Lintasan: " + getModelLintasan() + " | Kondisi: " + getKondisiLintasan());
        System.out.println("Piala yang Diperebutkan: " + getPialaPenghargaan());
        System.out.println("--------------------");
    }
}