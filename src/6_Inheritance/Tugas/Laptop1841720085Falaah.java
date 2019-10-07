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
public class Laptop1841720085Falaah extends Komputer1841720085Falaah
{
    public String jnsBatrai;

    public Laptop1841720085Falaah() 
    {
    }

    public Laptop1841720085Falaah(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrai) 
    {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBatrai = jnsBatrai;
    }
    
    public void tampilLaptopFalaah(){
        super.tampilDataFalaah();
        System.out.println("Jenis Baterai : "+jnsBatrai);
    }
}
