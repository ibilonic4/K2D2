/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Vlasnik;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaVlasnik extends Obrada<Vlasnik> {

    
    public void SetData(String ime, String prezime){
    if(getEntitet()==null){
    Vlasnik v = new Vlasnik();
        try {
            v.setIme(ime);
            v.setPrezime(prezime);
        } catch (Exception ex) {
        } setEntitet(v);
    } else {
        try {
            getEntitet().setIme(ime);
            getEntitet().setPrezime(prezime);
        } catch (Exception e) {
        }
    }
        
    }
    
    
      public List <Vlasnik> read(){
    return session.createQuery("from Vlasnik").list();
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public void kontrolaCreate() throws Exception {
        //ako je nešto not null
          if (getEntitet().getPrezime()== null || getEntitet().getPrezime().isEmpty()){
  throw new Exception("Prezime je obavezno");
          }
        
    }

    @Override
    public void kontrolaUpdate() throws Exception {
    }

    @Override
    public void kontrolaDelete() throws Exception {
    }
    
}
