public class Admin implements RegisterInterface {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean register(String username, String password) {
        if (this.username.equals(username)) {
            // Username sudah terdaftar
            return false;
        } else {
            this.username = username;
            this.password = password;
            return true;
        }
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}