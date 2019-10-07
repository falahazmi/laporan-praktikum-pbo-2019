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
public class StaffHarian1841720085Falaah extends Staff1841720085Falaah
{
    public int jmlJamKerja;

    public StaffHarian1841720085Falaah() 
    {
    }

    public StaffHarian1841720085Falaah(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jmlJamKerja) 
    {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarianFalaah()
    {
        System.out.println("======================== Data Staff Harian =========================");
        super.tampilDataStaffFalaah();
        System.out.println("Jumlah Jam Kerja    : "+jmlJamKerja);
        System.out.println("Gaji Bersih         : "+(gaji*jmlJamKerja+lembur-potongan));
    }
}
