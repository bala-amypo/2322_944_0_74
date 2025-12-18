package com.example.demo.Studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Studententity.Studententity;
import com.example.demo.Studentservice.Studentservice;

@RestController
public class Studentcontroller {

    @Autowired
    Studentservice src;


    @PostMapping("/post")
    public Studententity postdata(@RequestBody Studententity st) {
        return src.savedata(st);
    }


    @GetMapping("/get")
    public List<Studententity> getdata() {
        return src.retdata();
    }

    @GetMapping("/getid/{id}")
    public Studententity getIdValue(@PathVariable int id) {
        return src.id(id);
    }


    // @PutMapping("/update/{id}")
    // public Studententity updatedata(
    //         @PathVariable int id,
    //         @RequestBody Studententity st) {
    //     return src.updatedata(id, st);
    // }


    // @DeleteMapping("/delete/{id}")
    // public String deletedata(@PathVariable int id) {
    //     return src.deletedata(id);
    // }
}
