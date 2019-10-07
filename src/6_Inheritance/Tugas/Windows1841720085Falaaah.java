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
public class Windows1841720085Falaaah extends Laptop1841720085Falaah
{
    public String fitur;

    public Windows1841720085Falaaah() 
    {
    }

    public Windows1841720085Falaaah(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrai, String fitur) 
    {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBatrai);
        this.fitur = fitur;
    }
    
    public void tampilWindowsFalaah()
    {
        super.tampilLaptopFalaah();
        System.out.println("Fitur : "+fitur);
    }
}
