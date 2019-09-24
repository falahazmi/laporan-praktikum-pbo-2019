/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falaahazmi.relasiclass.P4;

/**
 *
 * @author MuFin
 */
public class MainPercobaan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Penumpang1841720085Falaah p = new Penumpang1841720085Falaah("12345", "Mr. Krab");
        Gerbong1841720085Falaah gerbong = new Gerbong1841720085Falaah("A", 10);
        gerbong.setPenumpangFalaah(p, 1);
        System.out.println(gerbong.infoFalaah());
    }
    
}
