import java.util.Scanner;

public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang persegi1 = new PersegiPanjang();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        persegi1.panjang = new Scanner(System.in).nextInt();

        System.out.print("Masukkan lebar: ");
        persegi1.lebar = new Scanner(System.in).nextInt();

        System.out.println("\nInformasi Persegi Panjang:");
        persegi1.displayInfo();

        System.out.println("Luas     : " + persegi1.getLuas());
        System.out.println("Keliling: " + persegi1.getKeliling());
    }
}