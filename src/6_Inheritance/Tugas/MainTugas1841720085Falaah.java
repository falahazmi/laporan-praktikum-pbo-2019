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
public class MainTugas1841720085Falaah 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Mac1841720085Falaah m=new Mac1841720085Falaah("Apple", "iOS 13", 8, 4, "NiMH", "WPA2");
        Windows1841720085Falaaah w=new Windows1841720085Falaaah("Asus TUF", "Intel Core i7 8th", 8, 8, "NiCd", "Microsoft Edge");
        PC1841720085Falaah pc=new PC1841720085Falaah("Crossair", "RTX 2060Ti", 16, 64, 24);
        System.out.println("====              Mac               ====");
        m.tampilMacFalaah();
        System.out.println("====            Windows             ====");
        w.tampilWindowsFalaah();
        System.out.println("====               PC               ====");
        pc.tampilPcFalaah();
        System.out.println("======++++++++++++++++++++++++++++======");
    }
    
}
