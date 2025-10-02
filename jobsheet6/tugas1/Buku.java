public class Buku {
    public String judul;
    public String penulis;
    public int tahunTerbit;

    Buku() {
        System.out.println("Objek Buku dibuat");
    }

    Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    void infoLengkap() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}