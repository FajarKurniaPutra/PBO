public class Segitiga {

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Total sudut 1: " + s.totalSudut(60));
        System.out.println("Total sudut 2: " + s.totalSudut(60, 40));
        System.out.println("Keliling: " + s.keliling(3, 4, 5));
        System.out.println("Sisi miring: " + s.keliling(3, 4));
    }
}