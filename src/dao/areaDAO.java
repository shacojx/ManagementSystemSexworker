/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.area;
import entity.mem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shaco JX
 */
public class areaDAO extends DBContent<area> {

    @Override
    public ArrayList<area> getAll() {
        ArrayList<area> arealist = new ArrayList<>();

        try {
            String query = "SELECT [id_area]\n"
                    + "      ,[area]\n"
                    + "  FROM [area]";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id_area = rs.getInt("id_area");
                String area = rs.getString("area");

                area a = new area(id_area, area);
                arealist.add(a);

            }
        } catch (Exception ex) {
            Logger.getLogger(areaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return arealist;
    }

    @Override
    public area get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(area entity) {
        try {
            String query = "INSERT INTO [dbo].[area]\n"
                    + "           ([id_area]\n"
                    + "           ,[area])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?)";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, entity.getId_area());
            statement.setString(2, entity.getArea());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(areaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(area entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(area entity) {
        try {
            String query = "DELETE FROM [area]\n"
                    + "      WHERE [id_area] = ?";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, entity.getId_area());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(areaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
