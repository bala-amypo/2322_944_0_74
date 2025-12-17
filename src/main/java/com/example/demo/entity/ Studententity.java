package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity

public class Studententity {
    @Id
    @Generatedvalue(strategy=GenerationType.IDENTITY);
    private Long id;
    @NotBlank(message= "should not contain spaces")
    private  String name;
    @NotBlank(message= "no blank allowed")
    @Email(message="invalid format")
    @Column(name=unique)
    private String email;
    private String password;
    private String role;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    
    public Studententity(Long id, @NotBlank(message = "should not contain spaces") String name,
            @NotBlank(message = "no blank allowed") @Email(message = "invalid format") String email, String password,
            String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    public Studententity() {
    }
    
}