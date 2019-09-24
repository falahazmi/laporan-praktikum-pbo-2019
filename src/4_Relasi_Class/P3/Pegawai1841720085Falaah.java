/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falaahazmi.relasiclass.P3;

/**
 *
 * @author ASUS
 */
public class Pegawai1841720085Falaah {
    private String nip;
    private String nama;

    public Pegawai1841720085Falaah(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNipFalaah() {
        return nip;
    }

    public String getNamaFalaah() {
        return nama;
    }

    public void setNipFalaah(String nip) {
        this.nip = nip;
    }

    public void setNamaFalaah(String nama) {
        this.nama = nama;
    }
    
    public String infoFalaah(){
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
