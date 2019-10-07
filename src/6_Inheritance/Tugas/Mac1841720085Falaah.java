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
public class Mac1841720085Falaah extends Laptop1841720085Falaah
{
    public String security;

    public Mac1841720085Falaah() 
    {
    }

    public Mac1841720085Falaah(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrai, String security) 
    {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBatrai);
        this.security = security;
    }
    
    public void tampilMacFalaah()
    {
        super.tampilLaptopFalaah();
        System.out.println("Security : "+security);
    }
}
