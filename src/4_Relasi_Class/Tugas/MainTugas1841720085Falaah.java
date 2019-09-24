/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falaahazmi.relasiclass.Tugas;

/**
 *
 * @author ASUS
 */
public class MainTugas1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai1841720085Falaah manager = new Pegawai1841720085Falaah("1999", "Raymond");
        Pegawai1841720085Falaah Pramusaji = new Pegawai1841720085Falaah("2000", "Krisna");
        Hotel1841720085Falaah Hotel = new Hotel1841720085Falaah("B", 10);
        Pelanggan1841720085Falaah p = new Pelanggan1841720085Falaah("2012", "Okky");
         Pegawai1841720085Falaah manager1 = new Pegawai1841720085Falaah("1999", "Raymond");
        Pegawai1841720085Falaah Pramusaji2 = new Pegawai1841720085Falaah("2000", "Krisna");
        Hotel1841720085Falaah Hotel1 = new Hotel1841720085Falaah("G", 10);
        Pelanggan1841720085Falaah q = new Pelanggan1841720085Falaah("2014", "Dhika");
        
        Hotel.setPegawaiFalaah(manager, Pramusaji);
        Hotel.setPelangganFalaah(p, 1);
        Hotel1.setPegawaiFalaah(manager1, Pramusaji2);
        Hotel1.setPelangganFalaah(q, 2);
        
        System.out.println(Hotel.infoFalaah1());
        System.out.println(Hotel.infoFalaah());
    }
    
}
