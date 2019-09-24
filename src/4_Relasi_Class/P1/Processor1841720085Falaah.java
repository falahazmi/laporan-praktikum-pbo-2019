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
public class Processor1841720085Falaah {
    private String merk;
    private double cache;
    
    Processor1841720085Falaah(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }

    public Processor1841720085Falaah() {
    }

    public String getMerkFalaah() {
        return merk;
    }

    public double getCachFalaah() {
        return cache;
    }

    public void setMerkFalaah(String merk) {
        this.merk = merk;
    }

    public void setCacheFalaah(double cache) {
        this.cache = cache;
    }
    
    public void infoFalaah(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
