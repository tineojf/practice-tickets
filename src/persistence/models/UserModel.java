package persistence.models;

public class UserModel {

    private String dni;
    private String password;
    private String name;
    private String phone;
    private String address;

    public UserModel(String dni, String name, String password, String phone, String address) {
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

    @Override
    public String toString() {
        return "User{" + "dni=" + dni + ", password=" + password + ", name=" + name + ", phone=" + phone + ", address=" + address + '}';
    }

}
