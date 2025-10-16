public class DemoBengkel {
    public static void main(String[] args) {
        System.out.println("=== Data Servis Bengkel Maju Jaya ===");

        Kendaraan mobil = new Mobil("N 1234 AB", "Toyota", 2020);
        Kendaraan motor = new Motor("N 5678 XY", "Honda", 2022);

        mobil.tampilData();
        motor.tampilData();
    }
}