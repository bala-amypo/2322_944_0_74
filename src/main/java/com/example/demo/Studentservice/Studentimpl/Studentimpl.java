package com.example.demo.Studentservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.Studententity.Studententity;

@Service
public class Studentservice implements Studentimpl {

    private Map<Integer, Studententity> mp = new HashMap<>();

    
    @Override
    public Studententity savedata(Studententity st) {
        mp.put(st.getId(), st);
        return st;
    }

    
    @Override
    public List<Studententity> retdata() {
        return new ArrayList<>(mp.values());
    }


    @Override
    public Studententity id(int id) {
        return mp.get(id);
    }

    // @Override
    // public Studententity updatedata(int id, Studententity st) {

    // }


    // @Override
    // public String deletedata(int id) {

    }
}
