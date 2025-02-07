package com.example.spring.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "years")
    private String years;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Skills skills = (Skills) o;
        return Objects.equals(id, skills.id) && Objects.equals(name, skills.name) && Objects.equals(years, skills.years) && Objects.equals(users, skills.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, years, users);
    }

    @Override
    public String toString() {
        return "Skills{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", years='" + years + '\'' +
                ", users=" + users +
                '}';
    }
}
