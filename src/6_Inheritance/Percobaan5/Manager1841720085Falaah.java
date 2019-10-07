/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobshhet6.Praktikum;

/**
 *
 * @author ASUS
 */
public class Manager1841720085Falaah extends Karyawan1841720085Falaah
{
    public int tunjangan;

    public Manager1841720085Falaah() 
    {
    }
    
    public void tampilDataManagerFalaah()
    {
        super.tampilDataKaryawanFalaah();
        System.out.println("Tunjangan   : "+tunjangan);
        System.out.println("Total Gaji  : "+(super.gaji+tunjangan));
    }
}
