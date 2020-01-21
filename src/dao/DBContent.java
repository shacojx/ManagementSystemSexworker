/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.IEntity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shaco JX
 */
public abstract class DBContent<T extends IEntity> {
    
    
    public Connection connection;
    public DBContent()
    {
        String url = "jdbc:sqlserver://DESKTOP-O483PDI\\SHACOJX:1433;databaseName=Pho";
        String username = "shacojx";
        String password = "24061997";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public abstract ArrayList<T> getAll();
    public abstract T get(int id);
    public abstract void insert(T entity);
    public abstract void update(T entity);
    public abstract void delete(T entity);
}