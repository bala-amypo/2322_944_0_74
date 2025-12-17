package com.example.demo.Studentservice;

import java.util.List;


import com.example.demo.Studententity.Studententity;


public interface Studentservice {
    Studententity postdata(Studententity stu);
    List<Studententity> getdata();
    Studententity updatedata(int id,Studententity std);
    String Deletedata(int id);

}
