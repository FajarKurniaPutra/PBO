public class TenagaKependidikan extends Pegawai {
    public String kategori;

    public TenagaKependidikan() {
    }

    public TenagaKependidikan(String nip, 
    String name, String kategori) {
        super(nip, name);
        this.kategori = kategori;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: " + kategori);
    }
} 