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
public class Mobil1841720085Falaah {
    private String merk;
    private int biaya;

    public Mobil1841720085Falaah() {
    }

    public String getMerkFalaah() {
        return merk;
    }

    public int getBiayaFalaah() {
        return biaya;
    }

    public void setMerkFalaah(String merk) {
        this.merk = merk;
    }

    public void setBiayaFalaah(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobilFalaah(int hari){
        return biaya * hari;
    }
}
