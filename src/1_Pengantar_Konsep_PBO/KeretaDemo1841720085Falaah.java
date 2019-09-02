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
public class KeretaDemo1841720085Falaah 
{
     public static void main(String[] args) 
     {
        
        // Pembuatan dua buah Object sepeda
        Kereta1841720085Falaah kr1 = new Kereta1841720085Falaah();
        Kereta1841720085Falaah kr2 = new Kereta1841720085Falaah();
        KeretaUap1841720085Falaah kr3 = new KeretaUap1841720085Falaah();
        //Pemanggilan method didalam Object sepeda
        
        kr1.tambahKecepatanFalaah(10);
        kr1.remFalaah(10);
        kr1.cetakSatusFalaah();
        
        
        kr2.tambahKecepatanFalaah(10);
        kr2.remFalaah(5);
        kr2.cetakSatusFalaah();
        
        kr3.tambahKecepatanFalaah(20);
        kr3.remFalaah(10);
        kr3.tambahTenagaFalaah(5);
        kr3.cetakSatusFalaah();
    }
}


