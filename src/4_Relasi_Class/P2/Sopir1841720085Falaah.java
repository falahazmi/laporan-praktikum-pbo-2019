/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falaahazmi.relasiclass.P2;

/**
 *
 * @author ASUS
 */
public class Sopir1841720085Falaah {
    private String nama;
    private int biaya;

    public Sopir1841720085Falaah() {
    }

    public String getNamaFalaah() {
        return nama;
    }

    public int getBiayaFalaah() {
        return biaya;
    }

    public void setNamaFalaah(String nama) {
        this.nama = nama;
    }

    public void setBiayaFalaah(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobilFalaah(int hari){
        return biaya * hari;
    }
}
