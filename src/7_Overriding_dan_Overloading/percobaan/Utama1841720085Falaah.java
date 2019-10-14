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
public class Utama1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program Testing Class Manager & Staff");
        System.out.println("-------------------------------------");
        Manager1841720085Falaah man[] = new Manager1841720085Falaah[2];

        Staff1841720085Falaah staff1[] = new Staff1841720085Falaah[2];

        Staff1841720085Falaah staff2[] = new Staff1841720085Falaah[3];

        //pemrbuatan manager
        man[0] = new Manager1841720085Falaah();

        man[0].setNamaFalaah("Tedjo");
        man[0].setNipFalaah("101");
        man[0].setGolonganFalaah("1");
        man[0].setTunjanganFalaah(5000000);
        man[0].setBagianFalaah("Adminiestrasi");

        man[1] = new Manager1841720085Falaah();
        man[1].setNamaFalaah("Atika");
        man[1].setNipFalaah("102");
        man[1].setGolonganFalaah("1");
        man[1].setTunjanganFalaah(2500000);
        man[1].setBagianFalaah("Pemasaran");

        staff1[0] = new Staff1841720085Falaah();
        staff1[0].setNamaFalaah("Usman");
        staff1[0].setNipFalaah("0003");
        staff1[0].setGolonganFalaah("2");
        staff1[0].setLemburFalaah(10);
        staff1[0].setGajiLemburFalaah(10000);
        System.out.println("----------------------------");
        staff1[1] = new Staff1841720085Falaah();
        staff1[1].setNamaFalaah("Anugran");
        staff1[1].setNipFalaah("0005");
        staff1[1].setGolonganFalaah("2");
        staff1[1].setLemburFalaah(10);
        staff1[1].setGajiLemburFalaah(55000);
        man[0].setStaffFalaah(staff1);
        System.out.println("-----------------------------");
        staff2[0] = new Staff1841720085Falaah();
        staff2[0].setNamaFalaah("Hendra");
        staff2[0].setNipFalaah("0004");
        staff2[0].setGolonganFalaah("3");
        staff2[0].setLemburFalaah(15);
        staff2[0].setGajiLemburFalaah(5500);
        System.out.println("------------------------------");
        staff2[1] = new Staff1841720085Falaah();
        staff2[1].setNamaFalaah("Arie");
        staff2[1].setNipFalaah("0006");
        staff2[1].setGolonganFalaah("4");
        staff2[1].setLemburFalaah(5);
        staff2[1].setGajiLemburFalaah(100000);
        System.out.println("-------------------------------");
        staff2[2] = new Staff1841720085Falaah();
        staff2[2].setNamaFalaah("Mertari");
        staff2[2].setNipFalaah("0007");
        staff2[2].setGolonganFalaah("2");
        staff2[2].setLemburFalaah(6);
        staff2[2].setGajiLemburFalaah(20000);
        man[1].setStaffFalaah(staff2);

        //cetak onformas: dari manager + staffinya
        man[0].lihatInfoFalaah();
        man[1].lihatInfoFalaah();

    }

}
