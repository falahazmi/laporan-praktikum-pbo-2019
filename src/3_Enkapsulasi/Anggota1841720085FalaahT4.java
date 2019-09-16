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
public class Anggota1841720085FalaahT4 
{
    private String ktp;
    private String nama;
    private int limit;
    private int jmlPinjaman;
    
    Anggota1841720085FalaahT4(String ktp, String nama, int limit)
    {
        this.ktp = ktp;
        this.nama = nama;
        this.limit = limit;
        this.jmlPinjaman = 0;
    }
    
    public void setNamaFalaah(String nama)
    {
        this.nama = nama;
    }
    
    public String getNamaFalaah()
    {
        return nama;
    }
    
    public void setKtpFalaah(String ktp)
    {
        this.ktp = ktp;
    }
    
    public String getKtpFalaah()
    {
        return ktp;
    }
    
    public int getlimitPinjamanFalaah()
    {
        return limit;
    }
    
    public int getJmlPinjamanFalaah()
    {
        return jmlPinjaman;
    }
    
    public void pinjamFalaah(int uang)
    {
        if(uang >limit)
        {
            System.out.println("Maaf, jumlah pinjaman anda melebihi limit.");
        }
        else
        {
            jmlPinjaman += uang;
        }
    }
    
    public void angsuranFalaah(int uang)
    {
        jmlPinjaman -= uang;
    }
}
