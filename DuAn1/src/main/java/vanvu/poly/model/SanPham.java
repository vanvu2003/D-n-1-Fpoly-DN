/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanvu.poly.model;

/**
 *
 * @author NGUYEN VAN VU
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private float gia;
    private String hinh;
    private String ghiChu;
    private int maLoai;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, float gia, String hinh, String ghiChu, int maLoai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.hinh = hinh;
        this.ghiChu = ghiChu;
        this.maLoai = maLoai;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }
    
    
}
