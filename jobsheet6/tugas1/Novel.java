public class Novel extends Buku {
    public String genre; 

    Novel() {
        System.out.println("Objek Novel dibuat");
    }

    Novel(String judul, String penulis, int tahunTerbit, String genre) {
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
    }

    void infoLengkap() {
        super.infoLengkap();
        System.out.println("Genre: " + genre);
    }
}