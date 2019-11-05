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
public class PermanentEmployee1841720085Falaah extends Employee1841720085Falaah implements Payable1841720085Falaah {

    private int salary;

    public PermanentEmployee1841720085Falaah(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getPaymentAmountFalaah() {
        return (int) (salary+0.05*salary);
    }
    
    @Override
    public String getEmployeeInfoFalaah() {
        String info = super.getEmployeeInfoFalaah() + "\n";
        info += "Registered as internship employee for " + salary + "\n";
        return info;
    }
}
