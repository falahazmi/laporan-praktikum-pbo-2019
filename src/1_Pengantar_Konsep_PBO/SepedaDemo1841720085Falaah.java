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
        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakSatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakSatus();
 
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakSatus();
    }
}