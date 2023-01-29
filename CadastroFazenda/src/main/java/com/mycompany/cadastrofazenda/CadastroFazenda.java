/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastrofazenda;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import view.JFPrincipal;

/**
 *
 * @author wesly
 */
public class CadastroFazenda {

    public static void main(String[] args) {
        EntityManagerFactory fb = Persistence.createEntityManagerFactory("animais");
        EntityManager ger = fb.createEntityManager();
       JFPrincipal tp = new JFPrincipal();
        tp.setVisible(true);
        /*
       // cadastro raça
         Raca r = new Raca();
         r.setNome("Boizebu");
        ger.getTransaction().begin();
        ger.persist(r);
        ger.getTransaction().commit();
        
        //cadastro sexo
         Sexo s = new Sexo();
        s.setNome("Masculino");
        ger.getTransaction().begin();
        ger.persist(s);
        ger.getTransaction().commit();
        
        //cadastro ANimal
         Animal a4 = new Animal();
         a4.setRacaId(r);
         a4.setSexoId(s);
        ger.getTransaction().begin();
        ger.persist(a4);
        ger.getTransaction().commit();
        
        Animal aa = new Animal();
         aa.setRacaId(r);
         aa.setSexoId(s);
        ger.getTransaction().begin();
        ger.persist(aa);
        ger.getTransaction().commit();
        
        Animal a2 = new Animal();
         a2.setRacaId(r);
         a2.setSexoId(s);
        ger.getTransaction().begin();
        ger.persist(a2);
        ger.getTransaction().commit();
        
        Animal a3 = new Animal();
         a3.setRacaId(r);
         a3.setSexoId(s);
        ger.getTransaction().begin();
        ger.persist(a3);
        ger.getTransaction().commit();
        
        //cadastro bovino
        Bovino b = new Bovino();
        b.setAnimalId(a4);
        ger.getTransaction().begin();
        ger.persist(b);
        ger.getTransaction().commit();
        
        //cadastro ave
        Ave av = new Ave();
        av.setAnimalId(aa);
        ger.getTransaction().begin();
        ger.persist(av);
        ger.getTransaction().commit();
        
        //cadastro suino
        Suino su = new Suino();
        su.setAnimalId(a2);
        ger.getTransaction().begin();
        ger.persist(su);
        ger.getTransaction().commit();
        
        //cadastro equino
        Equino eq = new Equino();
        eq.setAnimalId(a3);
        ger.getTransaction().begin();
        ger.persist(eq);
        ger.getTransaction().commit();
        
        fb.close();
        ger.close();

        Raca r = ger.find(Raca.class, 5);
        System.out.println("Raca: "+ r);
        Sexo s = ger.find(Sexo.class, 6);
        System.out.println("Sexo: "+ s);
        
         Animal a = ger.find(Animal.class, 13);
        System.out.println("Animal: "+ a);
        Suino b = ger.find(Suino.class, 2);
        System.out.println("Suino: "+ b);
*/
    }
}
