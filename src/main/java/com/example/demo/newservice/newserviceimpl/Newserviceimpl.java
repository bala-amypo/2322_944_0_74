package com.example.demo.newservice.newserviceimpl;

public class Newseviceimpl implements Newservice{
    private final Newfilerepo rep;
    public Newservicempl(Newfilerepo rep){
        this.rep=rep;
    }
    @Override
    public Newentity savedata(Newentity new){
       return rep.save(new);
    }
    @Override
    public Newentity getidval(Long id){
        
    }
    @Override
    public List<Newentity>getall(){

    }
    @Override


}