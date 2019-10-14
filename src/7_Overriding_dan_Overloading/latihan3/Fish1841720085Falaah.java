/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author ASUS
 */
class Ikan1841720085Falaah {

    public void swimFalaah() {
        System.out.println("lkan bisa kerenang");
    }
}

class Piranha1841720085Falaah extends Ikan1841720085Falaah {

    @Override
    public void swimFalaah() {
        System.out.println("Piranca bisa makan daging");
    }
}

public class Fish1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ikan1841720085Falaah a = new Ikan1841720085Falaah();
        Ikan1841720085Falaah b = new Piranha1841720085Falaah();
        a.swimFalaah();
        b.swimFalaah();
    }
}
