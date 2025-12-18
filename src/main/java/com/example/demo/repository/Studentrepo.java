package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Studententity.Studententity;

public interface Studentrepo extends JpaRepository<Studententity, Integer> {
}