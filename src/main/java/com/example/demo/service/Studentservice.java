package com.example.sriram.Studentservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.sriram.Studententity.Studententity;

@Service
public class Studentservice {

    private Map<Integer, Studententity> mp = new HashMap<>();

    public Studententity savedata(Studententity st) {
        mp.put(st.getId(), st);
        return st;
    }

    public List<Studententity> retdata() {
        return new ArrayList<>(mp.values());
    }

    public Studententity id(int id) {
        return mp.get(id);
    }
}
