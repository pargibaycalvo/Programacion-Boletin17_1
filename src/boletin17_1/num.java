/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_1;


import java.util.Random;



/**
 *
 * @author ped90
 */
public class num {
    
    int[]numerosaleatorios = new int[6];
    Random ran = new Random(System.currentTimeMillis());

    
    public void random(){
        for(int r=0;r<numerosaleatorios.length;r++){
            numerosaleatorios[r] = ran.nextInt(49)+1;
        }
    }
    public void mostrarrev(){
        for(int r=numerosaleatorios.length-1;r>=0;r--)
            System.out.println("Numero :"+(r+1)+"="+numerosaleatorios[r]);
    }
    
        
        
    
}
