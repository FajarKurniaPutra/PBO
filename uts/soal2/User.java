public class User {
    private UserProfile profile; 

    public User(UserProfile profile) {
        this.profile = profile;
    }

    public void logIn(int userId, String password) {
        if (userId == profile.getUserId() && password.equals(profile.getPassword())) {
            System.out.println("Login berhasil. Selamat datang, " + profile.getName() + "!");
        } else {
            System.out.println("Login gagal. ID atau kata sandi salah.");
        }
    }

    public void recoverPassword() {
        System.out.println("Tautan pemulihan kata sandi telah dikirim ke: " + profile.getEmail());
    }

    public void logOut() {
        System.out.println(profile.getName() + " telah keluar dari sistem.");
    }

    public UserProfile getProfile() {
        return profile;
    }
}