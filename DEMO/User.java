package DEMO;
public class User {
    private String id;
    private String name;
    private String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter methods untuk mengakses atribut
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void infoUser() {
        System.out.println("ID      : " + id);
        System.out.println("Nama    : " + name);
        System.out.println("Email   : " + email);
    }
}