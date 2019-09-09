/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;
/**
 *
 * @author ASUS
 */
public class Sewa1841720085Falaah 
{
    public int id;
    public String nama_member;
    public String nama_game;
    public double harga;
    public int lama_sewa;
    
    public double totalHargaFalaah()
    {
        double total = harga*lama_sewa;
        
        return total;
    }
    
    public void cetakStrukFalaah()
    {
        System.out.println("ID          :   "+id);
        System.out.println("Nama Member :   "+nama_member);
        System.out.println("Nama Gamr   :   "+nama_game);
        System.out.println("Harga       :   "+harga);
        System.out.println("Lama Sewa   :   "+lama_sewa+" Hari ");
    }
}
