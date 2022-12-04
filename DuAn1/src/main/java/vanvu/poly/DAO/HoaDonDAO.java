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
import vanvu.poly.model.HoaDon;

/**
 *
 * @author NGUYEN VAN VU
 */

public class HoaDonDAO {
    public static float sumHD = 0;
    public List<HoaDon> fillAll(){
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon where trangThai like ?";
        
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, "Đã thanh toán");
            
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                HoaDon hd = new HoaDon();
                
                hd.setMaHD(rs.getInt(1));
                hd.setTenKH(rs.getString(2));
                hd.setMaNV(rs.getString(3));
                hd.setNgayTao(rs.getDate(4));
                hd.setTrangThai(rs.getString(5));
                hd.setTongTien(rs.getFloat(6));
                
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<HoaDon> fillByTrangThai(String trangThai) {
        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon where trangThai like ?";

        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, "%" + trangThai + "%");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                HoaDon hd = new HoaDon();

                hd.setMaHD(rs.getInt(1));
                hd.setTenKH(rs.getString(2));
                hd.setMaNV(rs.getString(3));
                hd.setNgayTao(rs.getDate(4));
                hd.setTrangThai(rs.getString(5));

                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    public boolean insert(HoaDon hd) {
        String sql = "INSERT INTO [dbo].[HoaDon]\n"
                + "           ([maHD]\n"
                + "           ,[tenKH]\n"
                + "           ,[maNV]\n"
                + "           ,[ngayTao]\n"
                + "           ,[trangThai])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";

        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, hd.getMaHD());
            pstmt.setString(2, hd.getTenKH());
            pstmt.setString(3, hd.getMaNV());
            pstmt.setObject(4, hd.getNgayTao());
            pstmt.setString(5, hd.getTrangThai());

            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Object[]> findByID(int maHD) {
        List<Object[]> list = new ArrayList<>();
        
        String sql = "select c.tenSP,c.gia,b.soLuong from HoaDon a inner join ChiTietHD b on a.maHD = b.maHD \n"
                + "inner join SanPham c on b.maSP = c.maSP where b.maHD = ?";

        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, maHD);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Object[] str = {rs.getString(1), rs.getFloat(2), rs.getInt(3), (rs.getFloat(2) * rs.getInt(3))};
                sumHD = sumHD+(rs.getFloat(2) * rs.getInt(3));
                list.add(str);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateTrangThai(int maHD, float tongtien) {
        String sql = "UPDATE [dbo].[HoaDon]\n"
                + "   SET trangThai = ?, tongTien = ?\n"
                + " WHERE maHD = ?";

        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, "Đã thanh toán");
            pstmt.setFloat(2, tongtien);
            pstmt.setInt(3, maHD);

            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<HoaDon> fillByDate(String date) {
        List<HoaDon> list = new ArrayList<>();
        String sql = "select * from HoaDon where ngayTao = ?";

        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, date);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                HoaDon hd = new HoaDon();

                hd.setMaHD(rs.getInt(1));
                hd.setTenKH(rs.getString(2));
                hd.setMaNV(rs.getString(3));
                hd.setNgayTao(rs.getDate(4));
                hd.setTrangThai(rs.getString(5));

                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }
}
