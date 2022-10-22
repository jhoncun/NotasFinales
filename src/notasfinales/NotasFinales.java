/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasfinales;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author JENG-PC
 */
public class NotasFinales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        float[] NotaCorte = new float[3]; 
        for(int a=0;a<=NotaCorte.length-1;a++){
           System.out.println("Digite el valor de la nota" + (a+1));
           NotaCorte[a] = leer.nextFloat();
        }      
        System.out.println("resultado" + NotaFinal(NotaCorte));
        
    }
    public static float NotaFinal(float[] notas){
            float acum = 0;
          for(int i=0;i<=notas.length-1;i++){
             if(i==2){
                 acum = acum + notas[i]*((float)0.4);                 
             }else{
                acum = acum + notas[i]*((float)0.3);
             }
         }
    
        return acum;
    }
    
    
    
}
