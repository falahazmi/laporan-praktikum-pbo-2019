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
public class ElectricityBill1841720085Falaah implements Payable1841720085Falaah {
    private int kwh;
    private String category;
    
    public ElectricityBill1841720085Falaah(int kwh, String category){
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwhFalaah() {
        return kwh;
    }

    public void setKwhFalaah(int kwh) {
        this.kwh = kwh;
    }

    public String getCategoryFalaah() {
        return category;
    }

    public void setCategoryFalaah(String category) {
        this.category = category;
    }
    
    @Override
    public int getPaymentAmountFalaah() {
        return kwh*getBasePriceFalaah();
    }
    
    public int getBasePriceFalaah(){
        int bPrice = 0;
        switch(category){
            case "R-1" : bPrice = 200;break;
            case "R-2" : bPrice = 100;break;
        }
        return bPrice;
    }
    
    public String getBillInfoFalaah(){
        return "kWH = "+kwh+"\n"+
                "Category = "+ category +"("+getBasePriceFalaah()+" per kWH)\n";
    }
}
