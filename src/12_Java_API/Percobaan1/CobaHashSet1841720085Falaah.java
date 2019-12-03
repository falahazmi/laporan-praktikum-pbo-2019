/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author ASUS
 */
public class CobaHashSet1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set mSetCityFalaah = new HashSet();
        mSetCityFalaah.add("Malang");
        mSetCityFalaah.add("Banyuwangi");
        mSetCityFalaah.add("Jogjakarta");
        mSetCityFalaah.add("Batu");
        
        System.out.println(mSetCityFalaah);
        Iterator<String>mIterator = mSetCityFalaah.iterator();
        
        while (mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
        }
    }
    
}
