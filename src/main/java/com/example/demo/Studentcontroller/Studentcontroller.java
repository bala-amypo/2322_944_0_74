package com.example.demo.Studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Studententity.Studententity;
import com.example.demo.Studentservice.StudentServiceInterface;

@RestController
public class Studentcontroller {

    @Autowired
    StudentServiceInterface src;

    // CREATE
    @PostMapping("/post")
    public Studententity postdata(@RequestBody Studententity st) {
        return src.savedata(st);
    }

    // READ ALL
    @GetMapping("/get")
    public List<Studententity> getdata() {
        return src.retdata();
    }

    // READ BY ID
    @GetMapping("/getid/{id}")
    public Studententity getIdValue(@PathVariable int id) {
        return src.id(id);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Studententity updatedata(
            @PathVariable int id,
            @RequestBody Studententity st) {
        return src.updatedata(id, st);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deletedata(@PathVariable int id) {
        return src.deletedata(id);
    }
}
