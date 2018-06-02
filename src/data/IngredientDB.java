/**
 * 
 */
package data;

import beans.Ingredient;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import sql.ConnectToSQL;
//import business.Ingredient;

/**
 *
 * @author Tender
 */
public class IngredientDB {
    public static int insert(Ingredient ingredient) throws SQLException {

        
        PreparedStatement ps = null;
        String query = "INSERT INTO Ingredient (IngredientName, ServingSize, Calories, Fat, Cholesterol, Sodium, Carbohydrates, Fiber, Protein) "
                        + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            
            ps.setString(1, ingredient.getName());
            ps.setDouble(2, ingredient.getServingSize());
            ps.setDouble(3, ingredient.getCalories());
            ps.setDouble(4, ingredient.getFat());
            ps.setDouble(5, ingredient.getCholesterol());
            ps.setDouble(6, ingredient.getSodium());
            ps.setDouble(7, ingredient.getCarbohydrates());
            ps.setDouble(8, ingredient.getFiber());
            ps.setDouble(9, ingredient.getProtein());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.print("IngredientDB:insert:try-catch: " + e);
            return 0;
        } finally {
            
        }
    }    

    public static int update(Ingredient ingredient) {
        
        PreparedStatement ps = null;
        String query = "UPDATE Ingredient SET "
                + "ServingSize = ?, "
                + "Calories = ?, "
                + "Fat = ?, "
                + "Cholesterol = ?, "
                + "Sodium = ?, "
                + "Carbohydrates = ?, "
                + "Fiber = ?, "
                + "Protein = ?, "
                + "WHERE IngredientName = ?";
        try {
            
            ps.setDouble(1, ingredient.getServingSize());
            ps.setDouble(2, ingredient.getCalories());
            ps.setDouble(3, ingredient.getFat());
            ps.setDouble(4, ingredient.getCholesterol());
            ps.setDouble(5, ingredient.getSodium());
            ps.setDouble(6, ingredient.getCarbohydrates());
            ps.setDouble(7, ingredient.getFiber());
            ps.setDouble(8, ingredient.getProtein());
            ps.setString(9, ingredient.getName());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.print("IngredientDB:update:try-catch: " + e);
            return 0;
        } finally {
            
        }       
    }

    public static int delete(Ingredient ingredient) {
        
        PreparedStatement ps = null;
        String query = "DELETE FROM Ingredient "
                + "WHERE IngredientName = ?";
        try {
            
            ps.setString(1, ingredient.getName());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.err.print("IngredientDB:delete:try-catch: " + e);
            return 0;
        } finally {
            
        }             
    }
    
    // retrieves ingredient user specified
    public static Ingredient selectIngredient(String ingredientName) throws SQLException {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT * FROM Ingredient "
                + "WHERE IngredientName = ?";  
        try {
            
            ps.setString(1, ingredientName);
            rs = ps.executeQuery();
            Ingredient ingredient = null;
            if (rs.next()) {
                ingredient = new Ingredient();
                ingredient.setName(rs.getString("IngredientName"));
                ingredient.setServingSize(rs.getInt("ServingSize"));
                ingredient.setCalories(rs.getDouble("Calories"));
                ingredient.setFat(rs.getDouble("Fat"));
                ingredient.setCholesterol(rs.getDouble("Cholesterol"));
                ingredient.setSodium(rs.getDouble("Sodium"));
                ingredient.setCarbohydrates(rs.getDouble("Carbohydrates"));
                ingredient.setFiber(rs.getDouble("Fiber"));
                ingredient.setProtein(rs.getDouble("Protein"));
                return ingredient;
            } else {
                return null;
            }            
        } catch (SQLException e) {
            System.err.println("IngredientDB:selectIngredient-name:try-catch: " + e);
            return null;
        } finally {
//            DBUtil.closeResultSet(rs);
//            DBUtil.closePreparedStatement(ps);
//            pool.freeConnection(connection);
        }
    }
    
        public static boolean ingredientExists(String ingredientName) {
//        ConnectToSQL pool = ConnectToSQL.getInstance();
//        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT IngredientName FROM Ingredient "
                + "WHERE IngredientName = ?";  
        try {
//            ps = connection.prepareStatement(query);
            ps.setString(1, ingredientName);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.err.print("IngredientDB:ingredientExists-boolean:try-catch: " + e);
            return false;
        } finally {
//            DBUtil.closeResultSet(rs);
//            DBUtil.closePreparedStatement(ps);
//            pool.freeConnection(connection);
        }            
    }
}
