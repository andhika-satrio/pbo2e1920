/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author ASUS
 */
public class PermanentEmployee extends Employee implements Payable{
    private int salary;
    
    public PermanentEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (int) (salary+0.05*salary);
    }
    @Override
    public String getEmployee(){
        String info = super.getEmployee()+"\n";
        info += "Regitered as permanent employee with salary "+salary+"\n";
        return info;
    }
    
}
