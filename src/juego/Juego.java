/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import java.util.Random;
import javax.swing.*;
import java.util.*;


/**
 *
 * @author Notebook
 */
public class Juego {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Juego
        Random RD = new Random();
        int pelota = RD.nextInt(3);
        
        // imagenes
        ImageIcon BIEN = new ImageIcon("src/img/bien.png");
        ImageIcon MAL = new ImageIcon("src/img/mal.png");
        ImageIcon ICON = new ImageIcon("src/img/juego.png");
        
        System.out.print(pelota);
        int selecion = JOptionPane.showOptionDialog(null, "Encuentre la pelota", "Juego del vaso", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, ICON, new Object [] {"Vaso 1" , "Vaso 2", "Vaso 3"},"Vaso 1");
        
        
        if(pelota == selecion){
            JOptionPane.showMessageDialog(null,"GANASTE!!!","JUEGO DEL VASO",JOptionPane.INFORMATION_MESSAGE, BIEN);
        }
        else{
             JOptionPane.showMessageDialog(null,"GAME OVER!!!","JUEGO DEL VASO",JOptionPane.INFORMATION_MESSAGE, MAL);

        }
        
    }
    
}
