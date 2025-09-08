import java.util.Scanner;
public class ApotikDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Apotik apotik1 = new Apotik("Apotik Sehat", "Jl. Merdeka 1", "08123456789","Paracetamol", 5000, 50);

        System.out.println("=== " + apotik1.nama + " ===");
        apotik1.lihatDaftarObat();
        apotik1.jualObat(5);
        apotik1.cekStokObat();
        System.out.println("Pemasukan: Rp" + apotik1.hitungPemasukan());

        System.out.print("\nNama Apotik: ");
        String nama2 = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat2 = scanner.nextLine();
        System.out.print("Nomor Telepon: ");
        String telp2 = scanner.nextLine();
        System.out.print("Nama Obat: ");
        String obat2 = scanner.nextLine();
        System.out.print("Harga Obat: ");
        double harga2 = scanner.nextDouble();
        System.out.print("Stok Obat: ");
        int stok2 = scanner.nextInt();
        System.out.print("Terjual: ");
        int terjual = scanner.nextInt();

        Apotik apotik2 = new Apotik(nama2, alamat2, telp2, obat2, harga2, stok2);
        System.out.println("\n=== " + apotik2.nama + " ===");
        apotik2.lihatDaftarObat();
        apotik2.jualObat(terjual);
        apotik2.cekStokObat();
        System.out.println("Pemasukan: Rp" + apotik2.hitungPemasukan());
    }
}