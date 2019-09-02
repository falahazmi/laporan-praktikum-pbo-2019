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
public class Kereta1841720085Falaah 
{

    int kecepatan;
    private int rem;
    
    public void remFalaah(int decrement) 
    {
        kecepatan = kecepatan - (decrement+rem) ;
    }
    public void tambahKecepatanFalaah(int newValue) 
    {
        kecepatan = newValue;
    }
    
    public void cetakSatusFalaah() {

        System.out.println("Kecepatan: "+kecepatan);
        System.out.println("Rem: "+rem);
    }
}
