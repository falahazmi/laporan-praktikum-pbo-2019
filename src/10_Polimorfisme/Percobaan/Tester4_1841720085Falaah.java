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
public class Tester4_1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Owner1841720085Falaah ow = new Owner1841720085Falaah();
        ElectricityBill1841720085Falaah eBill = new ElectricityBill1841720085Falaah(5, "R-1");
        ow.pay(eBill);//pay for electricity bill
        System.out.println("------------------------");
        
        PermanentEmployee1841720085Falaah pEmp = new PermanentEmployee1841720085Falaah("Dedik", 500);
        ow.pay(pEmp);//pay for payment employee
        System.out.println("------------------------");
        
        InternshipEmployee1841720085Falaah iEmp = new InternshipEmployee1841720085Falaah("Sunarto", 5);
        ow.showMyEmployee(pEmp);//show permanet employee info
        System.out.println("-------------------------");
        ow.showMyEmployee(iEmp);//show internship employee info
    }
    
}
