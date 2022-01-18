package database;

import enity.Device;
import enity.DeviceB;

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
        String query = "UPDATE device set  id = ?, name=? , position=?, statuss = ?,note = ? where id = "+ dv.getId();
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
        catch(SQLException ex){


                JOptionPane.showMessageDialog(null,"Some thing wear Wrong");

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
    public static void insertb(DeviceB dv){
        String query = "INSERT INTO deviceb (id, name, position, statuss,datee, note) VALUES (?,?,?,?,?,?)";
        try{
            Connection connection = getConnection();
            PreparedStatement pstmt =connection.prepareStatement(query);
            pstmt.setInt(1,dv.getId());
            pstmt.setString(2,dv.getName());
            pstmt.setString(3,dv.getPosition());
            pstmt.setString(4,dv.getStatus());
            pstmt.setString(5,dv.getDate());
            pstmt.setString(6,dv.getNote());
            pstmt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
    public static List<DeviceB> getAllB(){
        List<DeviceB>deviceList = new ArrayList<>();
        String query = "Select * from deviceb";
        try {
            Connection connection= getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                DeviceB st = new DeviceB(rs.getInt("id"),rs.getString("name"),rs.getString("position"),rs.getString("statuss"),rs.getString("datee"),
                        rs.getString("note"));
                deviceList.add(st);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return deviceList;

    }
    public static int countDevice(){
        int sum =0;
        String query = "select count(id) as 'count' from device ";
        try {
            Connection connection= getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                sum =  rs.getInt("count");
            }

        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Some Things Were Wrong@");
        }
        return sum;
    }
    public static int countDeviceB(){
        int sum =0;
        String query = "select count(id) as 'count' from deviceb ";
        try {
            Connection connection= getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                sum =  rs.getInt("count");
            }

        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Some Things Were Wrong@");
        }
        return sum;
    }

}


