/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;

/**
 *
 * @author ASUS
 */
public class SepedaDemo1841720085Falaah
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pembuatan dua buah Object sepeda
        Sepeda1841720085Falaah spd1 = new Sepeda1841720085Falaah();
        Sepeda1841720085Falaah spd2 = new Sepeda1841720085Falaah();
        SepedaGunung1841720085Falaah spd3 = new SepedaGunung1841720085Falaah();
        
        //Pemanggilan method didalam Object sepeda
        spd1.setMerekFalaah("Polygon");
        spd1.setWarnaFalaah("Putih");
        spd1.tambahKecepatanFalaah(10);
        spd1.gantiGearFalaah(2);
        spd1.cetakSatusFalaah();
        
        spd2.setMerekFalaah("Wiim Cycle");
        spd2.setWarnaFalaah("Merah");
        spd2.tambahKecepatanFalaah(10);
        spd2.gantiGearFalaah(2);
        spd2.tambahKecepatanFalaah(10);
        spd2.gantiGearFalaah(3);
        spd2.cetakSatusFalaah();

        spd3.setMerekFalaah("Klinee");
        spd3.setWarnaFalaah("Hitam");
        spd3.tambahKecepatanFalaah(5);
        spd3.gantiGearFalaah(7);
        spd3.setTipeSuspensiFalaah("Gas suspension");
        spd3.cetakSatusFalaah();
    }
}