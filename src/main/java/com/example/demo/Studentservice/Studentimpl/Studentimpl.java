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

    // CREATE
    @Override
    public Studententity savedata(Studententity st) {
        mp.put(st.getId(), st);
        return st;
    }

    // READ ALL
    @Override
    public List<Studententity> retdata() {
        return new ArrayList<>(mp.values());
    }

    // READ BY ID
    @Override
    public Studententity id(int id) {
        return mp.get(id);
    }

    // UPDATE
    @Override
    public Studententity updatedata(int id, Studententity st) {
        if (mp.containsKey(id)) {
            st.setId(id);      // keep same ID
            mp.put(id, st);
            return st;
        }
        return null;
    }

    // DELETE
    @Override
    public String deletedata(int id) {
        if (mp.containsKey(id)) {
            mp.remove(id);
            return "Student deleted successfully";
        }
        return "Student not found";
    }
}
