package com.example.spring.DTO;

import java.util.List;

public class UsersDTO {

    private Long id;

    private String name;

    private String country;

    private Integer age;

    private List<SkillsDTO> skills;

    private List<LanguagesDTO> languages;

    private List<ExperiencesDTO> experiences;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<SkillsDTO> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillsDTO> skills) {
        this.skills = skills;
    }

    public List<LanguagesDTO> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguagesDTO> languages) {
        this.languages = languages;
    }

    public List<ExperiencesDTO> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<ExperiencesDTO> experiences) {
        this.experiences = experiences;
    }
}
