/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanvu.poly.model;

import java.util.Date;

/**
 *
 * @author NGUYEN VAN VU
 */
public class Voucher {
    private String maVoucher;
    private String tenVoucher;
    private float triGia;
    private float giaToiThieu;
    private Date ngayBD;
    private Date ngayKT;
    private String ghiChu;

    public Voucher() {
    }

    public Voucher(String maVoucher, String tenVoucher, float triGia, float giaToiThieu, Date ngayBD, Date ngayKT, String ghiChu) {
        this.maVoucher = maVoucher;
        this.tenVoucher = tenVoucher;
        this.triGia = triGia;
        this.giaToiThieu = giaToiThieu;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.ghiChu = ghiChu;
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public String getTenVoucher() {
        return tenVoucher;
    }

    public void setTenVoucher(String tenVoucher) {
        this.tenVoucher = tenVoucher;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }

    public float getGiaToiThieu() {
        return giaToiThieu;
    }

    public void setGiaToiThieu(float giaToiThieu) {
        this.giaToiThieu = giaToiThieu;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
