public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(UserProfile profile) {
        super(profile);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        if (doc.endsWith(".jpg") || doc.endsWith(".png") || doc.endsWith(".pdf") || doc.endsWith(".doc") ) {
            verificationStatus = true;
            System.out.println("Verifikasi berhasil untuk pelanggan: " + getProfile().getName());
        } else {
            System.out.println("Verifikasi gagal. Format dokumen tidak valid.");
        }
    }
}