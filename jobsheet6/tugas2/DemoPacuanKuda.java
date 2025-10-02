import java.util.Date;
import java.util.Random;

public class DemoPacuanKuda {
    public static void main(String[] args) {
        Random rand = new Random();
        float durasiFlat = 5.0f + (rand.nextFloat() * 3.5f);
        float durasiSteeplechase = 14.0f + (rand.nextFloat() * 1.5f);

        FlatRacing balapDatar = new FlatRacing(
            "Derby Jakarta 2025", 
            "Sirkuit Pulomas",    
            new Date(),                         
            3000,                               
            "Grade 1 (Kelas A)",  
            8,                                 
            durasiFlat,                        
            "Piala Derby Jakarta 2025", 
            "Kering/Turf",                     
            "Oval Standard (Long)"              
        );

        System.out.println("----------------------------------------");
        System.out.println(">> SIMULASI: FLAT RACING");
        System.out.println("----------------------------------------");

        System.out.println("Jumlah peserta awal: " + balapDatar.getJumlahPeserta());
        for (int i = 0; i < 8; i++) {
            balapDatar.tambahPeserta();
        }

        System.out.println("Jumlah peserta baru: " + balapDatar.getJumlahPeserta());
        for (int i = 0; i < 4; i++) {
            balapDatar.kurangPeserta();
        }
        System.out.println("Jumlah peserta setelah diskualifikasi: " + balapDatar.getJumlahPeserta());

        balapDatar.mulaiPacuan();
        balapDatar.hentikanPacuan();
        System.out.println("Balapan selesai, mengumpulkan hasil...");
        balapDatar.tampilkanHasil(); 
        

        Steeplechase balapRintangan = new Steeplechase(
            "Grand National Bandung", 
            "Bandung Horse Park",                   
            new Date(),                            
            2000,                                   
            "Grade 1",                
            15,                                     
            durasiSteeplechase,                    
            "Piala Grand National",                 
            14                                    
        );

        System.out.println("\n----------------------------------------");
        System.out.println(">> SIMULASI: STEEPLECHASE");
        System.out.println("----------------------------------------");
        
        System.out.println("[INFO] Jumlah Rintangan Awal: " + balapRintangan.getBanyakRintangan());
        for (int i = 0; i < 6; i++) {
            balapRintangan.tambahRintangan();
        }
        System.out.println("[INFO] Jumlah Rintangan Setelah Penyesuaian: " + balapRintangan.getBanyakRintangan());
        
        balapRintangan.mulaiPacuan();
        balapRintangan.hentikanPacuan(); 
        System.out.println("Balapan selesai, mengumpulkan hasil...");
        balapRintangan.tampilkanHasil();
        
        for (int i = 0; i < 8; i++) {
            balapRintangan.kurangRintangan();
        }        
        System.out.println("Detail Rintangan: Tersisa " + balapRintangan.getBanyakRintangan() + " rintangan.");
    }
}