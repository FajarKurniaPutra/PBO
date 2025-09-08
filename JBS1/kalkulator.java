import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextInt();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextInt();

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                hasil = bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operator tidak valid!");
                return;
        }
        System.out.println("Hasil: " + hasil);
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static double bagi(int a, int b) {
        return (double) a / b;
    }
}
