public class TestDowncasting {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("123", "Putra");
        
        System.out.println("Apakah pegawai instanceof Dosen? " + (pegawai instanceof Dosen));
        
        Dosen dosen = (Dosen) pegawai; 
        System.out.println("Downcasting berhasil"); 
    }
}