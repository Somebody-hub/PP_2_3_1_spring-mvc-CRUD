package web.model;

import javax.persistence.*;


@Entity
@Table(name = "Users")
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

    @Column
    private int deleted;

    public User() {
        this.deleted = 0;
    }

    public User(String Name, int Age, String Email) {
        this.Name = Name;
        this.Age = Age;
        this.Email = Email;
        this.deleted = 0;
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

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public int getDeleted() {
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
