/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanvu.poly.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import vanvu.poly.help.DatabaseHelper;
import vanvu.poly.model.CTHoaDon;

/**
 *
 * @author NGUYEN VAN VU
 */
public class CTHoaDonDAO {

    public boolean insert(CTHoaDon cthd) {
        String sql = "INSERT INTO [dbo].[ChiTietHD]\n"
                + "           ([maHD]\n"
                + "           ,[maSP]\n"
                + "           ,[soLuong]\n"
                + "           ,[tongTien]\n"
                + "           ,[ghiChu])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, cthd.getMaHD());
            pstmt.setString(2, cthd.getMaSP());
            pstmt.setInt(3, cthd.getSoLuong());
            pstmt.setFloat(4, cthd.getTongTien());
            pstmt.setString(5, cthd.getGhiChu());
            
            return pstmt.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void delete(int maHD){
        String sql = "delete from ChiTietHD where maHD = ?";
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, maHD);
            
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteSP(int maHD,String maSP){
        String sql = "delete from ChiTietHD where maHD = ? and maSP =?";
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, maHD);
            pstmt.setString(2, maSP);
            
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Object[]> fillSPbyidHD(int maHD){
        List<Object[]> list = new ArrayList<>();
        String sql = "select b.tenSP,b.gia,a.soLuong,(b.gia*a.soLuong) from ChiTietHD a inner join SanPham b on a.maSP =b.maSP where maHD = ?";
        
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, maHD);
            
            ResultSet rs =  pstmt.executeQuery();
            
            while(rs.next()){
                Object[] obj = {rs.getString(1),rs.getFloat(2),rs.getInt(3),rs.getFloat(4)};
                list.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
