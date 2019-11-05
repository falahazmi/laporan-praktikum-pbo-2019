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
public abstract class Zombie1841720085Falaah implements Destroyable1841720085Falaah{
    protected int health;
    protected int level;
    
    public abstract void healFalaah();

    @Override
    public abstract void destroyedFalaah();
    
    public String getZombieInfoFalaah(){
        return "\nLevel = "+level+"\nHealth = "+health;
    }
}
