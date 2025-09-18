public class RestoDemo {
    public static void main(String[] args) {
        Restoran resto = new Restoran("12345", "Bakso Prima", "Malang");

        Hidangan h1 = new Hidangan("H001", "Bakso", 15000, 10);
        Hidangan h2 = new Hidangan("H002", "Mie Ayam", 12000, 1);
        Hidangan h3 = new Hidangan("H003", "Es Teh", 5000, 20);
        Hidangan h4 = new Hidangan("H004", "Es Matcha", 10000, 15);

        resto.tambahMenu(h1);
        resto.tambahMenu(h2);
        resto.tambahMenu(h3);
        resto.tambahMenu(h4);

        resto.lihatMenu();

        Pelanggan p1 = new Pelanggan("1015", "Putra", "08123456789", "Jl. Sawojajar Gang V");
        Pelanggan p2 = new Pelanggan("1515", "Putri", "08123456789", "Jl. Sawojajar Gang V");

        p1.pesanHidangan(h1);
        p1.pesanHidangan(h3);
        p2.pesanHidangan(h2);
        p2.pesanHidangan(h2);
        p2.pesanHidangan(h4);

        p1.lihatPesanan();
        p2.lihatPesanan();

        resto.prosesPesanan(p1);
        resto.prosesPesanan(p2);

        System.out.println("\nTotal pemasukan restoran: " + resto.hitungPemasukan());
    }
}