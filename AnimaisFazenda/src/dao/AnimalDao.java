/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Animal;

/**
 *
 * @author wesly
 */
public interface AnimalDao {
    void insert(Animal obj);
    void update(Animal obj);
    void deleteById(Integer id);
    void findById(Integer id);
    List<Animal> findAll();
    
}
