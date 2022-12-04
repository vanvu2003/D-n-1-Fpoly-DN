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
public class HoaDon {
    private int maHD;
    private String tenKH;
    private String maNV;
    private Date ngayTao;
    private String trangThai;
    private float tongTien;

    public HoaDon() {
    }

    public HoaDon(int maHD, String tenKH, String maNV, Date ngayTao, String trangThai, float tongTien) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.tongTien = tongTien;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    

    
    
}
