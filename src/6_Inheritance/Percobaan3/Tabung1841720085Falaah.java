/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobshhet6.Praktikum;

/**
 *
 * @author ASUS
 */
public class Tabung1841720085Falaah extends Bangun1841720085Falaah
{
    protected int t;
    
    public void setSuperPhi(double phi)
    {
        super.phi=phi;
    }
    
    public void setSuperR(int r)
    {
        super.r=r;
    }
    
    public void setT(int t)
    {
        this.t=t;
    }
    
    public void volume()
    {
        System.out.println("Volume Tabung adalah: "+(super.phi*super.r*super.r*this.t));
    }
}
