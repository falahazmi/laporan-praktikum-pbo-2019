/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TestKoperasi1841720085FalaahT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Anggota1841720085FalaahT6 donny = new Anggota1841720085FalaahT6 ("111333444", "Donny", 5000000);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nama Anggota        :   "+donny.getNamaFalaah());
        System.out.println("Limit Pinjaman      :   "+donny.getlimitPinjamanFalaah());
        
        System.out.println("Masukan jumlah pinjaman     :   ");
        int p = sc.nextInt();
        donny.pinjamFalaah(p);
        System.out.println("Jumlah pinjaman saat ini    :   "+donny.getJmlPinjamanFalaah());
        
        System.out.println("Masukan jumlah pinjaman     :   ");
        int p2 = sc.nextInt();
        donny.pinjamFalaah(p2);
        System.out.println("Jumlah pinjaman saat ini    :   "+donny.getJmlPinjamanFalaah());
        
        System.out.println("Masukan jumlah angsuran     :   ");
        int a = sc.nextInt();
        donny.angsuranFalaah(a);
        System.out.println("Jumlah pinjaman saat ini    :   "+donny.getJmlPinjamanFalaah());
        
        System.out.println("Masukan jumlah angsuran     :   ");
        int a2 = sc.nextInt();
        donny.angsuranFalaah(a2);
        System.out.println("Jumlah pinjaman saat ini    :   "+donny.getJmlPinjamanFalaah());
    }
    
}
