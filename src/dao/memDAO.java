/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.mem;
import java.sql.Date;
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
public class memDAO extends DBContent<mem> {

    @Override
    public ArrayList<mem> getAll() {

        ArrayList<mem> memlist = new ArrayList<>();

        try {
            String query = "SELECT [id]\n"
                    + "      ,[name]\n"
                    + "      ,[year]\n"
                    + "      ,[phone]\n"
                    + "      ,[price]\n"
                    + "      ,[id_area]\n"
                    + "      ,[height]\n"
                    + "      ,[vong1]\n"
                    + "      ,[vong2]\n"
                    + "      ,[vong3]\n"
                    + "      ,[service]\n"
                    + "  FROM [mem]";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int year = rs.getInt("year");
                String phone = rs.getString("phone");
                int price = rs.getInt("price");
                int id_area = rs.getInt("id_area");
                String height = rs.getString("height");
                int vong1 = rs.getInt("vong1");
                int vong2 = rs.getInt("vong2");
                int vong3 = rs.getInt("vong3");
                String service = rs.getString("service");
                mem m = new mem(id, name, year, phone, price, id_area, height, vong1, vong2, vong3, service);
                memlist.add(m);

            }
        } catch (Exception ex) {
            Logger.getLogger(memDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return memlist;
    }

    @Override
    public mem get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(mem entity) {
        try {
            String query = "INSERT INTO [mem]\n"
                    + "           ([id]\n"
                    + "           ,[name]\n"
                    + "           ,[year]\n"
                    + "           ,[phone]\n"
                    + "           ,[price]\n"
                    + "           ,[id_area]\n"
                    + "           ,[height]\n"
                    + "           ,[vong1]\n"
                    + "           ,[vong2]\n"
                    + "           ,[vong3]\n"
                    + "           ,[service])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, entity.getId());
            statement.setString(2, entity.getName());
            statement.setInt(3, entity.getYear());
            statement.setString(4, entity.getPhone());
            statement.setInt(5, entity.getPrice());
            statement.setInt(6, entity.getId_area());
            statement.setString(7, entity.getHeight());
            statement.setInt(8, entity.getVong1());
            statement.setInt(9, entity.getVong2());
            statement.setInt(10, entity.getVong3());
            statement.setString(11, entity.getService());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(memDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(mem entity) {
        try {
            String query = "UPDATE [mem]\n"
                    + "   SET [name] = ?\n"
                    + "      ,[year] = ?\n"
                    + "      ,[phone] = ?\n"
                    + "      ,[price] = ?\n"
                    + "      ,[id_area] = ?\n"
                    + "      ,[height] = ?\n"
                    + "      ,[vong1] = ?\n"
                    + "      ,[vong2] = ?\n"
                    + "      ,[vong3] = ?\n"
                    + "      ,[service] = ?\n"
                    + " WHERE [id] = ?";

            PreparedStatement statement = connection.prepareStatement(query);

           
            statement.setString(1, entity.getName());
            statement.setInt(2, entity.getYear());
            statement.setString(3, entity.getPhone());
            statement.setInt(4, entity.getPrice());
            statement.setInt(5, entity.getId_area());
            statement.setString(6, entity.getHeight());
            statement.setInt(7, entity.getVong1());
            statement.setInt(8, entity.getVong2());
            statement.setInt(9, entity.getVong3());
            statement.setString(10, entity.getService());
             statement.setInt(11, entity.getId());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(memDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(mem entity) {
        try {
            String query = "DELETE FROM [mem]\n"
                    + "      WHERE [id] = ?";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, entity.getId());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(memDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
