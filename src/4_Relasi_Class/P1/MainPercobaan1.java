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
public class MainPercobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processor1841720085Falaah p = new Processor1841720085Falaah("Intel i5", 3);
        Laptop1841720085Falaah L = new Laptop1841720085Falaah("Thinkpad", p);
        
        L.infoFalaah();
        
        Processor1841720085Falaah p1 = new Processor1841720085Falaah();
        p1.setMerkFalaah("Intel i5");
        p1.setCacheFalaah(4);
        Laptop1841720085Falaah L1 = new Laptop1841720085Falaah();
        L1.setMerkFalaah("Thinkpad");
        L1.setProcFalaah(p1);
        L1.infoFalaah();
    }
    
}
