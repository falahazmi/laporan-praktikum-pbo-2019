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
public class Barang1841720085Falaah 
{
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarangFalaah()
    {
        System.out.println("Nama Barang     :   "+namaBrg);
        System.out.println("Jenis Barang    :   "+jenisBrg);
        System.out.println("Stok    :   "+stok);
    }
    
    //method dengan argumen dan niali bali (return)
    public int tambahStok(int brgMasuk)
    {
        int stokBaru = brgMasuk+stok;
        return stokBaru;
    }
}
