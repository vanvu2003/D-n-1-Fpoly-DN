/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vanvu.poly.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vanvu.poly.help.ShareHelper;

/**
 *
 * @author NGUYEN VAN VU
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    private JPanelNhanVien nhanvien;
    private JPanelSanPham sanpham;
    private JPanelHoaDon hoadon;
    private JPanelBanHang banhang;
    private JPanelThongKe thongke;
    private JPanelBieuDo bieudo;
    private JPanelVourcher vourcher;
    JDialogDangNhap dn = new JDialogDangNhap(null, true);

    public MainForm() {
        initComponents();

        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        dn.setVisible(true);
        setIconImage(ShareHelper.APP_ICON);
        Thread th = new Thread() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
                while (true) {
                    Date now = new Date();
                    String st = sdf.format(now);
                    lbClock.setText(st);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                }
            }

        };
        th.start();
        lbNameUser.setText(ShareHelper.name);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator9 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        btnDoiMK = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btnBanHang = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        btnHoaDon = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        btnSanPham = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        btnNhanVien = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNameUser = new javax.swing.JLabel();
        lbClock = new javax.swing.JLabel();
        tpMain = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuThoat = new javax.swing.JMenu();
        mnuDangNhap = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuDangXuat = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuDoiMK = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnuvourcher = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuDoanhThu = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnuBieuDo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ QUÁN ĂN VẶT");

        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");
        jToolBar1.setEnabled(false);

        btnDangXuat.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log-Out-icon.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);
        jToolBar1.add(jSeparator12);

        btnDoiMK.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        btnDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Users-Change-User-icon.png"))); // NOI18N
        btnDoiMK.setText("Đổi mật khẩu");
        btnDoiMK.setFocusable(false);
        btnDoiMK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoiMK.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMKActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDoiMK);
        jToolBar1.add(jSeparator13);

        btnExit.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close-2-icon.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);
        jToolBar1.add(jSeparator10);

        btnBanHang.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        btnBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Food-Dome-icon.png"))); // NOI18N
        btnBanHang.setText("Bán hàng");
        btnBanHang.setFocusable(false);
        btnBanHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBanHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBanHang);
        jToolBar1.add(jSeparator14);

        btnHoaDon.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Receipt-3-icon.png"))); // NOI18N
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.setFocusable(false);
        btnHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHoaDon);
        jToolBar1.add(jSeparator11);

        btnSanPham.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pork-Chop-Set-icon.png"))); // NOI18N
        btnSanPham.setText("Sản phẩm");
        btnSanPham.setFocusable(false);
        btnSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSanPham);
        jToolBar1.add(jSeparator15);

        btnNhanVien.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Occupations-Pizza-Deliveryman-Female-Light-icon.png"))); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setFocusable(false);
        btnNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNhanVien);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Male User_48px.png"))); // NOI18N

        lbNameUser.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lbNameUser.setText("Nguyễn Văn Vũ");

        lbClock.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Alarm Clock_48px.png"))); // NOI18N
        lbClock.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(lbClock, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNameUser)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNameUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbClock, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jToolBar1.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(192, 192, 192));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Screenshot 2022-11-13 100702.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel2)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        tpMain.addTab("HOME", jPanel1);

        mnuThoat.setText("Hệ thống");

        mnuDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Register-icon.png"))); // NOI18N
        mnuDangNhap.setText("Đăng nhập");
        mnuDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangNhapActionPerformed(evt);
            }
        });
        mnuThoat.add(mnuDangNhap);
        mnuThoat.add(jSeparator3);

        mnuDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log-Out-icon.png"))); // NOI18N
        mnuDangXuat.setText("Đăng xuất");
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        mnuThoat.add(mnuDangXuat);
        mnuThoat.add(jSeparator2);

        mnuDoiMK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Users-Change-User-icon.png"))); // NOI18N
        mnuDoiMK.setText("Đổi mật khẩu");
        mnuDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoiMKActionPerformed(evt);
            }
        });
        mnuThoat.add(mnuDoiMK);
        mnuThoat.add(jSeparator1);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close-2-icon.png"))); // NOI18N
        mnuExit.setText("Thoát");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuThoat.add(mnuExit);

        jMenuBar1.add(mnuThoat);

        jMenu2.setText("Quản lí");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pork-Chop-Set-icon.png"))); // NOI18N
        jMenuItem6.setText("Sản phẩm");
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator4);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Food-Dome-icon.png"))); // NOI18N
        jMenuItem8.setText("Báng hàng");
        jMenu2.add(jMenuItem8);
        jMenu2.add(jSeparator5);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Receipt-3-icon.png"))); // NOI18N
        jMenuItem10.setText("Hóa đơn");
        jMenu2.add(jMenuItem10);
        jMenu2.add(jSeparator6);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Occupations-Pizza-Deliveryman-Female-Light-icon.png"))); // NOI18N
        jMenuItem9.setText("Nhân viên");
        jMenu2.add(jMenuItem9);
        jMenu2.add(jSeparator7);

        mnuvourcher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pay-Per-Click-icon.png"))); // NOI18N
        mnuvourcher.setText("Vourcher");
        mnuvourcher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuvourcherActionPerformed(evt);
            }
        });
        jMenu2.add(mnuvourcher);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thông kê");

        mnuDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/statistics-market-icon.png"))); // NOI18N
        mnuDoanhThu.setText("Doanh thu");
        mnuDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoanhThuActionPerformed(evt);
            }
        });
        jMenu3.add(mnuDoanhThu);
        jMenu3.add(jSeparator8);

        mnuBieuDo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chart-icon.png"))); // NOI18N
        mnuBieuDo.setText(" Sơ đồ doanh thu");
        mnuBieuDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBieuDoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuBieuDo);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tpMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        if (ShareHelper.username != null) {
            if (banhang == null) {
                tpMain.removeAll();
                nhanvien = null;
                sanpham = null;
                hoadon = null;
                thongke = null;
                bieudo = null;
                vourcher = null;

                banhang = new JPanelBanHang();
                ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Food-Dome-icon.png"));
                tpMain.addTab("Bán hàng", icon, banhang);
            }
            tpMain.setSelectedComponent(banhang);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập!!");
            return;
        }
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        if (ShareHelper.username != null) {
            if (nhanvien == null) {
                tpMain.removeAll();
                sanpham = null;
                hoadon = null;
                banhang = null;
                thongke = null;
                bieudo = null;
                vourcher = null;

                nhanvien = new JPanelNhanVien();
                ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Occupations-Pizza-Deliveryman-Female-Light-icon.png"));
                tpMain.addTab("Quản lý nhân viên", icon, nhanvien);
            }
            tpMain.setSelectedComponent(nhanvien);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập!!");
            return;
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed

        if (ShareHelper.username != null) {
            if (hoadon == null) {
                tpMain.removeAll();
                nhanvien = null;
                sanpham = null;
                banhang = null;
                thongke = null;
                bieudo = null;
                vourcher = null;

                hoadon = new JPanelHoaDon();
                ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Receipt-3-icon.png"));
                tpMain.addTab("Hoá đơn", icon, hoadon);
            }
            tpMain.setSelectedComponent(hoadon);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập!!");
            return;
        }
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed

        if (ShareHelper.username != null) {
            if (sanpham == null) {
                tpMain.removeAll();
                nhanvien = null;
                hoadon = null;
                banhang = null;
                thongke = null;
                bieudo = null;
                vourcher = null;

                sanpham = new JPanelSanPham();
                ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Pork-Chop-Set-icon.png"));
                tpMain.addTab("Quản lý sản phẩm", icon, sanpham);
            }
            tpMain.setSelectedComponent(sanpham);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập!!");
            return;
        }
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMKActionPerformed
        if (ShareHelper.username == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập");
            return;
        }
        JDialogDoiMK doiMK = new JDialogDoiMK(null, true);
        doiMK.setVisible(true);
    }//GEN-LAST:event_btnDoiMKActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void mnuDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoiMKActionPerformed
        if (ShareHelper.username == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập");
            return;
        }
        JDialogDoiMK doiMK = new JDialogDoiMK(null, true);
        doiMK.setVisible(true);
    }//GEN-LAST:event_mnuDoiMKActionPerformed

    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        ShareHelper.username = null;
        ShareHelper.password = null;
        tpMain.removeAll();
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        ShareHelper.username = null;
        ShareHelper.password = null;
        lbNameUser.setText("");
        tpMain.removeAll();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void mnuDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangNhapActionPerformed
        if (ShareHelper.username == null) {
            JDialogDangNhap dn = new JDialogDangNhap(null, true);
            dn.setVisible(true);
            lbNameUser.setText(ShareHelper.name);
            if (ShareHelper.vaiTro) {
                btnNhanVien.setVisible(false);
                btnSanPham.setVisible(false);
                return;
            } else {
                btnNhanVien.setVisible(true);
                btnSanPham.setVisible(true);
            }
        } else {
            JDiaLogThongTinNV ttnv = new JDiaLogThongTinNV(null, true);
            ttnv.setVisible(true);
        }
    }//GEN-LAST:event_mnuDangNhapActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoanhThuActionPerformed
        if (ShareHelper.username != null) {
            if (thongke == null) {
                tpMain.removeAll();
                sanpham = null;
                hoadon = null;
                banhang = null;
                nhanvien = null;
                bieudo = null;
                vourcher = null;

                thongke = new JPanelThongKe();
                ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Occupations-Pizza-Deliveryman-Female-Light-icon.png"));
                tpMain.addTab("Thống Kê Doanh Thu", icon, thongke);
            }
            tpMain.setSelectedComponent(thongke);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập!!");
            return;
        }
    }//GEN-LAST:event_mnuDoanhThuActionPerformed

    private void mnuBieuDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBieuDoActionPerformed
        if (ShareHelper.username != null) {
            if (bieudo == null) {
                tpMain.removeAll();
                sanpham = null;
                hoadon = null;
                banhang = null;
                nhanvien = null;
                thongke = null;
                vourcher = null;

                bieudo = new JPanelBieuDo();
                ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Occupations-Pizza-Deliveryman-Female-Light-icon.png"));
                tpMain.addTab("Biểu Đồ Doanh Thu", icon, bieudo);
            }
            tpMain.setSelectedComponent(bieudo);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập!!");
            return;
        }
    }//GEN-LAST:event_mnuBieuDoActionPerformed

    private void mnuvourcherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuvourcherActionPerformed
        if (ShareHelper.username != null) {
            if (vourcher == null) {
                tpMain.removeAll();
                sanpham = null;
                hoadon = null;
                banhang = null;
                nhanvien = null;
                thongke = null;

                vourcher = new JPanelVourcher();

                ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Occupations-Pizza-Deliveryman-Female-Light-icon.png"));
                tpMain.addTab("Quản Lý Phiếu Giảm Giá", icon, vourcher);
            }
            tpMain.setSelectedComponent(vourcher);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập!!");
            return;
        }
    }//GEN-LAST:event_mnuvourcherActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMK;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbClock;
    private javax.swing.JLabel lbNameUser;
    private javax.swing.JMenuItem mnuBieuDo;
    private javax.swing.JMenuItem mnuDangNhap;
    private javax.swing.JMenuItem mnuDangXuat;
    private javax.swing.JMenuItem mnuDoanhThu;
    private javax.swing.JMenuItem mnuDoiMK;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenu mnuThoat;
    private javax.swing.JMenuItem mnuvourcher;
    private javax.swing.JTabbedPane tpMain;
    // End of variables declaration//GEN-END:variables
}