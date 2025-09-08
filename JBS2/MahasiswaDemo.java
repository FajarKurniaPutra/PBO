public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "012345";
        m2.nama = "Fajar Kurnia";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2F";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "054321";
        m3.nama = "Putra Anomali";
        m3.alamat = "Bima, NTB";
        m3.kelas = "2I";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}
