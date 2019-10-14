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
public class Manager1841720085Falaah extends Karyawan1841720085Falaah {

    private double tunjangan;
    private String bagian;
    private Staff1841720085Falaah st[];

    public void setTunjanganFalaah(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjanganFalaah() {
        return tunjangan;
    }

    public void setBagianFalaah(String bagian) {
        this.bagian = bagian;
    }

    public String getBagianFalaah() {
        return bagian;
    }

    public void setStaffFalaah(Staff1841720085Falaah st[]) {
        this.st = st;
    }

    public void viewStaffFalaah() {
        int i;
        System.out.println("-—-------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoFalaah();
        }
        System.out.println("-—-------------------");
    }

    public void lihatInfoFalaah() {
        System.out.println("Manager :" + this.getBagianFalaah());
        System.out.println("NIP :" + this.getNipFalaah());
        System.out.println("Nama :" + this.getNamaFalaah());
        System.out.println("Golongan :" + this.getGolonganFalaah());
        System.out.printf("Tunjangan :%.0f\n", this.getTunjanganFalaah());
        System.out.printf("Gaji :%.0f\n", this.getGajiFalaah());
        System.out.println("Bagian :" + this.getBagianFalaah());
        this.viewStaffFalaah();
    }

    @Override
    public double getGajiFalaah() {
        return super.getGajiFalaah() + tunjangan;
    }
}
