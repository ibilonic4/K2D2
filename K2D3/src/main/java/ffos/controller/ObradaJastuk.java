/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Jastuk;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaJastuk extends Obrada<Jastuk>{

    public void setData(String boja, String datum){
    if(getEntitet()==null){
    Jastuk j = new Jastuk();
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        try {
               j.setDatum((Date)df.parse(datum));
           j.setBoja(boja);
        } catch (Exception ex) {
        } setEntitet(j);
    } else {
         SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        try {
            getEntitet().setBoja(boja);
            getEntitet().setDatum((Date)df.parse(datum));
        } catch (Exception e) {
        }
    }
        
    }
    
    
    
    
    
     public List <Jastuk> read(){
    return session.createQuery("from Jastuk").list();
    }
    
    
    
    @Override
    public void kontrolaCreate() throws Exception {
    }

    @Override
    public void kontrolaUpdate() throws Exception {
    }

    @Override
    public void kontrolaDelete() throws Exception {
    }
    
}
