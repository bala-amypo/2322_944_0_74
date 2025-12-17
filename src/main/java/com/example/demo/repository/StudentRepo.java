package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.jpa.repository.JpaRepository;
import com.example.demo.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}