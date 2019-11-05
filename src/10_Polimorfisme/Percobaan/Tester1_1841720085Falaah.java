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
public class Tester1_1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PermanentEmployee1841720085Falaah pEmp = new PermanentEmployee1841720085Falaah("Dedik", 500);
        InternshipEmployee1841720085Falaah iEmp = new InternshipEmployee1841720085Falaah("Sunarto", 5);
        ElectricityBill1841720085Falaah eBill = new ElectricityBill1841720085Falaah(5, "A-1");
        Employee1841720085Falaah e;
        Payable1841720085Falaah p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
    
}
