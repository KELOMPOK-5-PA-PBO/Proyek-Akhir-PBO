/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.SQLException;
import model.databaseConnection;

/**
 *
 * @author HP
 */
public final class admin {
    private final databaseConnection db = new databaseConnection();
    
    public String username;
    public String password;
    
    public final boolean login() {
        boolean isOperationSuccess = false;
        try {
            this.db.openConnection();
        
            String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
            
            this.db.preparedStatement = this.db.connection.prepareStatement(sql);
            
            this.db.preparedStatement.setString(1, username);
            this.db.preparedStatement.setString(2, password);
            
            this.db.resultSet = this.db.preparedStatement.executeQuery();
            
            if (this.db.resultSet.next()) {
                isOperationSuccess = true;
            }

        }catch (SQLException ex) {
            this.db.displayErrors(ex);
        }finally {
            this.db.closeConnection();
        }
        return isOperationSuccess;
    } 
    } 
    
        

