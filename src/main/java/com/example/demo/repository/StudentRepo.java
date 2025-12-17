package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.jpa.repository.JpaRepository;
import com.example.demo.
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}