/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.implement.BovinoDaoJDBC;
import db.DB;

/**
 *
 * @author wesly
 */
public class DaoFactory {
    public static AnimalDao createAnimalDao() {
		return new BovinoDaoJDBC(DB.getConnection());
	}
	
	
}
