/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Cliente;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dxnny
 */
public class Controlador {
    public void menu(){
        Scanner leer = new Scanner (System.in);
        int op=0;
        Cliente c1 = new Cliente();
        
        do {  
            System.out.println("Bienvenidos al sistema de facturacion\n"
                +"ELIJE UNA OPCIÓN\n"
                + "1 - REGISTRAR CLIENTE\n"
                + "2 - REGISTRAR PRODUCTO\n"
                + "3 - REGISTRAR PROVEEDOR\n"
                + "4 - REGISTRAR TIPO PRODUCTO\n"
                + "5 - SALIR"); 
            op = leer.nextInt();
            switch(op){
                case 1:
                    
                System.out.println("INGRESE EL NÚMERO DE CÉDULA");
                c1.setCedula(leer.next());
                System.out.println("INGRESE EL PRIMER NOMBRE DEL CLIENTE : ");
                c1.setNombre1(leer.next());
                System.out.println("INGRESE EL SEGUNDO NOMBRE DEL CLIENTE : ");
                c1.setNombre2(leer.next());
                break;
            case 2: 
                System.out.println("INGRESE EL PRIMER NOMBRE DEL CLIENTE : ");
                c1.setNombre1(leer.next());
                
                break;
            case 3:
               
                break;
            case 4:
               
                break;
            case 5:
                System.out.println("LA CEDULA DEL CLIENTE ES : " + c1.getCedula());
                break;
            case 6:
               
                break;
            case 7:
                
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"Gracias por utilizar el servicio de facturacion");
                break;
        
        }
            
        } while (op != 12);
    
       
    }
    
}
