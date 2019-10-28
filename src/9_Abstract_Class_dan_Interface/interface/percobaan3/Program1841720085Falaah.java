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
public class Program1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rektor1841720085Falaah pakRektor = new Rektor1841720085Falaah();

        Mahasiswa1841720085Falaah mahasiswaBiasa = new Mahasiswa1841720085Falaah("Charlie");
        Sarjana1841720085Falaah sarjanaCumlaude = new Sarjana1841720085Falaah("Dini");
        PascaSarjana1841720085Falaah masterCumlaude = new PascaSarjana1841720085Falaah("Elok");

//        pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaude(masterCumlaude);
        pakRektor.beriSertifikatMawapresFalaah(mahasiswaBiasa);
        pakRektor.beriSertifikatMawapresFalaah(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapresFalaah(masterCumlaude);
    }
}
