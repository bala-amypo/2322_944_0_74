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
        return rep.findById(id);
    }
    @Override
    public List<Newentity>getall(){
        return rep.findAll();
    }
    @Override
    public Newentity update(Long id,Newentity new){
        Newentity existing=getidval(id);
        existing.setName(newfile.getName());
        existing.setEmail(newfile.getEmail());
        return rep.save(existing);
    }
    @Override
    public void Delete(Long id){
        return rep.delete(Long id)
    }


}