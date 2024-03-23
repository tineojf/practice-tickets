package persistence.models;

public class User {

    private String dni;
    private String password;
    private String name;
    private String phone;
    private String address;

    public User(String dni, String password, String name, String phone, String address) {
        this.dni = dni;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
