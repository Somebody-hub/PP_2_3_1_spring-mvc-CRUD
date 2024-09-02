package web.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String Name;

    @Column
    private int Age;

    @Column
    private String Email;

    public User() {
    }

    public User(Long id, String Name, int Age, String Email) {
        this.id = id;
        this.Name = Name;
        this.Age = Age;
        this.Email = Email;
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

    @Override
    public String toString() {
        return "id = " + this.id
                + "\n" + "Name = " + this.Name
                + "\n" + "Age = " + this.Age
                + "\n" + "Email " + this.Email;
    }
}
