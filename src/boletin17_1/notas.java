/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ped90
 */
public class notas {
    
    alumnos[]notas=new alumnos[3];
    int[]nota = new int[3];
    //String[]nombres=new String [3];
    
    public String añadirnombre(){
        return JOptionPane.showInputDialog("Nombre :");
    }
    public int añadirnota(){
        return Integer.parseInt(JOptionPane.showInputDialog("Nota :"));
    }
    public void carganomnot(){
            for(int n=0;n<notas.length;n++){
                notas[n]=new alumnos(añadirnombre(),añadirnota());
            }  
    }
    public void visualizar(){
        for(int v=0;v<notas.length;v++)
                System.out.println(notas[v]);
        
    }
    
    public void notamayor(){
        int mayor=0;
        for (int a=0;a<notas.length;a++){
            if(nota[a]>mayor)
                mayor=nota[a];
            System.out.println("Mayor :"+nota[a]);
            }
        
        }
    }
        
    
    
    
    
    
    
    
    

   

