package com.example.demo.newentity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
public class Newentity{
    @Id
    @GeneratedValue(Strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="should not blank")
    private Stirng name;
    @Email(message="invalid format")
    private String email;
}