/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author ASUS
 */
public class Anggota1841720085FalaahP4 {

    private String nama;
    private String alamat;
    private float simpanan;

    public void setNamaFalaah(String nama) {
        this.nama = nama;
    }

    public void setAlamatFalaah(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaFalaah() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public float getSimpananFalaah() {
        return simpanan;
    }

    public void setorFalaah(float uang) {
        simpanan += uang;
    }

    public void pinjamFalaah(float uang) {
        simpanan -= uang;
    }
}
