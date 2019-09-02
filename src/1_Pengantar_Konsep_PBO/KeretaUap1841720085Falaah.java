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
public class KeretaUap1841720085Falaah extends Kereta1841720085Falaah 
{
    private int tenaga;

    public void tambahTenagaFalaah(int increment) 
    {
        kecepatan = kecepatan + increment + tenaga;
    }
    
    public void cetakSatusFalaah() 
    {
        super.cetakSatusFalaah();
        System.out.println("Tenaga : "+tenaga);
    }
}

