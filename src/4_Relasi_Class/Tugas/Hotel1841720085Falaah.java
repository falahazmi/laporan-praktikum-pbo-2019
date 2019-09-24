/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falaahazmi.relasiclass.Tugas;

/**
 *
 * @author ASUS
 */
public class Hotel1841720085Falaah {
    private String kode;
    private String nama;
    private Kamar1841720085Falaah[] arrayKamar;
    private Pegawai1841720085Falaah manager;
    private Pegawai1841720085Falaah pramusaji;

    Hotel1841720085Falaah(String a, int i, Pegawai1841720085Falaah manager, Pegawai1841720085Falaah pramusaji) {
    }
    
    private void initKamarFalaah(){
        for(int i = 0; i < arrayKamar.length; i++){
            this.arrayKamar[i] = new Kamar1841720085Falaah(String.valueOf(i + 1));
        }
    }
    
    public Hotel1841720085Falaah(String kode, int jumlah){
        this.kode = kode;
        this.arrayKamar = new Kamar1841720085Falaah[jumlah];
        this.initKamarFalaah();
    }
    
    public Hotel1841720085Falaah(String nama, Pegawai1841720085Falaah manager, Pegawai1841720085Falaah pramusaji){
        this.nama = nama;
        this.manager = manager;
        this.pramusaji = pramusaji;
    }

    public void setpramusajiFalaah(Pegawai1841720085Falaah pramusaji) {
        this.pramusaji = pramusaji;
    }
    
    public String infoFalaah(){
        String info = "";    
        info += "Kode Kamar: " + kode + "\n";
        for(Kamar1841720085Falaah Kamar : arrayKamar){
            info += Kamar.infoFalaah();
        }
        return info;
    }
    
    public String infoFalaah1(){
        String info1 = "";
        info1 += "manager: " + this.manager.infoFalaah1();
        info1 += "pramusaji: " + this.pramusaji.infoFalaah1();
        return info1;
    }

    public void setPelangganFalaah(Pelanggan1841720085Falaah Pelanggan, int nomor){
        this.arrayKamar[nomor - 1].setPelangganFalaah(Pelanggan);
    }
    
    public void setPegawaiFalaah(Pegawai1841720085Falaah manager, Pegawai1841720085Falaah pramusaji){
        this.manager = manager;
        this.pramusaji = pramusaji;
    }
            
}
