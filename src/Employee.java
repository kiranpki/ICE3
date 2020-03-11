/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiranpreet
 */
public class Employee {

    protected String _name;
    protected double _wage;
    protected double _numHours;
    
    public String getName() {
        return _name;
    }

    public Employee(String name, double wage, double numHours) {
        _name = name;
        _wage = wage;
        _numHours = numHours;
    }
    public double calculatePay(){
        return _numHours*_wage;
    }
    
    
     
}
