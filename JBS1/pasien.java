public class pasien{
    public static void main(String[] args) {
        String nama, nama2, nama3, nama4, nama5, nama6, nama7, nama8, nama9, nama10, 
        keluhan, keluhan2, keluhan3, keluhan4, keluhan5, keluhan6, keluhan7, keluhan8, keluhan9, keluhan10,
        obat, obat2, obat3, obat4, obat5, obat6, obat7, obat8, obat9, obat10;  

        nama = "Rengoku";
        keluhan = "Batuk Berdahak";
        obat = "Muchohexin" ;

        nama2 = "Gyomei";
        keluhan2 = "Kaki kiri sakit";
        obat2 = "Hotin Cream";

        nama3 = "Obanai";
        keluhan3 = "Demam";
        obat3 = "Demacolin";

        nama4 = "Mitsuri";
        keluhan4 = "Flue";
        obat4 = "Flucadex";

        nama5 = "Shinobu";
        keluhan5 = "Radang Tenggorokan";
        obat5 = "Methylprednisolone";

        nama6 = "Muichiro";
        keluhan6 = "Diare";
        obat6 = "Diapet";

        nama7 = "Genya";
        keluhan7 = "Kulit kemerahan";
        obat7 = "Bedak Heroxin";

        nama8 = "Ubuyashiki";
        keluhan8 = "Pusing berputar-putar";
        obat8 = "Neuralgin";

        nama9 = "Sabito";
        keluhan9 = "Pusing berkunang-kunang";
        obat9 = "Bodrexin";

        nama10 = "Yorichi";
        keluhan10 = "Saraf Terjepit";
        obat10 = "Minyak Gandapuro";

        ajukanPemeriksaan(nama, keluhan);
        beliObat(nama, obat);

        System.out.println("----------------------");

        ajukanPemeriksaan(nama2, keluhan2);
        beliObat(nama2, obat2);

        System.out.println("----------------------");

        ajukanPemeriksaan(nama5, keluhan5);
        beliObat(nama5, obat5);

        System.out.println("----------------------");

        ajukanPemeriksaan(nama8, keluhan3);
        beliObat(nama8, obat9);

    }

    public static void ajukanPemeriksaan(String nama, String keluhan) {
        System.out.println("Pasien " + nama + " mengajukan pemeriksaan dengan keluhan: " + keluhan);
    }

    public static void beliObat(String nama, String obat) {
        System.out.println("Pasien " + nama + " membeli obat: " + obat);
    }
}