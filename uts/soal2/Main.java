import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        UserProfile profile1 = new UserProfile(101, "pass123", "Bahlil", 25, "bahlil@mail.com", "ktp.jpg");
        UserProfile profile2 = new UserProfile(102, "admin123", "Syahroni", 30, "syahroti@mail.com", "id.pdf");
        UserProfile profile3 = new UserProfile(103, "fufufafa", "Gabrina", 30, "fufufafa@mail.com", "id.pdf");

        Customer cust = new Customer(profile1);
        Admin admin = new Admin(profile2);
        Customer cust2 = new Customer(profile3);

        cust.logIn(101, "pass123");
        cust.applyVerification("anggaran.xls");
        cust.applyVerification("ktp.jpg");
        cust.getProfile().showDocuments();
        cust.getProfile().editProfile("Bowo", 35, "owol123@mail.com");
        cust.logOut();

        System.out.println();

        admin.logIn(102, "admin123");
        admin.verifyUser(cust);
        admin.addVehicle();
        admin.updateVehicleDetails(rand.nextInt(1000) + "");
        admin.logOut();

        System.out.println();

        cust2.logIn(103, "admin123");
    }
}