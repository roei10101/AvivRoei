package avivRoei;

public class Buyer {
    private String username;
    private String password;
    private String address;


    // Constructor
    public Buyer(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;
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
        return "Buyer{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
