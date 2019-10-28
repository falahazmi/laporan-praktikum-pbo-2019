/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author ASUS
 */
public class Orang1841720085Falaah {

    private String nama;
    private Hewan1841720085Falaah hewanPeliharaan;

    public Orang1841720085Falaah(String nama) {
        this.nama = nama;
    }

    public void peliharaHewan(Hewan1841720085Falaah hewanPeliharaan) {
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan() {
        System.out.println("Namaku  : " + this.nama);
        System.out.println("Hewan peliharaanku bergerak dengan cara :");
        this.hewanPeliharaan.bergerakFalaah();
        System.out.println("--------------------------------------------------------x");
    }
}
