/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobshhet6.Praktikum;

/**
 *
 * @author ASUS
 */
public class Inheritance1_1841720085Falaah 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Manager1841720085Falaah m=new Manager1841720085Falaah();
        m.nama="Vivin";
        m.alamat="Jl. Vinolia";
        m.umur=25;
        m.jk="Perempuan";
        m.gaji=3000000;
        m.tunjangan=1000000;
        m.tampilDataManagerFalaah();
        
        Staff1841720085Falaah s=new Staff1841720085Falaah();
        s.nama="Lestari";
        s.alamat="Malang";
        s.umur=25;
        s.jk="Perempuan";
        s.gaji=2000000;
        s.lembur=500000;
        s.potongan=250000;
        s.tampilDataStaffFalaah();
    }
    
}
