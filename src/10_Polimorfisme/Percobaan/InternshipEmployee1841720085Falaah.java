/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismedasar;

/**
 *
 * @author ASUS
 */
public class InternshipEmployee1841720085Falaah extends Employee1841720085Falaah{
    private int length;
    
    public InternshipEmployee1841720085Falaah(String name, int length){
        this.name = name;
        this.length = length;
    }

    public int getLengthFalaah() {
        return length;
    }

    public void setLengthFalaah(int length) {
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfoFalaah(){
        String info = super.getEmployeeInfoFalaah()+"\n";
        info += "Registered as internship employee for "+ length +" month/s\n";
        return info;
    }
}
