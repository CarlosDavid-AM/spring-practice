package com.example.spring.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "languages")
public class Languages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 20)
    private String level;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
        Languages languages = (Languages) o;
        return Objects.equals(id, languages.id) && Objects.equals(name, languages.name) && Objects.equals(level, languages.level) && Objects.equals(users, languages.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, level, users);
    }

    @Override
    public String toString() {
        return "Languages{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", users=" + users +
                '}';
    }
}
