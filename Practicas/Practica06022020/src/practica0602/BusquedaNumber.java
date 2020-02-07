/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0602;

import java.util.ArrayList;

/**
 *
 * @author jason
 */
public class BusquedaNumber {
    
    
    
    public int [] searchnumbers (int []search , int []secuencial){
        int [] resultado = new int[secuencial.length]; 
        ArrayList<Integer> datos = new ArrayList<Integer>();
        
        for(int i = 0; i < resultado.length ; i++){
            datos = this.searchSecuencial(search,secuencial[i]);
            resultado[i] = datos.size();
        }
        
        return resultado;
    } 

    public int searchbinary(int []entrada,int dato){
        
        int[]arreglo = this.bubble(entrada);
        int inicio = 0;
        int fin = arreglo.length - 1;
        int posicion;
        
        while (inicio <= fin) {
            posicion = (inicio+fin) / 2;
            if ( arreglo[posicion] == dato )
                return posicion;
            else if ( arreglo[posicion] < dato ) {
                inicio = posicion+1;
            } else {
                fin = posicion-1;
            }
        }
        return 0;
    }
    
      



    public  ArrayList<Integer> searchSecuencial(int []arreglo,int dato){
        ArrayList<Integer> datos = new ArrayList<Integer>();
        int posicion = 0;
        int i = 0;
        while ( i < arreglo.length){
            if (arreglo[i] == dato){
                posicion = i;
                datos.add(posicion);
            }
            i++;
        }
 
        return datos;
    }

    public int[] bubble(int []arreglo ){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i+1; j < arreglo.length; j++) {
                if(arreglo[i] > arreglo[j]){
                int higher = arreglo[i]; 
                arreglo[i] = arreglo[j];
                arreglo[j] = higher;
                }
            }
        }
        return arreglo;
    }
}
