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
public class Sepeda1841720085Falaah
{
    private String merek;
    private String warna;
    private int kecepatan;
    private int gear;
    
    public void setMerekFalaah(String newValue) 
    {
        merek = newValue;
    }
    
    public void setWarnaFalaah(String newValue) 
    {
        warna = newValue;
    }
    
    public void gantiGearFalaah(int newValue) 
    {
        gear = newValue;
    }

    public void tambahKecepatanFalaah(int increment) 
    {
        kecepatan = kecepatan + increment;
    }
    
    public void remFalaah(int decrement) 
    {
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakSatusFalaah() {
        System.out.println("Merek : "+merek);
        System.out.println("Kecepatan : "+kecepatan);
        System.out.println("Gear : "+gear);
        System.out.println("Warna : "+warna);
    }
}
