package web.model;

import javax.persistence.*;


@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Name;

    private int Age;

    private String Email;

    private boolean deleted;

    public User() {
        this.deleted = false;
    }

    public User(String Name, int Age, String Email) {
        this.Name = Name;
        this.Age = Age;
        this.Email = Email;
        this.deleted = false;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean getDeleted() {
        return this.deleted;
    }

    @Override
    public String toString() {
        return "id = " + this.id
                + "\n" + "Name = " + this.Name
                + "\n" + "Age = " + this.Age
                + "\n" + "Email " + this.Email
                + "\n" + "deleted" + this.deleted;
    }
}
