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
public class Kamar1841720085Falaah {
    private String nomer;
    private Pelanggan1841720085Falaah Pelanggan;

    public Kamar1841720085Falaah(String nomer) {
        this.nomer = nomer;
    }

    public void setNomerFalaah(String nomer) {
        this.nomer = nomer;
    }

    public void setPelangganFalaah(Pelanggan1841720085Falaah Pelanggan) {
        this.Pelanggan = Pelanggan;
    }

    public String getNomerFalaah() {
        return nomer;
    }

    public Pelanggan1841720085Falaah getPelangganFalaah() {
        return Pelanggan;
    }
    
    public String infoFalaah(){
        String info = "";
        info += "Nomor: " + nomer + "\n";
        if (this.Pelanggan != null){
            info += "Pelanggan: \n" + Pelanggan.infoFalaah() + "\n";
        }
        return info;
    }
}
