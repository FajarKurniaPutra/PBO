public class Demo2 {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402"); 
        TenagaKependidikan tendiki = new TenagaKependidikan("19750301", 
        "Aida, A.Md.", "Tenaga Administrassi");
        train(dosen1);
        train(tendiki);
    }

    public static void train(Pegawai pegawai){
        pegawai.displayInfo();
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        if (pegawai instanceof Dosen) {
        System.out.println("Memberikan pelatihan pedagogik");
        }
    }
}