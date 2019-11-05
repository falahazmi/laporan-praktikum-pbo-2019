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
public class Plant1841720085Falaah {
    
    public void doDestroy(Destroyable1841720085Falaah d){
        
        if(d instanceof WalkingZombie1841720085Falaah){
            
            WalkingZombie1841720085Falaah wz = (WalkingZombie1841720085Falaah) d;
            wz.destroyedFalaah();
        } 
        else if(d instanceof JumpingZombie1841720085Falaah){
            
            JumpingZombie1841720085Falaah jz = (JumpingZombie1841720085Falaah) d;
            jz.destroyedFalaah();
        }
        else if(d instanceof Barrier1841720085Falaah){
            
            Barrier1841720085Falaah b = (Barrier1841720085Falaah) d;
            b.destroyedFalaah();
        }
    }
}
