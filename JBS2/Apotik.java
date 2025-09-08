public class Apotik {
    String nama, alamat, nomorTelepon, obat;
    double hargaObat, pemasukan;
    int stokObat;

    public Apotik(String nama, String alamat, String nomorTelepon, String obat, double hargaObat, int stokObat) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.obat = obat;
        this.hargaObat = hargaObat;
        this.stokObat = stokObat;
    }

    void lihatDaftarObat() {
        System.out.println("Obat: " + obat + " | Harga: Rp" + hargaObat + " | Stok: " + stokObat);
    }

    double jualObat(int jumlah) {
        if (jumlah <= stokObat) {
            stokObat -= jumlah;
            double total = jumlah * hargaObat;
            pemasukan += total;
            System.out.println(jumlah + " " + obat + " terjual. Total Rp" + total);
            return total;
        } else {
            System.out.println("Stok tidak cukup!");
            return 0;
        }
    }

    void cekStokObat() {
        System.out.println("Stok " + obat + " sekarang: " + stokObat);
    }

    double hitungPemasukan() {
        return pemasukan;
    }
}
