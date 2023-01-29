/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Pess;



/**
 *
 * @author wesly
 */
public class Vai {

    public static void main(String[] args) {
        
       
        EntityManagerFactory fb = Persistence.createEntityManagerFactory("pessoa");
        EntityManager ger = fb.createEntityManager();
        
         Pess p = new Pess();
        p.setNome("maria");
        ger.getTransaction().begin();
        ger.persist(p);
        ger.getTransaction().commit();
        
    }
}
