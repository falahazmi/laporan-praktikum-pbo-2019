/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogui;
import javax.swing.*;
/**
 *
 * @author ASUS
 */
public class HelloGui1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame;
        frame = new JFrame("Ini percobaan HelloGui Frame");
                //Program akan berhenti jika di tutup
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //Ukuran Lebar, Tinggi dari Window
                frame.setSize(600,300);
                //Letak x,y pada window
                frame.setLocation(200, 200);
                //Menempatkan fream ditengah-tengah layar
                //frame.setLocationRelativeTo(null);
                //Menampilkan Frame
                frame.setVisible(true);
    }
    
}
