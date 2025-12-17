package com.example.demo.newentity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
public class Newentity{
    @Id
    private Long id;
    @NotBlank(message="should not blank")
    private Stirng name;
    @E
    private String email;
}