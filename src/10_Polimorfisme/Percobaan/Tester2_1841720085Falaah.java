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
public class Tester2_1841720085Falaah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PermanentEmployee1841720085Falaah pEmp = new PermanentEmployee1841720085Falaah("Dedik", 500);
        Employee1841720085Falaah e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfoFalaah());
        System.out.println("--------------------------");
        System.out.println(""+pEmp.getEmployeeInfoFalaah());
    }
    
}
