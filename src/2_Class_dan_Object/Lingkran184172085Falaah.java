/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;
/**
 *
 * @author ASUS
 */
public class Lingkran184172085Falaah 
{
    public double phi=3.14;
    public double r;
    
    public double hitungLuasFalaah()
    {
        double Luas = phi*r*r;
        return Luas;
    }
    
    public double hitungKelilingFalaah()
    {
        double Keliling = 2*phi*r;
        return Keliling;
    }
    
    public void tampilFalaah()
    {
        System.out.println("Luas        :"+hitungLuasFalaah());
        System.out.println("Keliling    :"+hitungKelilingFalaah());
    }
    
    
}
