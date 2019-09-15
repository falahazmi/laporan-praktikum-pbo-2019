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
public class KoperasiDemo1841720085FalaahP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Anggota1841720085FalaahP4 anggota1 = new Anggota1841720085FalaahP4();
        System.out.println("Simpanan    " + anggota1.getNamaFalaah() + " : Rp " + anggota1.getSimpananFalaah());

        anggota1.setNamaFalaah("Falaah Azmi");
        anggota1.setAlamatFalaah("Jl. Pisang Kipas Dalam Nomor 2D");
        anggota1.setor(100000);
        System.out.println("Simpanan    " + anggota1.getNamaFalaah() + " : Rp " + anggota1.getSimpananFalaah());

        anggota1.pinjam(5000);
        System.out.println("Simpanan    " + anggota1.getNamaFalaah() + " : Rp " + anggota1.getSimpananFalaah());
    }

}
