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
public class TestKoperasiCoba1841720085Falaah 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        int pilihan, pinjaman, uang;
        String ktp, nama;
        
        System.out.print("Nomor KTP: ");
        ktp = scString.nextLine();
        
        System.out.print("Nama: ");
        nama = scString.nextLine();
        
        System.out.print("Pinjaman: ");
        pinjaman = scInt.nextInt();
        
        Anggota1841720085FalaahT6 donny = new Anggota1841720085FalaahT6(ktp, nama, pinjaman);
        do
        {
            System.out.println("1. Angsuran");
            System.out.println("2. Jumlah Pinjaman");
            System.out.println("3. Informasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            pilihan = scInt.nextInt();
            switch(pilihan)
            {                    
                case 1:
                    System.out.print("Masukkan angsuran: ");
                    uang = scInt.nextInt();
                    donny.angsuranFalaah(uang);
                    break;
                
                case 2:
                    System.out.println("Sisa Pinjaman: "+donny.getJmlPinjamanFalaah());
                    break;
                    
                case 3:
                    System.out.println("Nama: "+donny.getNamaFalaah());
                    System.out.println("Nomor KTP: "+donny.getKtpFalaah());
                    System.out.println("Limit Pinjaman: "+donny.getlimitPinjamanFalaah());
                    System.out.println("Sisa Pinjaman: "+donny.getJmlPinjamanFalaah());  
            }   
        }
        while(pilihan!=4);
    }
}
    
