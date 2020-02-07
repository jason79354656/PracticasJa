
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jason
 */
public class CalculationExpected {
    private NumbreDynamic numberdynamic;
    
    public CalculationExpected(){
        Scanner reader = new Scanner(System.in);
        numberdynamic = new NumbreDynamic(reader.nextInt());
    }
    
    public static void main(String [] args){
        CalculationExpected calculationespected = new CalculationExpected();
        calculationespected.prueba();
    }
    
    
    public  void prueba(){
       ArrayList<Integer[]> aux = numberdynamic.decompositionDigit();
       for(int i=0;i<aux.size();i++){
           Integer[] aux3 = new Integer[2];
           aux3 = aux.get(i);
           for(int j= 0; j<aux3.length; j++){
               System.out.print(aux3[j]);
               System.out.print("   "); 
           }
       }
        System.out.println();
       System.out.print(numberdynamic.convertbinary());
       
       System.out.println();
       System.out.print(numberdynamic.reversOrder());
    }
      
}   
