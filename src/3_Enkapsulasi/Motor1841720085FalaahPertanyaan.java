/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation;

/**
 *
 * @author ASUS
 */
public class Motor1841720085FalaahPertanyaan 
{
    private int kecepatan = 0;
    private boolean kontakOn = false;
        
        public void nyalakanMesinFalaah()
        {
            kontakOn = true;
        }
        public void matikanMesinFalaah()
        {
            kontakOn = false;
            kecepatan = 0;
        }
        public void tambahKecepatanFalaah()
        {
            if(kontakOn == true)
            {
                kecepatan += 20;
            }
            else
            {
                System.out.println("Kecepatan tidak bisa bertambah karena MesinOff! \n");
            }
        }
        public void kurangiKecepata()
        {
            if(kontakOn == true)
            {
                kecepatan -= 5;
            }
            else
            {
                System.out.println("Kecepatan tidak bisa berkurang karena MesinOff! \n");
            }
        }
        public void printStatusFalaah()
        {
            if(kontakOn == true)
            {
                System.out.println("Kontak On");
            }
            else
            {
                System.out.println("Kontak Off");
            }
            System.out.println("Keceptan "+ kecepatan +"\n");
        }
}
