/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanvu.poly.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import vanvu.poly.help.DatabaseHelper;
import vanvu.poly.model.LoaiSP;
import vanvu.poly.model.SanPham;

/**
 *
 * @author NGUYEN VAN VU
 */

public class SanPhamDAO {
    
    public List<SanPham> fillAll(){
        List<SanPham> list = new ArrayList<>();
        String sql = "select * from SanPham";
        
        try(Connection con = DatabaseHelper.openConnection(); Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                SanPham sp = new SanPham();
                
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setGia(rs.getFloat(3));
                sp.setHinh(rs.getString(4));
                sp.setGhiChu(rs.getString(5));
                sp.setMaLoai(rs.getInt(6));
                
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<LoaiSP> selectLoaiSP(){
        List<LoaiSP> listSP = new ArrayList<>();
        String sql = "select * from LoaiSP";
        
        try(Connection con = DatabaseHelper.openConnection(); Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                LoaiSP lsp = new LoaiSP();
                
                lsp.setMaSP(rs.getInt(1));
                lsp.setTenSP(rs.getString(2));
                listSP.add(lsp);
            }
            return listSP;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean insert (SanPham sp){
        String sql = "INSERT INTO [dbo].[SanPham]\n" +
"           ([maSP]\n" +
"           ,[tenSP]\n" +
"           ,[gia]\n" +
"           ,[hinh]\n" +
"           ,[ghiChu]\n" +
"           ,[maLoai])\n" +
"     VALUES\n" +
"           (?,?,?,?,?,?)";
        
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, sp.getMaSP());
            pstmt.setString(2, sp.getTenSP());
            pstmt.setFloat(3, sp.getGia());
            pstmt.setString(4, sp.getHinh());
            pstmt.setString(5, sp.getGhiChu());
            pstmt.setInt(6, sp.getMaLoai());
            
            return pstmt.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean update(SanPham sp){
        String sql = "UPDATE [dbo].[SanPham]\n"
                + "   SET tenSP=?,gia=?,hinh = ?, ghiChu =?, maLoai = ? WHERE maSP = ?";
        
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, sp.getTenSP());
            pstmt.setFloat(2, sp.getGia());
            pstmt.setString(3, sp.getHinh());
            pstmt.setString(4, sp.getGhiChu());
            pstmt.setInt(5, sp.getMaLoai());
            pstmt.setString(6, sp.getMaSP());
            
            return pstmt.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean delete(String maSP){
        String sql = "delete from SanPham where maSP = ?";
        
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, maSP);
            
            return pstmt.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<SanPham> findByName(String name){
        List<SanPham> list = new ArrayList<>();
        String sql = "select * from SanPham where tenSP like ?";
        try(Connection con = DatabaseHelper.openConnection();PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1,"%"+ name + "%");
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                SanPham sp = new SanPham();
                
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setGia(rs.getFloat(3));
                sp.setHinh(rs.getString(4));
                sp.setGhiChu(rs.getString(5));
                sp.setMaLoai(rs.getInt(6));
                
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<SanPham> findByTenLoai(int maLoai){
        List<SanPham> list = new ArrayList<>();
        String sql = "select * from SanPham where maLoai = ?";
        try(Connection con = DatabaseHelper.openConnection();PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1,maLoai);
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                SanPham sp = new SanPham();
                
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setGia(rs.getFloat(3));
                sp.setHinh(rs.getString(4));
                sp.setGhiChu(rs.getString(5));
                sp.setMaLoai(rs.getInt(6));
                
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public SanPham findByID(String maSP){
        String sql = "select * from SanPham where maSP = ?";
        try(Connection con = DatabaseHelper.openConnection();PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1,maSP);
            
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                SanPham sp = new SanPham();
                
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setGia(rs.getFloat(3));
                sp.setHinh(rs.getString(4));
                sp.setGhiChu(rs.getString(5));
                sp.setMaLoai(rs.getInt(6));
                
                return sp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
