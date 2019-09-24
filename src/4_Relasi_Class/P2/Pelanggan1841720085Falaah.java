/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falaahazmi.relasiclass.P2;

/**
 *
 * @author MuFin
 */
public class Pelanggan1841720085Falaah {
    private String nama;
    private Mobil1841720085Falaah mobil;
    private Sopir1841720085Falaah sopir;
    private int hari;

    public Pelanggan1841720085Falaah() {
    }

    public String getNamaFalaah() {
        return nama;
    }

    public Mobil1841720085Falaah getMobil() {
        return mobil;
    }

    public Sopir1841720085Falaah getSopirFalaah() {
        return sopir;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMobil(Mobil1841720085Falaah mobil) {
        this.mobil = mobil;
    }

    public void setSopir(Sopir1841720085Falaah sopir) {
        this.sopir = sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobilFalaah(hari) + sopir.hitungBiayaMobilFalaah(hari);
    }
}
