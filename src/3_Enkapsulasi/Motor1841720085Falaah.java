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
public class Motor1841720085Falaah 
{
    public int kecepatan = 0;
        public boolean kontakOn = false;
        
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
