package com.example.sriram.Studententity;

public class Studententity {

    private String name;
    private String DOB;
    private int id;

    public Studententity() {
    }

    public Studententity(String name, String DOB, int id) {
        this.name = name;
        this.DOB = DOB;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
