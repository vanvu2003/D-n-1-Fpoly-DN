/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanvu.poly.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vanvu.poly.help.DatabaseHelper;
import vanvu.poly.help.ShareHelper;
import vanvu.poly.model.Users;

/**
 *
 * @author NGUYEN VAN VU
 */
public class UserDAO {
    public boolean checkLogin(String username, String password) {
        String sql = "select * from Users where userID = ? and matKhau = ?";
        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setString(1, username);
            pstm.setString(2, password);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                Users us = new Users();
                us.setUserID(rs.getString(1));
                us.setHoTen(rs.getString(2));
                us.setGioiTinh(rs.getBoolean(3));
                us.setEmail(rs.getString(4));
                us.setSđt(rs.getString(5));
                us.setVaiTro(rs.getBoolean(6));
                us.setMatKhau(rs.getString(7));
                
                ShareHelper.username = rs.getString(1);
                ShareHelper.password = rs.getString(7);
                ShareHelper.name = rs.getString(2);
                ShareHelper.vaiTro =rs.getBoolean(6);
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insert(Users user){
        String sql = "INSERT INTO [dbo].[Users]\n" +
"           ([userID]\n" +
"           ,[hoTen]\n" +
"           ,[gioiTinh]\n" +
"           ,[email]\n" +
"           ,[SĐT]\n" +
"           ,[vaiTro]\n" +
"           ,[matKhau])\n" +
"     VALUES\n" +
"           (?,?,?,?,?,?,?)";
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, user.getUserID());
            pstmt.setString(2, user.getHoTen());
            pstmt.setBoolean(3, user.isGioiTinh());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getSđt());
            pstmt.setBoolean(6, user.isVaiTro());
            pstmt.setString(7, user.getMatKhau());
            
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean update(Users user){
        String sql = "UPDATE [dbo].[Users]\n"
                + "   SET hoTen=?,gioiTinh=?,email = ?, SĐT =?, vaiTro = ?, matKhau = ? WHERE userID = ?";
        
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, user.getHoTen());
            pstmt.setBoolean(2, user.isGioiTinh());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getSđt());
            pstmt.setBoolean(5, user.isVaiTro());
            pstmt.setString(6, user.getMatKhau());
            pstmt.setString(7, user.getUserID());
            
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean delete(String userID){
        String sql = "delete from Users where userID = ?";
        
        try (Connection con = DatabaseHelper.openConnection();PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, userID);
            
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean changePass(String userID, String newPass){
        String sql = "UPDATE [dbo].[Users]\n"
                + "   SET [matKhau] = ?\n"
                + "   WHERE [userID] = ?";
        
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, newPass);
            pstmt.setString(2, userID);
            
            return pstmt.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Users findByMaNV(String maNV){
        String sql = "select * from Users where userID like ?";
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, maNV);
            
            ResultSet rs = pstmt.executeQuery();
            Users us = new Users();
            if(rs.next()){
                us.setUserID(rs.getString(1));
                us.setHoTen(rs.getString(2));
                us.setGioiTinh(rs.getBoolean(3));
                us.setEmail(rs.getString(4));
                us.setSđt(rs.getString(5));
                us.setVaiTro(rs.getBoolean(6));
                us.setMatKhau(rs.getString(7));
                
            }   
            return us;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
