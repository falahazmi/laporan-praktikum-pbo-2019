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
public class MainPercobaan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai1841720085Falaah masinis = new Pegawai1841720085Falaah("1234", "Spongebob Squarepants");
        Pegawai1841720085Falaah asisten = new Pegawai1841720085Falaah("4567", "Patrick Star");
        KeretaApi1841720085Falaah keretaApi = new KeretaApi1841720085Falaah("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.print(keretaApi.infoFalaah());
    }
    
}
