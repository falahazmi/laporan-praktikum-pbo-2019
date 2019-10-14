/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author ASUS
 */
public class Staff1841720085Falaah extends Karyawan1841720085Falaah {

    private int lembur;
    private double gajiLembur;

    public void setLemburFalaah(int lembur) {
        this.lembur = lembur;
    }

    public int getLemburFalaah() {
        return lembur;
    }

    public void setGajiLemburFalaah(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLemburFalaah() {
        return gajiLembur;
    }

    public double getGajiFalaah(int lembur, double gajiLembur) {
        return super.getGajiFalaah() + lembur * gajiLembur;
    }

    @Override
    public double getGajiFalaah() {
        return super.getGajiFalaah() + lembur * gajiLembur;
    }

    public void lihatInfoFalaah() {
        System.out.println("NIP :" + this.getNipFalaah());
        System.out.println("Nama :" + this.getNamaFalaah());
        System.out.println("Golongan :" + this.getGolonganFalaah());
        System.out.println("Jml. Lembur :" + this.getLemburFalaah());
        System.out.printf("Gaji Lembur :%.0f\n", this.getGajiLemburFalaah());
        System.out.printf("Gaji :%.0f\n", this.getGajiFalaah());
    }
}
