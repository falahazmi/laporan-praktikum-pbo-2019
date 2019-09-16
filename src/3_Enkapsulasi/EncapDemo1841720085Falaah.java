/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class EncapDemo1841720085Falaah 
{
    private String name;
    private int age;
    
        public String getNameFalaah()
        {
            return name;
        }

        public void seNameFalaah(String newName)
        {
            name = newName;
        }

        public int getAgeFalaah()
        {
            return age;
        }

        public void setAgeFalaah(int newAge)
        {
            if(newAge > 30)
            {
                age = 30;
            }   
            else
            {
                age = newAge;
            }
        }
}
