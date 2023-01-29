/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.implement;

import dao.AnimalDao;
import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Animal;
import model.Bovino;


/**
 *
 * @author wesly
 */
public class BovinoDaoJDBC implements AnimalDao{
    private Connection conn;

    public BovinoDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Animal obj) {
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement(
                    "INSERT INTO bovino"
                    +"(raca, sexo) "
                    + "VALUES "
                    + "(?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getRaca());
            st.setString(2, obj.getSexo());
            
            int rowsAffected = st.executeUpdate();
            
            if(rowsAffected > 0){
                ResultSet res = st.getGeneratedKeys();
                if(res.next()){
                    int id =res.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(res);
            }else{
                throw new DbException("Erro inesperado! Nenhuma linha afetada!");
            }
        }catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
        finally {
			DB.closeStatement(st);
		}
    }

    @Override
    public void update(Animal obj) {
         PreparedStatement st = null;
        try{
            st = conn.prepareStatement(
                    "UPDATE bovino"
                    +"SET raca = ?, sexo = ? "
                    + "WHERE Id = ?");
            st.setString(1, obj.getRaca());
            st.setString(2, obj.getSexo());
            
            st.executeUpdate();
        }
        catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM seller WHERE Id = ?");
			
			st.setInt(1, id);
			
			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
    }

    @Override
    public void findById(Integer id) {
        PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT bovino.*, raca as raca"
					+ "FROM bovino INNER JOIN raca "
					+ "ON seller.Id = raca"
					+ "WHERE bovino.Id = ?");
			
			st.setInt(1, id);
			rs = st.executeQuery();
			
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
    }

    @Override
    public List<Animal> findAll() {
        PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT bovino.*,raca as raca "
					+ "FROM bovino INNER JOIN raca "
					+ "ON bovino.id = raca "
					+ "ORDER BY raca");
			
			rs = st.executeQuery();
			
			List<Bovino> list = new ArrayList<>();
			Map<Integer, Bovino> map = new HashMap<>();
			
			while (rs.next()) {
				
				Bovino dep = map.get(rs.getInt("BovinoId"));
				
				
				list.add(dep);
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}
    }

   
    
    
    

