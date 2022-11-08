/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_excepciones;

import java.io.EOFException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author perez
 */
public class Lab_excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){       
        JOptionPane.showMessageDialog(null, division(JOptionPane.showInputDialog(null, "ingrese el entero a dividir"), JOptionPane.showInputDialog(null, "ingrese el divisor entero")));
    }
    
    public static double division(String entero, String divisor) {        
        double en=0;
        double div=0;
        double resultado=0;        
        try{
            en=Integer.parseInt(entero);            
        }
        catch(NumberFormatException ex){
            System.out.println("El entero no es un entero."+ex.getMessage());
        }   
        try{
            div=Integer.parseInt(divisor);
        }        
        catch(NumberFormatException ex){
            System.out.println("El divisor no es un entero."+ex.getMessage());
        }
        try{
            MenorQue10.menor10(en);
        }
        catch(IOException ex){
            System.out.println("El numero a dividir es menor a 10");
        }
        try{
            resultado=en/div;
        }
        catch(ArithmeticException ex){
            System.out.println("No se puede dividir entre 0."+ex.getMessage());
        }
        return resultado;
    }    
}
