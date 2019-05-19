/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacc.examen;

import java.util.Scanner;

/**
 *
 * @author intel
 */
public class JACCmenuu {
    public static void main(String[] args) {
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        System.out.println("Segun el orden de los ejercicios");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: JACC.PrimerJACC();break;
            case 2: JACCga.main(args);break;
            case 3: JACCleer.main(args);break;
            case 4: JACCbusqued.JACC(args);break;
                                  
            default: System.out.println("Opción Inválida");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
}
}
