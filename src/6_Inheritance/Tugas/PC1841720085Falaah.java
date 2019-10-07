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
public class PC1841720085Falaah extends Komputer1841720085Falaah
{
    public int ukuranMonitor;

    public PC1841720085Falaah() {
    }

    public PC1841720085Falaah(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, int ukuranMonitor) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPcFalaah(){
        super.tampilDataFalaah();
        System.out.println("Ukuran Monitor : "+ukuranMonitor);
    }
}
