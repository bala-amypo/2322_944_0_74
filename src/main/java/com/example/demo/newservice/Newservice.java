package com.example.demo.Studentservice;
import java.util.List;
import com.example.demo.entity.Studententity;
public interface Studentservice {
    Newentity savedata(Newentity new);
    List<Newentity> getiddata();
    Newentity updatedata(Long id,Newentity new);
    void Deletedata(Long id);
}
