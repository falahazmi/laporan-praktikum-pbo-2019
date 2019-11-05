/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author MuFin
 */
public class Tester1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WalkingZombie1841720085Falaah wz = new WalkingZombie1841720085Falaah(100, 1);
        JumpingZombie1841720085Falaah jz = new JumpingZombie1841720085Falaah(100, 2);
        Barrier1841720085Falaah b = new Barrier1841720085Falaah(100);
        Plant1841720085Falaah p = new Plant1841720085Falaah();
        System.out.println(""+wz.getZombieInfoFalaah());
        System.out.println(""+jz.getZombieInfoFalaah());
        System.out.println(""+b.getBarrierInfoFalaah());
        System.out.println("----------------------------");
        for(int i=0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfoFalaah());
        System.out.println(""+jz.getZombieInfoFalaah());
        System.out.println(""+b.getBarrierInfoFalaah());
    }
}
