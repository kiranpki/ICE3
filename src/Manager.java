/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiranpreet
 */
public class Manager extends Employee {
    protected double _bonus;
    
    @Override
    public String getName() {
        return _name;
    }
    
    public Manager(String name, double wage, double numHours, double bonus) {
        super(name, wage, numHours);
        _bonus= bonus;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay()+_bonus; 
    }   
}
