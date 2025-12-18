package com.example.demo.newcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.newentity.Newentity;
import com.example.demo.newservice.Newservice;


@RestController
public class Newcontroller {

    @Autowired

    @PostMapping("/post")
    public Studententity postdata(@RequestBody Newentity new) {
        return src.savedata(st);
    }

    @GetMapping("/get")
    public List<Newentity> getdata() {
        return src.retdata();
    }

    @GetMapping("/getid/{id}")
    public Newentity getIdValue(@PathVariable Long id) {
        return src.id(id);
    }
    @PutMapping("/update/{id}")
    public Newentity putdata(@PathVariable Long id,@RequestBody Newentity new){
        return src.putdata(id,new);
    }
    @DeleteMapping("/delete/{id}")
    public void deletedata(@PathVariable long id){
        return src.deldata(id);
    }


}
