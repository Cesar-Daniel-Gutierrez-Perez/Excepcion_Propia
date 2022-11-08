/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_excepciones;

import java.io.IOException;

/**
 *
 * @author perez
 */
public class MenorQue10 {
    static boolean menor10 (double n) throws IOException {        
        if (n < 10){
            throw new IOException();
        }
        return false;
    }
}
