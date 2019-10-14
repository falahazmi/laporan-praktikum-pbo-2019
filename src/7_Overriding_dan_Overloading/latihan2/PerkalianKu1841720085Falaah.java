/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author ASUS
 */
public class PerkalianKu1841720085Falaah {

    void perkalianFalaah(int a, int b) {
        System.out.println(a * b);
    }

    void perkalianFalaah(double a, double b) {
        System.out.println(a * b);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PerkalianKu1841720085Falaah objek = new PerkalianKu1841720085Falaah();
        objek.perkalianFalaah(25, 43);
        objek.perkalianFalaah(34.56, 23.7);
    }
}
