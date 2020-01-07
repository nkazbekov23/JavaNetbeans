/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubjavanetbeans;

/**
 *
 * @author Saikai
 */
public class Calculator {
   private double a;
   private double b;
   
   
   public Calculator(){
       this.a = 0;
       this.b = 0;
       
   }
   public Calculator(double a, double b){
       this.a = a;
       this.b = b;
   }
   
   public double add(){
       return a + b;
   }
    public double subs(){
        return a - b;
    }
    public double multi(){
        return a * b;
    }
    public double div(){
        return a / b;
    }
    public double mod(){
        return a % b;
    }
    }

