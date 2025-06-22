/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sony
 */
public class etudiantTest {
    
    public etudiantTest() {
    }
    
   
    @Test
    public void testCalcul() {
        System.out.println("calcul");
        int note1 = 0;
        int note2 = 0;
        etudiant instance = new etudiant ("maria",8,8);
       
        float result = instance.calcul(8,8);
        assertEquals(8, result, 0.0);
       
    }
    
}
