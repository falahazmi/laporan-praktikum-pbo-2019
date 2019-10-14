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
public class Karyawan1841720085Falaah {

    private String nama;
    private String nip;
    private String golongan;
    private double gaji;

    public void setNamaFalaah(String nama) {
        this.nama = nama;
    }

    public void setNipFalaah(String nip) {
        this.nip = nip;
    }

    public void setGolonganFalaah(String golongan) {
        this.golongan = golongan;

        switch (golongan.charAt(0)) {
            case '1':
                this.gaji = 5000000;
                break;
            case '2':
                this.gaji = 3000000;
                break;
            case '3':
                this.gaji = 2000000;
                break;
            case '4':
                this.gaji = 1000000;
                break;
            case '5':
                this.gaji = 750000;
                break;
        }
    }

    public void setGajiFalaah(double gaji) {
        this.gaji = gaji;
    }

    public String getNamaFalaah() {
        return nama;
    }

    public String getNipFalaah() {
        return nip;
    }

    public String getGolonganFalaah() {
        return golongan;
    }

    public double getGajiFalaah() {
        return gaji;
    }
}
