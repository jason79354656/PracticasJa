
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jason
 */
public class NumbreDynamic {
    
    ArrayList<Integer[]> digits;
    int number;
    public NumbreDynamic(int number ){
        digits = new ArrayList<Integer[]>();
        this.number = number;
    }
   
    
    public int reversOrder(){
        int auxNumber = number;
        int reversNumber = 0;
        int digitNumber = 0;
        while(auxNumber > 0 ){
            digitNumber = auxNumber % 10;
            reversNumber = reversNumber*10 + digitNumber;
            auxNumber /= 10;
        }
        
        number = reversNumber;
        return number;
    }
    
   
    public int calculationDigit(int number){
        int numberaux = number;
        int nDigits = 0;    
            while(numberaux != 0){
                numberaux = numberaux/10;
                nDigits++;
            }
       
        return  nDigits; 
    }
   
    public ArrayList<Integer[]> decompositionDigit (){
       int auxNumber = number;
            while(auxNumber != 0){
               Integer[] digitPosition = new Integer[2]; 
               digitPosition[0] = auxNumber % 10;
               digitPosition[1] = calculationDigit(auxNumber);
               auxNumber = auxNumber / 10;
               digits.add(digitPosition);
            }
        return digits;
    }

    public int convertbinary(){
        String binario = "";
        int auxnumber = number;
        while(auxnumber != 0 ){
            if(auxnumber % 2 == 0){
                binario = "0" + binario;
            }else{
                binario = "1" + binario;
            }
            auxnumber = (int) auxnumber /2; 
        } 
            
        return Integer.parseInt(binario);
    }

}
