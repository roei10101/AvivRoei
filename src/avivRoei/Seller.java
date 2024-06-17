package avivRoei;

public class Seller {
    private String username;
    private String password;

    // Constructor
    public Seller(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // toString method
    @Override
    public String toString() {
        return "Seller{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
