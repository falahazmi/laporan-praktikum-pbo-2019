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
public class TugasBarang1841720085Falaah 
{
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJualFalaah()
    {
        int hargaJual = (int) (hargaDasar-(diskon*(hargaDasar/100)));
        
        return hargaJual;
    }
    
    public void tampilDataFalaah()
    {
        System.out.println("Kode Barang : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : Rp."+hargaDasar);
        System.out.println("Diskon : "+diskon+"%");
        System.out.println("harga Jual : "+hitungHargaJualFalaah());
    }
}
