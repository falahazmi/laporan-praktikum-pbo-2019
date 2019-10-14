/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Segitiga1841720085Falaah {

    private int sudut;

    public int totalSudutFalaah(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudutFalaah(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int kelilingFalaah(int sisiA, int sisiB, int sisiC) {
        return (sisiA + sisiB + sisiC);
    }

    public double kelilingFalaah(int sisiA, int sisiB) {
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c;
    }
}
