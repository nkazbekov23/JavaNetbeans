/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble;

/**
 *
 * @author Saikai
 */
public class Bubble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = {33, 67, 345, 767, 14, 78, -66, 98, 100, 432};
        
        int a, b, t;
        int size;
        
        size = 10; //  колличество сортируемых элементов
        
        //оторбрахить исходный массив
        System.out.println("Исходный массив");
        for(int i=0; i<10; i++)
            System.out.print(" "+nums[i]);
        System.out.println();
        
        //реализовать алгоритм пузырьковой сортировки
        for(a=1; a<size; a++)
            for(b=size-1; b>=a; b--){
                if(nums[b-1]>nums[b]){      //если требуется порядок
                                            // следования не соблуюдаются
                                            // поменять элементы местами
                    t=nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b]=t;
                }
            }
        
        //отобразить сортированный массив
        
        System.out.print("Отсортированный массив:");
            for(int i=0; i<size; i++)
                System.out.print(" "+nums[i]);
            System.out.println();
    }
    
}
