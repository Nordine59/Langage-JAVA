/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.in;

/**
 *
 * @author admin
 */
public class Atest

{
     public static InputStream Lireint(String message) throws IOException {
        DataInputStream clavier = new DataInputStream(System.in);
        System.out.println(message);      
         String Integer = clavier.readLine();
        return in;
        
            
            
    
    }
        
    }
}
