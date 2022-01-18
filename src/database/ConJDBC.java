package database;

import enity.Device;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConJDBC {
    static String url ="jdbc:mysql://localhost:3306/qltbcd";
    static String user = "root";
    static String password = "";


    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection= DriverManager.getConnection(url,user,password);
        }catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error");
        }


        return connection;
    }
    ///table1 them sua xoa tim kiem
    public static List<Device> getAll(){
        List<Device>deviceList = new ArrayList<>();
        String query = "Select * from device";
        try {
            Connection connection= getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Device st = new Device(rs.getInt("id"),rs.getString("name"),rs.getString("position"),rs.getString("statuss"),
                        rs.getString("note"));
                deviceList.add(st);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return deviceList;

    }
    public static void insert(Device dv){
        String query = "INSERT INTO device(id, name, position, statuss, note) VALUES (?,?,?,?,?)";
        try{
            Connection connection = getConnection();
            PreparedStatement pstmt =connection.prepareStatement(query);
            pstmt.setInt(1,dv.getId());
            pstmt.setString(2,dv.getName());
            pstmt.setString(3,dv.getPosition());
            pstmt.setString(4,dv.getStatus());
            pstmt.setString(5,dv.getNote());
            pstmt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
    public static void update(Device dv){
        String query = "UPDATE set id = ?, name=? , position=?, statuss=?,note=? where id='\"+ dv.getId()";
        try{
            Connection connection = getConnection();
            PreparedStatement pstmt =connection.prepareStatement(query);
            pstmt.setInt(1,dv.getId());
            pstmt.setString(2,dv.getName());
            pstmt.setString(3,dv.getPosition());
            pstmt.setString(4,dv.getStatus());
            pstmt.setString(5,dv.getNote());
            pstmt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
    public static  void delete(Device ct){
        String query="delete from device where id='"+ct.getId()+"'";
        try{
            Connection connection =getConnection();
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.executeUpdate();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static List<Device>findByID(Device s) {
        List<Device>deviceList1= new ArrayList<>();
        String query="select*from device where device.id='"+s.getId()+"'";
        try {
            Connection connection= getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Device st = new Device(rs.getInt("id"),rs.getString("name"),rs.getString("position"),rs.getString("statuss"),
                        rs.getString("note"));
                deviceList1.add(st);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return deviceList1;

    }

}
