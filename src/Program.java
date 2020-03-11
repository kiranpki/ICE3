/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiranpreet
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee A=new Employee("Kiran", 29.5, 8.2);
        Manager B=new Manager("Ilahi", 30.56, 10.6, 1.2);
        SalesAssociate C=new SalesAssociate("Tammi", 31.83, 6.5, 2.5);
        
        System.out.printf("The Check of "+A.getName()+" is: %.2f\n",A.calculatePay());
        System.out.printf("The Check of "+B.getName()+" is: %.2f\n",B.calculatePay());
        System.out.printf("The Check of "+C.getName()+" is: %.2f\n",C.calculatePay());
    }
    
}
