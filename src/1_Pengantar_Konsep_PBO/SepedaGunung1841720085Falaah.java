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
public class SepedaGunung1841720085Falaah extends Sepeda1841720085Falaah
{
     private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue) 
    {
        tipeSuspensi = newValue;
    }
    
    public void cetakSatus() 
    {
        super.cetakSatus();
        System.out.println("Tipe Suspensi: "+tipeSuspensi);
    }
}
