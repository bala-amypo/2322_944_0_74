package com.example.demo.Studentservice;

import java.util.List;
import com.example.demo.Studententity.Studententity;

public interface StudentServiceInterface {

    Studententity savedata(Studententity st);

    List<Studententity> retdata();

    Studententity id(int id);

    Studententity updatedata(int id, Studententity st);

    String deletedata(int id);
}
