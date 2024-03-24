package persistence.models;

public class Company {

    private String id;
    private String name;

    // Constructor
    public Company(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Setters & getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", name=" + name + '}';
    }

}
