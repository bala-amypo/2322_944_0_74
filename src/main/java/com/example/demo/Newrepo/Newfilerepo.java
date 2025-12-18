package com.example.demo.repository;
import org.springframework.jpa.repository.JpaRepository;
import com.example.demo.newentity.Newentity;
public interface Newfilerepo extends JpaRepository<Newentity,Long>{

}