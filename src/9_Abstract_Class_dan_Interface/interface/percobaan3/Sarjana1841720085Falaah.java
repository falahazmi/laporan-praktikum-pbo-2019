/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author ASUS
 */
public class Sarjana1841720085Falaah extends Mahasiswa1841720085Falaah implements ICumlaude1841720085Falaah, IBerprestasi1841720085Falaah {

    public Sarjana1841720085Falaah(String nama) {
        super(nama);
    }

    @Override
    public void lulusFalaah() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiFalaah() {
        System.out.println("IPK-ku lebih dari 3.51");
    }
    
    @Override
    public void menjuaraiKompetisiFalaah() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahFalaah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }

}
