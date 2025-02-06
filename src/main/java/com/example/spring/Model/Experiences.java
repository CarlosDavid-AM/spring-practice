package com.example.spring.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "experiences")
public class Experiences {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String company;

    @Column(nullable = false, length = 100)
    private String position;

    @Column(nullable = false, length = 50)
    private String duration;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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
        Experiences that = (Experiences) o;
        return Objects.equals(id, that.id) && Objects.equals(company, that.company) && Objects.equals(position, that.position) && Objects.equals(duration, that.duration) && Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, position, duration, users);
    }

    @Override
    public String toString() {
        return "Experiences{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", duration='" + duration + '\'' +
                ", users=" + users +
                '}';
    }
}
