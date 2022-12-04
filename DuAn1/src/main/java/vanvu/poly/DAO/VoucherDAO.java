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
import vanvu.poly.model.Voucher;

/**
 *
 * @author NGUYEN VAN VU
 */
public class VoucherDAO {

    public List<Voucher> fillAll() {
        ArrayList<Voucher> list = new ArrayList<>();
        String sql = "select * from Voucher";
        try ( Connection con = DatabaseHelper.openConnection();  Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Voucher vch = new Voucher();

                vch.setMaVoucher(rs.getString(1));
                vch.setTenVoucher(rs.getString(2));
                vch.setTriGia(rs.getFloat(3));
                vch.setGiaToiThieu(rs.getFloat(4));
                vch.setNgayBD(rs.getDate(5));
                vch.setNgayKT(rs.getDate(6));
                vch.setGhiChu(rs.getString(7));

                list.add(vch);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Voucher> fillVoucherByDate(){
        ArrayList<Voucher> list = new ArrayList<>();
        String sql = "select * from Voucher where CONVERT(date,GETDATE()) >= ngayBD and CONVERT(date,GETDATE()) < ngayKT";
        try ( Connection con = DatabaseHelper.openConnection();  Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Voucher vch = new Voucher();

                vch.setMaVoucher(rs.getString(1));
                vch.setTenVoucher(rs.getString(2));
                vch.setTriGia(rs.getFloat(3));
                vch.setGiaToiThieu(rs.getFloat(4));
                vch.setNgayBD(rs.getDate(5));
                vch.setNgayKT(rs.getDate(6));
                vch.setGhiChu(rs.getString(7));

                list.add(vch);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean insert(Voucher vch) {
        String sql = "INSERT INTO [dbo].[Voucher]\n"
                + "           ([maVoucher]\n"
                + "           ,[tenVoucher]\n"
                + "           ,[triGia]\n"
                + "           ,[giaToiThieu]\n"
                + "           ,[ngayBD]\n"
                + "           ,[ngayKT]\n"
                + "           ,[ghiChu])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";

        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, vch.getMaVoucher());
            pstmt.setString(2, vch.getTenVoucher());
            pstmt.setFloat(3, vch.getTriGia());
            pstmt.setFloat(4, vch.getGiaToiThieu());
            pstmt.setObject(5, vch.getNgayBD());
            pstmt.setObject(6, vch.getNgayKT());
            pstmt.setString(7, vch.getGhiChu());

            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Voucher vch) {
        String sql = "UPDATE [dbo].[Voucher]\n"
                + "   SET [tenVoucher] = ?\n"
                + "      ,[triGia] = ?\n"
                + "      ,[giaToiThieu] = ?\n"
                + "      ,[ngayBD] = ?\n"
                + "      ,[ngayKT] = ?\n"
                + "      ,[ghiChu] = ?\n"
                + " WHERE maVoucher = ?";

        try ( Connection con = DatabaseHelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, vch.getTenVoucher());
            pstmt.setFloat(2, vch.getTriGia());
            pstmt.setFloat(3, vch.getGiaToiThieu());
            pstmt.setObject(4, vch.getNgayBD());
            pstmt.setObject(5, vch.getNgayKT());
            pstmt.setString(6, vch.getGhiChu());
            pstmt.setString(7, vch.getMaVoucher());

            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
       public boolean delete(String maVoucher){
        String sql = "delete from Voucher where maVoucher = ?";
        
        try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, maVoucher);
            
            return pstmt.executeUpdate() >0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
       
       public Voucher findByMaVoucher(String maVoucher){
           String sql = "select * from Voucher where maVoucher like ?";
           
           try(Connection con = DatabaseHelper.openConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
               pstmt.setString(1, "%"+ maVoucher + "%");
               
               ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Voucher vch = new Voucher();

                vch.setMaVoucher(rs.getString(1));
                vch.setTenVoucher(rs.getString(2));
                vch.setTriGia(rs.getFloat(3));
                vch.setGiaToiThieu(rs.getFloat(4));
                vch.setNgayBD(rs.getDate(5));
                vch.setNgayKT(rs.getDate(6));
                vch.setGhiChu(rs.getString(7));
                
                return vch;
            }
            
           } catch (Exception e) {
               e.printStackTrace();
           }
           return null;
       }
}
