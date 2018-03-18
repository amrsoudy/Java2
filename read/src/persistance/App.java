/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

/**
 *
 * @author 1795162
 */
public class App {
    
    
   private String Appno ;
   private String Address;
   private String space ;
   private double rent;
   private String Disp = "O" ;
   private String client;
   

    public App(String APPNO, String ADDRESS, String SPACE, String RENT, String DISP,String client) {
        
        this.Appno=APPNO ;
        this.Address =ADDRESS;
        this.space = SPACE ;
        this.rent = Double.parseDouble(RENT);
        this.Disp = DISP;
        this.client=client;
        
        
    }

    public String getAppno() {
        return Appno;
    }

    public void setAppno(String Appno) {
        this.Appno = Appno;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getDisp() {
        return Disp;
    }

    public void setDisp(String Disp) {
        this.Disp = Disp;
    }

    @Override
    public String toString() {
        return  Appno + "  " + Address + "  " + space + "  " + rent + "  " + Disp+" "+client ;
    }
    
    
}
