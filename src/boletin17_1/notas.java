/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_1;

import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author ped90
 */
public class notas {
    private final int cantidad = 30;
    
    private int[]notas=new int[cantidad];
    private String[]nombre=new String[cantidad];
    
    public void carganotas(){
        for(int i=0;i<notas.length;i++){
            nombre[i]=JOptionPane.showInputDialog("Nombre: ");
            notas[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Nota : "+(i+1)));
        }
    }
    public void aprosusp(){
        int notaalta=0, notabaja=0;
        for(int n=0;n<notas.length;n++){
            if(notas[n]>5){
                notaalta ++;
            }
            else notabaja ++;
        }
        System.out.println("Notas altas :"+notaalta);
        System.out.println("Notas bajas :"+notabaja);
              
    }
    public void notamediaclase(){
        int suma=0;
        for(int m=0;m<notas.length;m++){
            suma=suma+notas[m];
        }
        int media=suma/notas.length;
        System.out.println("La media de clase es de :"+media);
    }
    public void notaalta(){
        int max=0;
        for(int a=0;a<notas.length;a++){
            if(max<notas[a])max=notas[a];
                if(max==10)break;
            }
            System.out.println("La nota mas alta es de un :"+max);
        }
    public void busqueda(String nomB){
       for(int h=0;h<nombre.length;h++){
            if(nombre[h].equalsIgnoreCase(nomB)){
                System.out.println("La nota de :" + nombre[h] + " es de un :" + notas[h]);    
            }
            else {
            System.out.println("El nombre no aparece");
            }
        }
    }
    public void aprobados(){
        for (int a=0;a<notas.length;a++){
            if(notas[a]>=5){
                System.out.println(nombre[a]);
            }
        }
    }
    public void ordenar(){
        int[]orden=Arrays.copyOf(notas, cantidad);
        Arrays.sort(orden);
        for(int o=0;o<orden.length;o++){
            System.out.println(orden[o]);
        }
    }
    
    }
    
    
    
    
    
    
    

    
           

    
        
    
    
    
    
    
    
    
    

   

