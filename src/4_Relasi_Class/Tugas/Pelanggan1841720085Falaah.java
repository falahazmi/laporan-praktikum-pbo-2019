/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falaahazmi.relasiclass.Tugas;

/**
 *
 * @author ASUS
 */
public class Pelanggan1841720085Falaah {
    private String ktp;
    private String nama;

    public Pelanggan1841720085Falaah(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public void setKtpFalaah(String ktp) {
        this.ktp = ktp;
    }

    public void setNamaFalaah(String nama) {
        this.nama = nama;
    }

    public String getKtpFalaah() {
        return ktp;
    }

    public String getNamaFalaah() {
        return nama;
    }
    
    public String infoFalaah(){
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
