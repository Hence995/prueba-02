/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Mi nombre es " +nombre);
        
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        System.out.println("Mi edad es " +edad);
       
        System.out.println("Ingrese su correo; ");
        String correo = leer.next();
        System.out.println("Mi correo es "+ correo);
        
        System.out.printf("Mi nombre es %s , mi edad es %d y mi correo es %s");
         // TODO code application logic here
    }
    
}
