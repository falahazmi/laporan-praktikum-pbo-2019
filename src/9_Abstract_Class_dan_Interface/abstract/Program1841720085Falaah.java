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
public class Program1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kucing1841720085Falaah kucingKampung = new Kucing1841720085Falaah();
        Ikan1841720085Falaah lumbaLumba = new Ikan1841720085Falaah();

        Orang1841720085Falaah ani = new Orang1841720085Falaah("Ani");
        Orang1841720085Falaah budi = new Orang1841720085Falaah("Budi");

        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
