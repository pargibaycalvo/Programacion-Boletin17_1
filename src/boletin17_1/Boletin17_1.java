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
public class Boletin17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        notas alum = new notas();
        
       int opcion;
        do{
        opcion= Integer.parseInt(JOptionPane.showInputDialog("1) añadir nombre y nota. \n2)notas bajas y altas \n5)visualizar. \n0) Pulse aceptar para salir."));
        switch(opcion){
            case 1:
                alum.carganomnot();
                break;
            case 2:
                alum.notamayor();
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                alum.visualizar();
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"salir");
                System.exit(0); 
                break;
            default:
                JOptionPane.showMessageDialog(null,"error");
        }
    }while(opcion!=0);
    }
        
       
                
    }
    

