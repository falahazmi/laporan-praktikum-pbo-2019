/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falaahazmi.relasiclass.P1;

/**
 *
 * @author ASUS
 */
public class Laptop1841720085Falaah {
    private String merk;
    private Processor1841720085Falaah proc;

    public Laptop1841720085Falaah() {
    }

    public Laptop1841720085Falaah(String merk, Processor1841720085Falaah proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerk() {
        return merk;
    }

    public Processor1841720085Falaah getProcFalaah() {
        return proc;
    }

    public void setMerkFalaah(String merk) {
        this.merk = merk;
    }

    public void setProcFalaah(Processor1841720085Falaah proc) {
        this.proc = proc;
    }
    
    public void infoFalaah(){
        System.out.println("Merk Laptop = " + merk);
        proc.infoFalaah();
    }
}
