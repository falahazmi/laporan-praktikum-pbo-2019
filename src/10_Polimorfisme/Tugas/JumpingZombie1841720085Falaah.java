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
public class JumpingZombie1841720085Falaah extends Zombie1841720085Falaah{

    public JumpingZombie1841720085Falaah(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void healFalaah() {
        if(level == 1){
            health += health*0.2;
        } else if(level == 2){
            health += health*0.3;
        } else if(level == 3){
            health += health*0.4;
        }
    }

    @Override
    public void destroyedFalaah() {
        health -= health*0.01;
    }
    
    public String getZombieInfoFalaah(){
        String info = "Jumping Zombie Data = ";
        info += super.getZombieInfoFalaah()+"\n";
        return info;
    }
}