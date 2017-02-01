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
        opcion= Integer.parseInt(JOptionPane.showInputDialog("1) Añadir alumno.\n2) Mostrar nota alta.\n3) Mostrar media de la clase. \n4) Total de aprobados y suspensos. \n5) Buscar alumno. \n6) Nombres de aprobados. \n7) Ordenar lista. \n0) Salir."));
        switch(opcion){
            case 1:
                alum.carganotas();
                break;
            case 2:
                alum.notaalta();
                break;
            case 3:
                alum.notamediaclase();
                break;
            case 4:
                alum.aprosusp();
                break;
            case 5:
                alum.busqueda(JOptionPane.showInputDialog("Introduzca el nombre :"));
                break;
            case 6:
                alum.aprobados();
                break;
            case 7:
                alum.ordenar();
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Pulse aceptar para salir");
                System.exit(0); 
                break;
            default:
                JOptionPane.showMessageDialog(null,"Fallo");
        }
    }while(opcion!=0);
    }
        
        
        
    }

        
      
                
    
    

