package com.example.demo.Studentservice;
import java.util.List;
import com.example.demo.entity.Studententity;
public interface Studentservice {
    Newentity savedata(Newentity new);
    List<Newentity> getiddata();
    Newentity updatedata(int id,Studententity std);
    String Deletedata(int id);
}
