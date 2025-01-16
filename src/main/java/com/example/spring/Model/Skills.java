package com.example.spring.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String years;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skills skills = (Skills) o;
        return Objects.equals(id, skills.id) && Objects.equals(name, skills.name) && Objects.equals(years, skills.years);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, years);
    }

    @Override
    public String toString() {
        return "Skills{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", years='" + years + '\'' +
                '}';
    }
}
