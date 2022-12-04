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
import vanvu.poly.model.HoaDon;
import vanvu.poly.model.SanPham;

/**
 *
 * @author NGUYEN VAN VU
 */
public class ThongKeDAO {

    public int countHDNow() {
        String sql = "select COUNT(maHD) from HoaDon where ngayTao = CONVERT(date,GETDATE())";
        try ( Connection con = DatabaseHelper.openConnection();  Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                int count = rs.getInt(1);

                return count;
            }
        } catch (Exception e) {

        }
        return 0;
    }

    public float sumMonnyNow() {
        String sql = "select SUM(b.soLuong*b.tongTien) from HoaDon a inner join ChiTietHD b on a.maHD = b.maHD where ngayTao = CONVERT(date,GETDATE())";
        try ( Connection con = DatabaseHelper.openConnection();  Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                float mony = rs.getInt(1);

                return mony;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<HoaDon> fillTableHDByThang(String thang) {
        List<HoaDon> list = new ArrayList<>();
        String sql = "select maHD,tenKH,b.hoTen,ngayTao from HoaDon a inner join Users b on a.maNV =b.userID where MONTH(ngayTao) = ? and trangThai like ?";

        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, thang);
            pstmt.setString(2, "Đã thanh toán");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                HoaDon hd = new HoaDon();

                hd.setMaHD(rs.getInt(1));
                hd.setTenKH(rs.getString(2));
                hd.setMaNV(rs.getString(3));
                hd.setNgayTao(rs.getDate(4));

                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<HoaDon> fillAllHD() {
        List<HoaDon> list = new ArrayList<>();
        String sql = "select maHD,tenKH,b.hoTen,ngayTao from HoaDon a inner join Users b on a.maNV =b.userID where trangThai like ?";

        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, "Đã thanh toán");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                HoaDon hd = new HoaDon();

                hd.setMaHD(rs.getInt(1));
                hd.setTenKH(rs.getString(2));
                hd.setMaNV(rs.getString(3));
                hd.setNgayTao(rs.getDate(4));

                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<SanPham> topSP() {
        List<SanPham> list = new ArrayList<>();
        String sql = "DECLARE @table1 Table(maSP nvarchar(50), sumSP int)\n"
                + "insert into @table1 select TOP (5) maSP, SUM(soLuong) from ChiTietHD group by maSP order by SUM(soLuong) desc\n"
                + "select a.* from SanPham a inner join @table1 b on a.maSP = b.maSP";
        
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
    
    public int countSPNow(){
        String sql = "select SUM(soLuong) from HoaDon a inner join ChiTietHD b on a.maHD=b.maHD where ngayTao = CONVERT(date,GETDATE()) and trangThai like N'Đã thanh toán'";
        
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            
            ResultSet rs = pstmt.executeQuery();
            int slSP;
            if(rs.next()){
                slSP = rs.getInt(1);
                return slSP;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public List<Object[]> doanhThuTheoNgay(){
        List<Object[]> list = new ArrayList<>();
        String sql = "select ngayTao, SUM((soLuong*b.tongTien)) from HoaDon a inner join ChiTietHD b on a.maHD = b.maHD group by ngayTao";
        
        try(Connection con =DatabaseHelper.openConnection(); Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Object[] obj = {rs.getDate(1),rs.getFloat(2)};
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Object[]> doanhThuTheoThang(){
        List<Object[]> list = new ArrayList<>();
        String sql = "select MONTH(ngayTao), SUM((soLuong*b.tongTien)) from HoaDon a inner join ChiTietHD b on a.maHD = b.maHD group by MONTH(ngayTao)";
        
        try(Connection con =DatabaseHelper.openConnection(); Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Object[] obj = {rs.getInt(1),rs.getFloat(2)};
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public int countHDMonth(String month) {
        String sql = "select COUNT(maHD) from HoaDon where MONTH(ngayTao) = ?";
        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, month);
            
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1);

                return count;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
