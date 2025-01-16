package com.example.spring.DTO;

import java.util.List;

public class UsersDTO {

    private Long id;

    private String name;

    private String country;

    private String age;

    private List<SkillsDTO> skillsDTO;

    private List<LanguagesDTO> languagesDTO;

    private List<ExperiencesDTO> experiencesDTO;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<SkillsDTO> getSkillsDTO() {
        return skillsDTO;
    }

    public void setSkillsDTO(List<SkillsDTO> skillsDTO) {
        this.skillsDTO = skillsDTO;
    }

    public List<LanguagesDTO> getLanguagesDTO() {
        return languagesDTO;
    }

    public void setLanguagesDTO(List<LanguagesDTO> languagesDTO) {
        this.languagesDTO = languagesDTO;
    }

    public List<ExperiencesDTO> getExperiencesDTO() {
        return experiencesDTO;
    }

    public void setExperiencesDTO(List<ExperiencesDTO> experiencesDTO) {
        this.experiencesDTO = experiencesDTO;
    }
}
