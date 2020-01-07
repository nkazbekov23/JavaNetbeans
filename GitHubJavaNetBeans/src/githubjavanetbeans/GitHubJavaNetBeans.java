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
public class GitHubJavaNetBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      ReadClass readClass = new ReadClass();
      double one;
      double two;
      int action;
      do{
            System.out.println("Введите первое число");
          one = readClass.readNextDouble();
            System.out.println("Введите второе число");
          two = readClass.readNextDouble();

          Calculator calculator = new Calculator(one, two);

            System.out.println("Выберите действие");
            System.out.println("1. сложить");
            System.out.println("2. вычесть");
            System.out.println("3. умножить");
            System.out.println("4. разделить");
            System.out.println("5. взять остаток");
            System.out.println("0. выход из программы");
            System.out.println("Введите номер пункта");

            action = (int) readClass.readNextDouble();

            switch (action){
                case 1: System.out.println(calculator.add()); break;
                case 2: System.out.println(calculator.subs()); break;
                case 3: System.out.println(calculator.multi()); break;
                case 4: System.out.println(calculator.div()); break;
                case 5: System.out.println(calculator.mod()); break;
                case 0: break; 
                default: System.out.println("Вы выбрали не верный пункт");
        }
        
    } while  (action != 0);
    } 
}
