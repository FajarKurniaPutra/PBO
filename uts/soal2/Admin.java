public class Admin extends User {

    public Admin(UserProfile profile) {
        super(profile);
    }

    public void updateVehicleDetails(String vehicleId) {
        System.out.println("Detail kendaraan dengan ID " + vehicleId + " telah diperbarui.");
    }

    public void addVehicle() {
        System.out.println("Kendaraan baru telah ditambahkan ke sistem.");
    }

    public void retrieveComplain() {
        System.out.println("Semua keluhan pelanggan telah ditampilkan.");
    }

    public void verifyUser(Customer customer) {
        if (customer.getVerificationStatus()) {
            System.out.println("User " + customer.getProfile().getName() + " sudah terverifikasi.");
        } else {
            System.out.println("User " + customer.getProfile().getName() + " belum terverifikasi.");
        }
    }
}