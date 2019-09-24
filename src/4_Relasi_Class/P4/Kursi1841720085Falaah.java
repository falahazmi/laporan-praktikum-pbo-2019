/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falaahazmi.relasiclass.P4;

/**
 *
 * @author MuFin
 */
public class Kursi1841720085Falaah {
    private String nomer;
    private Penumpang1841720085Falaah penumpang;

    public Kursi1841720085Falaah(String nomer) {
        this.nomer = nomer;
    }

    public void setNomerFalaah(String nomer) {
        this.nomer = nomer;
    }

    public void setPenumpangFalaah(Penumpang1841720085Falaah penumpang) {
        this.penumpang = penumpang;
    }

    public String getNomerFalaah() {
        return nomer;
    }

    public Penumpang1841720085Falaah getPenumpangFalaah() {
        return penumpang;
    }
    
    public String infoFalaah(){
        String info = "";
        info += "Nomor: " + nomer + "\n";
        if (this.penumpang != null){
            info += "penumpang: " + penumpang.infoFalaah() + "\n";
        }
        return info;
    }
}
