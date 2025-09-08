public class PersegiPanjang {
    int panjang;
    int lebar;

    public void displayInfo() {
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}