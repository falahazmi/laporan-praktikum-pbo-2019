/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class MainSegitiga1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Segitiga1841720085Falaah s = new Segitiga1841720085Falaah();

        s.totalSudutFalaah(120);
        s.totalSudutFalaah(50, 40);
        s.kelilingFalaah(15, 6, 10);
        s.kelilingFalaah(20, 9);

        System.out.println("Total Sudut         : " + s.totalSudutFalaah(120));
        System.out.println("Total Sudut         : " + s.totalSudutFalaah(50, 40));
        System.out.println("Keliling Segitiga   : " + s.kelilingFalaah(15, 6, 10));
        System.out.println("Keliling Segitiga   : " + s.kelilingFalaah(20, 9));
    }

}
