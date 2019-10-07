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
public class StaffTetap1841722085Falaah extends Staff1841720085Falaah
{
    public String golongan;
    public int asuransi;

    public StaffTetap1841722085Falaah() 
    {
    }

    public StaffTetap1841722085Falaah(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi) 
    {
        super(nama,alamat,jk,umur,gaji,lembur,potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void tampilStaffTetapFalaah()
    {
        System.out.println("========================= Data Staff Tetap =========================");
        super.tampilDataStaffFalaah();
        System.out.println("Golongan            : "+golongan);
        System.out.println("Jumlah Asuransi     : "+asuransi);
        System.out.println("Gaji Bersih         : "+(gaji+lembur-potongan-asuransi));
    }
}
