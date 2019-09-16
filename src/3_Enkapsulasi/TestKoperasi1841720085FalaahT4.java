/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class TestKoperasi1841720085FalaahT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Anggota1841720085FalaahT4 donny = new Anggota1841720085FalaahT4 ("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota        :   "+donny.getNamaFalaah());
        System.out.println("Limit Pinjaman      :   "+donny.getlimitPinjamanFalaah());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjamFalaah(10000000);
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjamFalaah(4000000);
        System.out.println("Jumlaah pinjaman saat ini   :   "+donny.getJmlPinjamanFalaah());
        
        System.out.println("\nMembayar angsuran 1.000.000...");
        donny.angsuranFalaah(1000000);
        System.out.println("Jumlah pinjaman saat ini    :   "+donny.getJmlPinjamanFalaah());
        
        System.out.println("\nMembayar angsuran 3.000.000...");
        donny.angsuranFalaah(3000000);
        System.out.println("Jumlah pinjaman saat ini    :   "+donny.getJmlPinjamanFalaah());
    }
    
}
