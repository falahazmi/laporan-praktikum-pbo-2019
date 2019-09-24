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
public class KeretaApi1841720085Falaah {
    private String nama;
    private String kelas;
    private Pegawai1841720085Falaah masinis;
    private Pegawai1841720085Falaah asisten;

    public KeretaApi1841720085Falaah(String nama, String kelas, Pegawai1841720085Falaah masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi1841720085Falaah(String nama, String kelas, Pegawai1841720085Falaah masinis, Pegawai1841720085Falaah asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamaFalaah() {
        return nama;
    }

    public String getKelasFalaah() {
        return kelas;
    }

    public Pegawai1841720085Falaah getMasinisFalaah() {
        return masinis;
    }

    public Pegawai1841720085Falaah getAsistenFalaah() {
        return asisten;
    }

    public void setNamaFalaah(String nama) {
        this.nama = nama;
    }

    public void setKelasFalaah(String kelas) {
        this.kelas = kelas;
    }

    public void setMasinisFalaah(Pegawai1841720085Falaah masinis) {
        this.masinis = masinis;
    }

    public void setAsistenFalaah(Pegawai1841720085Falaah asisten) {
        this.asisten = asisten;
    }
    
    public String infoFalaah(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.infoFalaah();
        info += "Asisten: " + this.asisten.infoFalaah();
        return info;
    }
}
