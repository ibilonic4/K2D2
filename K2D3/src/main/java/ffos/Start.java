/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import ffos.utility.HibernateUtil;
import ffos.view.Izbornik;
import org.hibernate.Session;

/**
 *
 * @author Ana-Marija
 */
public class Start {
     public static void main(String[] args) {
        
       //  Session s = HibernateUtil.getSession();
        //s.beginTransaction();
        //s.getTransaction().commit();
        new Izbornik().setVisible(true); //otvara formu izbornik
    }
}
