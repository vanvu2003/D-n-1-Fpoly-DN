/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanvu.poly.help;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
/**
 *
 * @author NGUYEN VAN VU
 */
public class ShareHelper {
    public static String username;
    public static String password;
    public static String name;
    public static boolean vaiTro;
    
    public static final Image APP_ICON;

    static {
        // Tải biểu tượng ứng dụng
        String file = "/icon/food_96px.png";
        APP_ICON = new ImageIcon(ShareHelper.class.getResource(file)).getImage();
    }
    public static boolean saveLogo(File file) {
        File dir = new File("logos");
        // Tạo thư mục nếu chưa tồn tại
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(dir, file.getName());
        try {
            // Copy vào thư mục logos (đè nếu đã tồn tại)
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public static ImageIcon readLogo(String fileName, int w, int h) {
        File path = new File("logos", fileName);
        Image img = new ImageIcon(path.toString()).getImage();
        Image icon = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);

        return new ImageIcon(icon);
    }
}
