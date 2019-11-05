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
public class Barrier1841720085Falaah implements Destroyable1841720085Falaah{
    
    private int strength;
    
    public Barrier1841720085Falaah(int strength) {
        this.strength = strength;
    }

    public int getStrengthFalaah() {
        return strength;
    }

    @Override
    public void destroyedFalaah() {
        strength -= strength * 0.1;
    }
    
    public void destroyFalaah(){
        destroyedFalaah();
    }
    
    public String getBarrierInfoFalaah() {
        return "Barier Strength = "+strength;
    }
}
