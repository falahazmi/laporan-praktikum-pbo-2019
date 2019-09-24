/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falaahazmi.relasiclass.P2;

/**
 *
 * @author ASUS
 */
public class MainPercobaan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil1841720085Falaah m = new Mobil1841720085Falaah();
        m.setMerkFalaah("Avanza");
        m.setBiayaFalaah(350000);
        Sopir1841720085Falaah s = new Sopir1841720085Falaah();
        s.setNamaFalaah("John Doe");
        s.setBiayaFalaah(200000);
        Pelanggan1841720085Falaah p = new Pelanggan1841720085Falaah();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total: " + p.hitungBiayaTotal());
    }
    
}
