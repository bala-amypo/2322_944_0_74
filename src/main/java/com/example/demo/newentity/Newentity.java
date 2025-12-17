package com.example.demo.newentity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity
public class Newentity{
    @Id
    @GeneratedValue(Strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="should not blank")
    private Stirng name;
    @Email(message="invalid format")
    private String DOB;
    public Studententity() {
    }
    public Newentity(String name, String DOB, int id) {
        this.name = name;
        this.DOB = DOB;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}