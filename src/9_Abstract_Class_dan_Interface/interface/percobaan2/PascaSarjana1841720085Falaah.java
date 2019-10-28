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
public class PascaSarjana1841720085Falaah extends Mahasiswa1841720085Falaah implements ICumlaude1841720085Falaah{

    public PascaSarjana1841720085Falaah(String nama) {
        super(nama);
    }

    @Override
    public void lulusFalaah() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiFalaah() {
        System.out.println("IPK-ku lebih dari 3.71");
    }
}
