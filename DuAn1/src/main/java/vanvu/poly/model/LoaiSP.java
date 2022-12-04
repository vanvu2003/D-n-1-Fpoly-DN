/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanvu.poly.model;

/**
 *
 * @author NGUYEN VAN VU
 */
public class LoaiSP {
    private int maSP;
    private String tenSP;

    public LoaiSP() {
    }

    public LoaiSP(int maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    
    
}
