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
public class Owner1841720085Falaah {
    public void pay(Payable1841720085Falaah p){
        System.out.println("Total payment = "+p.getPaymentAmountFalaah());
        if(p instanceof ElectricityBill1841720085Falaah){
            ElectricityBill1841720085Falaah eb = (ElectricityBill1841720085Falaah) p;
            System.out.println(""+eb.getBillInfoFalaah());
        }else if (p instanceof PermanentEmployee1841720085Falaah){
            PermanentEmployee1841720085Falaah pe = (PermanentEmployee1841720085Falaah) p;
            pe.getEmployeeInfoFalaah();
            System.out.println(""+pe.getEmployeeInfoFalaah());
        }
    }
    public void showMyEmployee(Employee1841720085Falaah e){
        System.out.println(""+e.getEmployeeInfoFalaah());
        if(e instanceof PermanentEmployee1841720085Falaah)
            System.out.println("Yaou have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
